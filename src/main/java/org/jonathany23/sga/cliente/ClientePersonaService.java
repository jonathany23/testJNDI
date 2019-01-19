package org.jonathany23.sga.cliente;

import org.jonathany23.sga.domain.Persona;
import org.jonathany23.sga.servicio.PersonaServiceRemote;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.List;

public class ClientePersonaService {
    public static void main(String[] args){
        System.out.println("Iniciando llamada al EJB desde el cliente\n");

        try{
            Context jdni = new InitialContext();
            PersonaServiceRemote personaService =
                    (PersonaServiceRemote) jdni.lookup("java:global/sga-jee/PersonaServiceImpl!org.jonathany23.sga.servicio.PersonaServiceRemote");

            List<Persona> personas =personaService.listarPersonas();

            for (Persona persona: personas) {
                System.out.println(persona);
            }

            System.out.println("\nFin llamada al EJB desde el cliente");
        } catch (NamingException e){
            e.printStackTrace(System.out);
        }
    }
}
