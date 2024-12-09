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
public interface IEntrenadorDAO {

    //BUSCAR TODAS
    public List<Entrenador> mostrartodo();
    
    //INSERTAR
    public int insertar(Entrenador entrenador);
    
    //ACTUALIZAR
    public int actualizar(Entrenador entrenador);
    
    //BORRAR
    public int borrardatos(Entrenador entrenador);
    
     //CLUBS
    public List<Entrenador> clubs(int club);
}
