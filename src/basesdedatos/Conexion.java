/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basesdedatos;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author David Elier Campa Chaparro 245178
 */
public class Conexion {
    String bd = "";
    String url = "jdbc:mysql://localhost:3306/";
    String user = "root";
    String password = "xr471112";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection cx;
    
    public Conexion(String bd){
        this.bd = bd;
    }
    
    public Connection conectar(){
        try {
            Class.forName(driver);
            cx = DriverManager.getConnection(url+bd, user, password);
            System.out.println("se conectó a la base de datos "+ bd);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("no se pudo conectar a la base de datos "+ bd);
        }
        return cx;
    }
    
    public Connection getConnection(){
        return cx;
    }
    
    public void desconectar(){
        try {
            cx.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
    

