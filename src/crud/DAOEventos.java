package crud;

import basesdedatos.Conexion;
import objetosNegocio.Evento;
import javax.swing.JOptionPane;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.SQLException;

  // @author David Elier Campa Chaparro 245178
 
public class DAOEventos implements IDAOEventos{
    

    //  este método está pensado para consultar todos los datos de un evento al solo recibir un evento con
    // 4 atributos nombre, fecha, hora, y lugar de la table
    @Override
    public Evento consultarEvento(Evento evento) {
        Conexion conexion = new Conexion("eventospotros");
        String consulta = "select ID, Nombre, Fecha, Hora, Lugar, HorasCultura, Descripcion from eventos where Nombre = ? and Fecha = ? and Hora = ? and Lugar = ?;";
        PreparedStatement pst = null;
        ResultSet rs = null;
        Connection cn = null;
        Evento eventoConsultado = null; 

        try {
            cn = conexion.conectar();
            pst = cn.prepareStatement(consulta);
            
            pst.setString(1, evento.getNombre());
            pst.setString(2, evento.getFecha());
            pst.setString(3, evento.getHora());
            pst.setString(4, evento.getLugar());   

            rs = pst.executeQuery();
            if (rs.next()) {
                eventoConsultado = new Evento(rs.getString("ID"), rs.getString("Nombre"), rs.getString("Fecha"), rs.getString("Hora"), rs.getString("Lugar"), rs.getString("Descripcion"), rs.getString("HorasCultura"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el evento");
            }
            conexion.desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se consultó correctamente el evento" + e.toString());
        }        
        return eventoConsultado;
    }

    // método para insertar
    @Override
    public void insertarEvento(Evento evento){
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
    
    // método para eliminar
    @Override
    public void eliminarEvento(Evento evento){
        Conexion conexion = new Conexion("eventospotros");
        String eliminacion = "delete from eventos where Id = ?;";

        try {
            CallableStatement cs = conexion.conectar().prepareCall(eliminacion);
            cs.setInt(1, evento.getID());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente el evento");
            conexion.desconectar();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el evento" + e.toString());
        }        
    }
    
    // este método regresa un default table model con todos los eventos
    // está pensado para setearlo en eventosTable para mostrar sus eventos
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
   
    // está pensado para usarse el cuadro Guardar Evento del FrmEditarEvento
    @Override
    public void actualizarEvento(Evento evento){
        Conexion conexion = new Conexion("eventospotros");
        String actualizacion = "update eventos set Nombre = ?, Fecha = ?, Hora = ?, Lugar = ?, Descripcion = ?, HorasCultura = ? where ID = ?";
        
        try {
            CallableStatement cs = conexion.conectar().prepareCall(actualizacion);
            cs.setString(1, evento.getNombre());
            cs.setString(2, evento.getFecha());
            cs.setString(3, evento.getHora());
            cs.setString(4, evento.getLugar());
            cs.setString(5, evento.getDescripcion());
            cs.setInt(6, evento.getHorasCultura());
            cs.setInt(7, evento.getID());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se ha actualizado correctamente el evento");
            conexion.desconectar();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el evento" + e.toString());
        }        
        
    }

}
