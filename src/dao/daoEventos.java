/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import basesdedatos.Conexion;
import entidades.Eventos;
import javax.swing.JOptionPane;
import java.sql.CallableStatement;

/**
 *
 * @author David Elier Campa Chaparro 245178
 */
public class DAOEventos implements IDAOEventos{
    
    
    
    @Override
    public void insertarEvento(Eventos evento){
        
        Conexion conexion = new Conexion("eventospotros");
        
        String insercion = "insert into eventos(Nombre, Fecha, Hora, Descripcion, Lugar, HorasCultura) values (?, ?, ?, ?, ?, ?);";
        try {
            CallableStatement cs = conexion.conectar().prepareCall(insercion);
            cs.setString(1, evento.getNombre());
            cs.setString(2, evento.getFecha());
            cs.setString(3, evento.getHora());
            cs.setString(4, evento.getDescripcion());
            cs.setString(5, evento.getLugar());
            cs.setInt(6, evento.getHorasCultura());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se ha insertado correctamente el evento");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo insertar el evento" + e.toString());
        }
        
        
    }
    
    @Override
    public void eliminarEvento(int ID) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
}
