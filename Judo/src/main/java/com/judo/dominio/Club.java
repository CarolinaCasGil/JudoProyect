/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.judo.dominio;

import java.util.logging.Logger;

/**
 *
 * @author Alumno Mañana
 */
public class Club {
    private int id_club;
    private String nombre;
    private String ciudad;
    
    //CONSTRUCTORES
    public Club() {
    }

    public Club(int id_club) {
        this.id_club = id_club;
    }

    public Club(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public Club(int id_club, String nombre, String ciudad) {
        this.id_club = id_club;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    //GUETER Y SETTER
    public int getId_club() {
        return id_club;
    }

    public void setId_club(int id_club) {
        this.id_club = id_club;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    //TO STRING

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Club{id_club=").append(id_club);
        sb.append(", nombre=").append(nombre);
        sb.append(", ciudad=").append(ciudad);
        sb.append('}');
        return sb.toString();
    }
    
    
}
