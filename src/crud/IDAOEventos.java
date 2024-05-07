package crud;
import objetosNegocio.Evento;
import javax.swing.table.DefaultTableModel;


//@autor David Elier Campa Chaparro 245178 - Maximiliano Reyna Aguilar 244877

public interface IDAOEventos {
    public Evento consultarEvento(Evento evento);
    public void insertarEvento(Evento evento);
    public void eliminarEvento(Evento evento);
    public DefaultTableModel mostrarEventos();
    public void actualizarEvento(Evento evento);
    
}
