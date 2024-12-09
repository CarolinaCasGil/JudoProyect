/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.judo.datos;

import com.judo.dominio.Arbitro;
import com.judo.dominio.*;
import static com.judo.datos.Conexion.close;
import static com.judo.datos.Conexion.conectarbase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alumno Mañana
 */
public class ArbitroDAO implements IArbitroDAO{
    
    //CONSULTAS
    private static final String SQL_SELECT = "SELECT * FROM arbitro";
    private static final String SQL_INSERT = "INSERT INTO arbitro(nombre, apellido) VALUES (?, ?)";
    private static final String SQL_UPDATE = "UPDATE  arbitro SET nombre = ?, apellido = ? WHERE id_arbi = ?";
    private static final String SQL_DELETE = "DELETE FROM arbitro WHERE id_arbi = ?";
    

    //##############################METODOS PARA LAS CONSULTAS#########################
    //METODO PARA OBTENER TODAS LAS COMPETICIONES
    public List<Arbitro> mostrartodo() {

        Connection conn = null;
        Statement ins = null;
        ResultSet res = null;
        List<Arbitro> arbitros = new ArrayList<>();
        
        try {
            conn = conectarbase();
            ins = conn.createStatement();
            res = ins.executeQuery(SQL_SELECT);

            while (res.next()) {
                arbitros.add(new Arbitro(res.getInt("id_arbi"), res.getString("nombre"), res.getString("apellido")));
            }

        } catch (Exception e) {
            Logger.getLogger(ArbitroDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try {
                close(res);
                close(ins);
                close(conn);
            } catch (Exception e) {
                Logger.getLogger(ArbitroDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return arbitros;

    }
    
     //INSERTAR DAOTS
    @Override
    public int insertar(Arbitro arbi){
    
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try {
            conn = conectarbase();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, arbi.getNombre());
            stmt.setString(2, arbi.getApellido());
            

           registros = stmt.executeUpdate();
            
            
        } catch (Exception e) {
            Logger.getLogger(ArbitroDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try {
                close(stmt);
                close(conn);
            } catch (Exception e) {
                Logger.getLogger(ArbitroDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        
        
        return registros;
    
        
    }
    
    //ACTUALIZAR DATOS
    @Override
    public int actualizar(Arbitro arbi){
    
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try {
            conn = conectarbase();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, arbi.getNombre());
            stmt.setString(2, arbi.getApellido());
            stmt.setInt(3, arbi.getId_arbitro());

           registros = stmt.executeUpdate();
            
            
        } catch (Exception e) {
            Logger.getLogger(ArbitroDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try {
                close(stmt);
                close(conn);
            } catch (Exception e) {
                Logger.getLogger(ArbitroDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        
        
        return registros;
     
    }
    
    //BORRAR DATOS
    @Override
    public int borrardatos(Arbitro arbi) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try {
            conn = conectarbase();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, arbi.getId_arbitro());
            
            registros = stmt.executeUpdate();
            
        } catch (Exception e) {
            Logger.getLogger(ArbitroDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try {
                close(stmt);
                close(conn);
            } catch (Exception e) {
                Logger.getLogger(ArbitroDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return registros;

    }

   
}
