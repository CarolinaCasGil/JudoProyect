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
public class Competicion {
    private int id_copa;
    private String nombre;
    private String ciudad;
    private String mes;

    //CONSTRUCTORES
    public Competicion() {
    }

    public Competicion(String nombre, String ciudad, String mes) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.mes = mes;
    }


    public Competicion(int id_copa, String nombre, String ciudad, String mes) {
        this.id_copa = id_copa;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.mes = mes;
    }


    public Competicion(int id_copa) {
        this.id_copa = id_copa;
    }
    
    
    //GETER Y SETER

    public int getId() {
        return id_copa;
    }

    public void setId(int id) {
        this.id_copa = id;
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

    public int getId_copa() {
        return id_copa;
    }

    public void setId_copa(int id_copa) {
        this.id_copa = id_copa;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
    
    //TO STRING

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Competicion{id_copa=").append(id_copa);
        sb.append(", nombre=").append(nombre);
        sb.append(", ciudad=").append(ciudad);
        sb.append(", mes=").append(mes);
        sb.append('}');
        return sb.toString();
    }

    
    
    
    
}
