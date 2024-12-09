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
public class Peso {
    private int id_peso;
    private int peso;
    
    //CONSTRUCTOR
    public Peso() {
    }
    
    public Peso(int id_peso) {
        this.id_peso = id_peso;
    }

    public Peso(int id_peso, int peso) {
        this.id_peso = id_peso;
        this.peso = peso;
    }

   //GUETTER Y SETTER

    public int getId_peso() {
        return id_peso;
    }

    public void setId_peso(int id_peso) {
        this.id_peso = id_peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    //TO STRING 

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Peso{id_peso=").append(id_peso);
        sb.append(", peso=").append(peso);
        sb.append('}');
        return sb.toString();
    }
    
    
}
