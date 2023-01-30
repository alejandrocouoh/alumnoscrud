/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.alumnosCRUD.alumnosCRUD.service;

import com.example.alumnosCRUD.alumnosCRUD.modelo.Persona;
import com.example.alumnosCRUD.alumnosCRUD.repositorio.PersonaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alejandro Couoh Haas <your.name at your.org>
 */
@Service
public class PersonaService {

    @Autowired
    private final PersonaRepositorio repositorioPersona;

    public PersonaService(PersonaRepositorio reppsitorioPersona) {
        this.repositorioPersona = reppsitorioPersona;
    }
    
    public List<Persona> allPersonas() {
        return repositorioPersona.findAll();
    }

    public Persona porIdPersona(Long id) {
        return repositorioPersona.findById(id).get();
    }

    public Persona guardarPersona(Persona persona) {
        return repositorioPersona.save(persona);
    }

    public Persona actualizarPersona(Persona persona) {
//        Persona update = repositorio_persona.findById(persona.getId()).get();
//        update.setNombre(persona.getNombre());
//        update.setApellidos(persona.getApellidos());
//        update.setSexo(persona.isSexo());
        return repositorioPersona.save(persona);
    }

    public void eliminarPersona(Long id) {
        repositorioPersona.deleteById(id);
    }
}
