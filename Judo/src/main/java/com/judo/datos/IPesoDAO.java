/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.judo.datos;

import com.judo.dominio.*;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
public interface IPesoDAO {
    
    //BUSCAR TODAS
    public List<Peso> mostrartodo();
    
    //INSERTAR
    public int insertar(Peso peso);
    
    //ACTUALIZAR
    public int actualizar(Peso peso);
    
    //BORRAR
    public int borrardatos(Peso peso);
}
