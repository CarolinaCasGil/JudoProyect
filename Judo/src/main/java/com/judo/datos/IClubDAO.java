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
public interface IClubDAO {
    
    //BUSCAR TODAS
    public List<Club> mostrartodo();
    
    //INSERTAR
    public int insertar(Club club);
    
    //ACTUALIZAR
    public int actualizar(Club club);
    
    //BORRAR
    public int borrardatos(Club club);
}
