/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.judo.dominio;

/**
 *
 * @author Alumno Mañana
 */
public class Entrenador extends Club{
    private int id_entrenador;
    private String nombre;
    private String apellido;
    
    //CONSTRUCTORES

    public Entrenador() {
    }

    public Entrenador(int id_entrenador) {
        this.id_entrenador = id_entrenador;
    }

    public Entrenador(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Entrenador(int id_entrenador, String nombre, String apellido) {
        this.id_entrenador = id_entrenador;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Entrenador(int id_entrenador, String nombre, String apellido, int id_club) {
        super(id_club);
        this.id_entrenador = id_entrenador;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //GUETER Y SETER

    public int getId_entrenador() {
        return id_entrenador;
    }

    public void setId_entrenador(int id_entrenador) {
        this.id_entrenador = id_entrenador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    //TO STRING

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Entrenador{id_entrenador=").append(id_entrenador);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append('}');
        return sb.toString();
    }
   
}
