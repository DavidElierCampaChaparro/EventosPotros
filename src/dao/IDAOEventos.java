/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import entidades.Eventos;
/**
 *
 * @author crazy
 */
public interface IDAOEventos {
    public void insertarEvento(Eventos evento);
    public void eliminarEvento(int ID);
    
}
