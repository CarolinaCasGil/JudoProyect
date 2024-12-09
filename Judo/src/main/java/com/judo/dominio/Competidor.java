/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.judo.dominio;

import static com.mycompany.judo.Judo.*;
import java.util.ArrayList;

/**
 *
 * @author Alumno Mañana
 */
public class Competidor extends Club {

    private int id_competidor;
    private String usuario;
    private String nombre;
    private String apellido;
    private String clave;
    private int puntos;
    private int peso;
    private Tecnica tecnicas[] = new Tecnica[2];

    //CONSTRUCTORES
    public Competidor() {
    }

    public Competidor(int id_competidor) {
        this.id_competidor = id_competidor;
    }

    public Competidor(String usuario, String nombre, String apellido, String clave, int puntos, int peso) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
        this.puntos = puntos;
        this.peso = peso;
    }

    public Competidor(int id_competidor, String usuario, String nombre, String apellido, String clave, int puntos, int id_club, int peso) {
        super(id_club);
        this.id_competidor = id_competidor;
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
        this.puntos = puntos;
        this.peso = peso;
    }

    public Competidor(String usuario, String nombre, String apellido, String clave, int peso) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
        this.peso = peso;
    }

    public Competidor(int id_competidor, String usuario, String nombre, String apellido, String clave, int peso) {
        this.id_competidor = id_competidor;
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
        this.peso = peso;
    }

    //GUETER Y SETTER
    public int getId_competidor() {
        return id_competidor;
    }

    public void setId_competidor(int id_competidor) {
        this.id_competidor = id_competidor;
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

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Tecnica[] getTecnicas() {
        return tecnicas;
    }

    public void setTecnicas(Tecnica[] tecnicas) {
        this.tecnicas = tecnicas;
    }

    //TO STRING
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Competidor{id_competidor=").append(id_competidor);
        sb.append(", usuario=").append(usuario);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", clave=").append(clave);
        sb.append(", puntos=").append(puntos);
        sb.append(", peso=").append(peso);
        sb.append(", tecnicas=").append(tecnicas);
        sb.append('}');
        return sb.toString();
    }

    //RELLENAR TECNICAS
    public void relleno_tecnicas(ArrayList<Tecnica> tecnica) {

        int num = (int) (Math.random() * 9);

        for (int i = 0; i < 2; i++) {
            tecnicas[i] = tecnica.get((num));
            while (tecnica.get(num).getNombre().equals(tecnicas[i].getNombre())) {
                num = (int) (Math.random() * 9);
            }
        }

    }

}
