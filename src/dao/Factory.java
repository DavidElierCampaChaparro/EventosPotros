/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;




 // @author David Elier Campa Chaparro 245178 - Maximiliano Reyna Aguilar 244877
 
public class Factory {
    private static IDAOEventos eventos;
    private static IDAOPersonas personas;
    
    public static IDAOEventos getEventos() {
        return (eventos == null) ? (eventos = new DAOEventos()) : eventos;
    }
    
    public static IDAOPersonas getPersonas(){
        return (personas == null) ? (personas = new DAOPersonas()) : personas;
    }
    
}
