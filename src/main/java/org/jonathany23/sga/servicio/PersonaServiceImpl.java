package org.jonathany23.sga.servicio;


import org.jonathany23.sga.domain.Persona;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote {

    @Override
    public List<Persona> listarPersonas() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1, "Carlos", "Prueba1", "Apellido2", "test@gmail.com", "12345678"));
        personas.add(new Persona(2, "Pedro", "Prueba2", "Apellido2", "test2@gmail.com", "12345676"));
        return personas;
    }

    @Override
    public Persona buscarPersonaPorId(Persona persona) {
        return null;
    }

    @Override
    public Persona buscarPersonaPorEmail(Persona persona) {
        return null;
    }

    @Override
    public void registrarPersona(Persona persona) {

    }

    @Override
    public void modificarPersona(Persona persona) {

    }

    @Override
    public void eliminarPersona(Persona persona) {

    }
}
