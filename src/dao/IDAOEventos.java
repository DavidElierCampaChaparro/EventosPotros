package dao;
import entidades.Eventos;


//@autor David Elier Campa Chaparro 245178 - Maximiliano Reyna Aguilar 244877

public interface IDAOEventos {
    public void insertarEvento(Eventos evento);
    public void eliminarEvento(int ID);
    
}
