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
public interface ICompeticionDAO {
    
    //NO CONTIENEN CODIGO
    
    //METODO PARA BUSCAR POR NOMBRE
    public void buscarpornombre(String nombre);
    
    //BUSCAR TODAS
    public List<Competicion> mostrartodo();
    
    //INSERTAR
    public int insertar(Competicion compe);
    
    //ACTUALIZAR
    public int actualizar(Competicion compe);
    
    //BORRAR
    public int borrardatos(Competicion compe);   
    
}
