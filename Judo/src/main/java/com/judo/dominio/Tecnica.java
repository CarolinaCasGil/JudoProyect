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
public class Tecnica {
    private int id_tecnica;
    private String nombre;
    private int probabilidad;
    private int defensa;

    //CONSTRUCTORES
    public Tecnica() {
    }

    public Tecnica(int id_tecnica) {
        this.id_tecnica = id_tecnica;
    }

    public Tecnica(String nombre, int probabilidad, int defensa) {
        this.nombre = nombre;
        this.probabilidad = probabilidad;
        this.defensa = defensa;
    }

    public Tecnica(int id_tecnica, String nombre, int probabilidad, int defensa) {
        this.id_tecnica = id_tecnica;
        this.nombre = nombre;
        this.probabilidad = probabilidad;
        this.defensa = defensa;
    }
    
    //GUETTER Y SETTER

    public int getId_tecnica() {
        return id_tecnica;
    }

    public void setId_tecnica(int id_tecnica) {
        this.id_tecnica = id_tecnica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(int probabilidad) {
        this.probabilidad = probabilidad;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
    
    //TO STRING

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tecnica{id_tecnica=").append(id_tecnica);
        sb.append(", nombre=").append(nombre);
        sb.append(", probabilidad=").append(probabilidad);
        sb.append(", defensa=").append(defensa);
        sb.append('}');
        return sb.toString();
    }
    
    
}
