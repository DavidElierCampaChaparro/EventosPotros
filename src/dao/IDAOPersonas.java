package dao;

import entidades.Personas;


// @autor David Elier Campa Chaparro 245178 - Maximiliano Reyna Aguilar 244877

public interface IDAOPersonas {
    public Personas consultarPersonaLogin(String Id, String contrasena);
    public Personas consultarPersona(int ID);
    
    
}
