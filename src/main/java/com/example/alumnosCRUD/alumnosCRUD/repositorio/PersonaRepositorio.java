/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.alumnosCRUD.alumnosCRUD.repositorio;

import com.example.alumnosCRUD.alumnosCRUD.modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Alejandro Couoh Haas <your.name at your.org>
 */
@Repository
public interface PersonaRepositorio extends JpaRepository<Persona, Long>{
    
}
