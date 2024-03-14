/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 *
 * @author Felipe
 */

@Entity
@Table (name = "persona")
public class Persona {
    
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    
    
    private Pais pais;
    private Estado estado;
    
}
