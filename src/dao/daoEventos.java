/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import basesdedatos.Conexion;
import entidades.Eventos;
import javax.swing.JTextField;

/**
 *
 * @author David Elier Campa Chaparro 245178
 */
public class daoEventos {
    
    Conexion conexion = new Conexion("cia");
    
    
    public void insertarEvento(JTextField paramNombre, JTextField paramFecha, JTextField paramHora, JTextField paramLugar, JTextField paramDescripcion, JTextField paramHorasCultura){
        Eventos evento = new Eventos(paramNombre, paramFecha, paramHora, paramLugar, paramDescripcion, paramHorasCultura);
        
        
    }
    
    
    
}
