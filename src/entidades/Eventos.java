/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author David Elier Campa Chaparro
 */
public class Eventos {
    int ID;
    String Nombre;
    String Fecha;
    String Hora;
    String Lugar;
    String Descripcion;
    int HorasCultura;
    
    public Eventos(){
        
    }

    public Eventos(String Nombre, String Fecha, String Hora, String Lugar, String Descripcion, String HorasCultura) {
        this.Nombre = Nombre;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.Lugar = Lugar;
        this.Descripcion = Descripcion;
        this.HorasCultura = Integer.parseInt(HorasCultura);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getHorasCultura() {
        return HorasCultura;
    }

    public void setHorasCultura(int HorasCultura) {
        this.HorasCultura = HorasCultura;
    }
    
    
    
}
