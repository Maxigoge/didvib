package com.example.demo.Service;

import com.example.demo.Entity.Persona;

import java.util.List;

public interface PersonaService {

    public List<Persona> ConsultarPersonas();
    public Persona CrearPersona(Persona persona);
    public Persona modificarPersona(Persona persona);
    public Persona BuscarPersona(int id);
    public void EliminarPersona(int id);

}
