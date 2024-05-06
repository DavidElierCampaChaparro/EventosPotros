package dao;

import basesdedatos.Conexion;
import entidades.Eventos;
import javax.swing.JOptionPane;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.SQLException;

  // @author David Elier Campa Chaparro 245178
 
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
            conexion.desconectar();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo insertar el evento" + e.toString());
        }        
    }
    
    @Override
    public void eliminarEvento(Eventos evento){
        Conexion conexion = new Conexion("eventospotros");
        String eliminacion = "delete from eventos where IdEvento = ?;";

        try {
            CallableStatement cs = conexion.conectar().prepareCall(eliminacion);
            //cs.setInt(1, evento);
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente el evento");
            conexion.desconectar();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el evento" + e.toString());
        }        
    }
    
    @Override
    public DefaultTableModel mostrarEventos(){
        String[] nombresColumnas = {"Nombre", "Fecha", "Hora", "Lugar"};
        String[] registros = new String[4];
        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);
        
        
        Conexion conexion = new Conexion("eventospotros");
        
        String sql = "select * from eventos;";
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try{
            cn = conexion.conectar();
            pst = cn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()){
                registros[0] = rs.getString("Nombre");
                registros[1] = rs.getString("Fecha");
                registros[2] = rs.getString("Hora");
                registros[3] = rs.getString("Lugar");
                modelo.addRow(registros);
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos");
        }
        
        finally{
            try{
                if(rs != null) rs.close();
                if(pst != null) pst.close();
                if(cn != null) cn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
        
        return modelo;
    }

    
    
    



    
}
