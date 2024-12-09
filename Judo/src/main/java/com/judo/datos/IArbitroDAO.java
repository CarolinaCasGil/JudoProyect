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
public interface IArbitroDAO {
 
    //BUSCAR TODAS
    public List<Arbitro> mostrartodo();
    
    //INSERTAR
    public int insertar(Arbitro arbi);
    
    //ACTUALIZAR
    public int actualizar(Arbitro arbi);
    
    //BORRAR
    public int borrardatos(Arbitro arbi);
    
}
