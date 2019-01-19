package org.jonathany23.sga.servicio;

import org.jonathany23.sga.domain.Persona;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface PersonaServiceRemote {

    public List<Persona> listarPersonas();

    public Persona buscarPersonaPorId(Persona persona);

    public Persona buscarPersonaPorEmail(Persona persona);

    public void registrarPersona(Persona persona);

    public void modificarPersona(Persona persona);

    public void eliminarPersona(Persona persona);
}
