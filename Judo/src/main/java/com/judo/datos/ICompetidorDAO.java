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
public interface ICompetidorDAO {
   
    //BUSCAR TODAS
    public List<Competidor> mostrartodo();
    
    //INSERTAR
    public int insertar(Competidor competidor);
    
    //ACTUALIZAR
    public int actualizar(Competidor competidor);
    
    //BORRAR
    public int borrardatos(Competidor competidor);
    
    //RANKING
    public List<Competidor> ranking(int peso);
    
    //CLUBS
    public List<Competidor> clubs(int club);
     
    //RANKING
    public List<Competidor> lista(int peso);
}
