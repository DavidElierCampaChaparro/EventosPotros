/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author crazy
 */
public class Factory {
    private static IDAOEventos eventos;
    public static IDAOEventos getEventos() {
        return (eventos == null) ? (eventos = new DAOEventos()) : eventos;
    }
}
