/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.alumnosCRUD.alumnosCRUD.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Alejandro Couoh Haas <your.name at your.org>
 */
@Entity
@Table(name = "Persona")
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombres", nullable = false)
    private String nombres;
    @Column(name = "edad")
    private Integer edad;
    @Column (name = "nacimiento")
    private String nacimiento;
    @Column (name = "inscripcion")
    private String inscripcion;
    @Column (name = "costo")
    private double costo;
    
    public Persona() {
    }

    public Persona(Long id, String nombres, Integer edad, String nacimiento, String inscripcion, double costo) {
        this.id = id;
        this.nombres = nombres;
        this.edad = edad;
        this.nacimiento = nacimiento;
        this.inscripcion = inscripcion;
        this.costo = costo;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getInscripcion() {
        return inscripcion;
    }

    public void setInscripcion(String inscripcion) {
        this.inscripcion = inscripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
}
