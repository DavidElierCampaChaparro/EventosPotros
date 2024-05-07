package crud;

import objetosNegocio.Persona;


// @autor David Elier Campa Chaparro 245178 - Maximiliano Reyna Aguilar 244877

public interface IDAOPersonas {
    public Persona consultarPersonaLogin(String Id, String contrasena);
    public Persona consultarPersona(int ID);
}
