package entidades;


 // @author David Elier Campa Chaparro 245178 - Maximiliano Reyna Aguilar 244877
 
public class Personas {


    int ID;
    String Nombre;
    int HorasCultura;
    String contrasena;
    boolean esAdmin;
    
    public Personas() {
    }

    public Personas(int ID, String Nombre, int HorasCultura, String contrasena, boolean esAdmin) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.HorasCultura = HorasCultura;
        this.contrasena = contrasena;
        this.esAdmin = esAdmin;
    }
    
        public int getID() {
        return ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getHorasCultura() {
        return HorasCultura;
    }

    public String getContrasena() {
        return contrasena;
    }

    public boolean isEsAdmin() {
        return esAdmin;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setHorasCultura(int HorasCultura) {
        this.HorasCultura = HorasCultura;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setEsAdmin(boolean esAdmin) {
        this.esAdmin = esAdmin;
    }
    
}
