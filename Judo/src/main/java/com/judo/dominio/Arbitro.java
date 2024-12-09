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
public class Arbitro{
    
    private int id_arbitro;
    private String nombre;
    private String apellido;

    //CONTRUCTORES
    public Arbitro() {
    }

    public Arbitro(int id_arbitro) {
        this.id_arbitro = id_arbitro;
    }

    public Arbitro(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Arbitro(int id_arbitro, String nombre, String apellido) {
        this.id_arbitro = id_arbitro;
        this.nombre = nombre;
        this.apellido = apellido;
    }
   
    //GETER Y SETER

    public int getId_arbitro() {
        return id_arbitro;
    }

    public void setId_arbitro(int id_arbitro) {
        this.id_arbitro = id_arbitro;
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
        sb.append("Arbitro{id_arbitro=").append(id_arbitro);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
