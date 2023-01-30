/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.alumnosCRUD.alumnosCRUD.controlador;

import com.example.alumnosCRUD.alumnosCRUD.modelo.Persona;
import com.example.alumnosCRUD.alumnosCRUD.service.PersonaService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Alejandro Couoh Haas <your.name at your.org>
 */
@Controller
@RequestMapping("/v1/")
public class PersonaControlador {
    private final PersonaService personaServicio;

    public PersonaControlador(PersonaService personaServicio) {
        this.personaServicio = personaServicio;
    }
    
    @GetMapping("/personas")
    public String listarPersonas(Model modelo){
        List<Persona> personas = personaServicio.allPersonas();
        modelo.addAttribute("personas", personas);
        return "ListarPersonas";
    }
    
    @GetMapping("/agregarPersona")
    public String nuevaPersona(Model model){
        Persona persona = new Persona();
        model.addAttribute("persona", persona);
        return "nuevaPersona";
    }
    
    @GetMapping("/actualizarPersona/{id}")
    public String actualizarPersona(@PathVariable("id") Long id, Model model){
        Persona persona = personaServicio.porIdPersona(id);
        model.addAttribute("actualizarPersona", persona);
        return "editarPersona";
    }
    
    @PostMapping("/agregarPersona")
    public String agregarPersona(@ModelAttribute("persona") Persona persona){
        personaServicio.guardarPersona(persona);
        return "redirect:/v1/personas";
    }
    
    @PostMapping("/actualizarPersona/{id}")
    public String actualizarPersona(@PathVariable Long id, Persona persona){
        Persona personaExistente = personaServicio.porIdPersona(id);
        personaExistente.setNombres(persona.getNombres());
        personaExistente.setEdad(persona.getEdad());
        personaExistente.setNacimiento(persona.getNacimiento());
        personaExistente.setInscripcion(persona.getInscripcion());
        personaServicio.actualizarPersona(personaExistente);
        return "redirect:/v1/personas";
    }
    
    @GetMapping("/eliminarPersona/{id}")
    public String eliminarPersona(@PathVariable ("id") Long id){
        personaServicio.eliminarPersona(id);
        return "redirect:/v1/personas";
    }
}
