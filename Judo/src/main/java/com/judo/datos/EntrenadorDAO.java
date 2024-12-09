/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.judo.datos;

import com.judo.dominio.Entrenador;
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
public class EntrenadorDAO implements IEntrenadorDAO {

    //VARIABLES
    private static final String SQL_SELECT = "SELECT * FROM entrenador";
    private static final String SQL_INSERT = "INSERT INTO entrenador(nombre, apellido, id_club) VALUES (?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE  entrenador SET nombre = ?, apellido = ?, id_club = ? WHERE id_entrenador = ?";
    private static final String SQL_DELETE = "DELETE FROM entrenador WHERE id_entrenador = ?";
    private static final String SQL_CLUB= "SELECT * FROM entrenador WHERE id_club = ?";

    //CONSULTAS
    //##############################METODOS PARA LAS CONSULTAS#########################
    //METODO PARA OBTENER TODAS LAS COMPETICIONES
    public List<Entrenador> mostrartodo() {

        Connection conn = null;
        Statement ins = null;
        ResultSet res = null;
        List<Entrenador> entrnadores = new ArrayList<>();

        try {
            conn = conectarbase();
            ins = conn.createStatement();
            res = ins.executeQuery(SQL_SELECT);

            while (res.next()) {
                entrnadores.add(new Entrenador(res.getInt("id_entrenador"), res.getString("nombre"), res.getString("apellido"), res.getInt("id_club")));
            }

        } catch (Exception e) {
            Logger.getLogger(EntrenadorDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                close(res);
                close(ins);
                close(conn);
            } catch (Exception e) {
                Logger.getLogger(EntrenadorDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return entrnadores;

    }
    
    //INSERTAR DAOTS
    @Override
    public int insertar(Entrenador entrenador){
    
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try {
            conn = conectarbase();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, entrenador.getNombre());
            stmt.setString(2, entrenador.getApellido());
            stmt.setInt(3, entrenador.getId_club());


           registros = stmt.executeUpdate();
            
            
        } catch (Exception e) {
            Logger.getLogger(EntrenadorDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try {
                close(stmt);
                close(conn);
            } catch (Exception e) {
                Logger.getLogger(EntrenadorDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        
        
        return registros;
    
        
    }
    
    //ACTUALIZAR DATOS
    @Override
    public int actualizar(Entrenador entrenador){
    
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try {
            conn = conectarbase();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, entrenador.getNombre());
            stmt.setString(2, entrenador.getApellido());
            stmt.setInt(3, entrenador.getId_club());
            stmt.setInt(4, entrenador.getId_entrenador());

           registros = stmt.executeUpdate();
            
            
        } catch (Exception e) {
            Logger.getLogger(EntrenadorDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try {
                close(stmt);
                close(conn);
            } catch (Exception e) {
                Logger.getLogger(EntrenadorDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        
        
        return registros;
     
    }
  
    
    //BORRAR DATOS
    @Override
    public int borrardatos(Entrenador entrenador) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try {
            conn = conectarbase();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, entrenador.getId_entrenador());
            
            registros = stmt.executeUpdate();
            
        } catch (Exception e) {
            Logger.getLogger(EntrenadorDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try {
                close(stmt);
                close(conn);
            } catch (Exception e) {
                Logger.getLogger(EntrenadorDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return registros;

    }
    
    
    //RELLENAR CLUBS
    @Override
     public List<Entrenador> clubs(int club) {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet res = null;
        List<Entrenador> clubs = new ArrayList<>();

        try {
    
            conn = conectarbase();
            stmt = conn.prepareStatement(SQL_CLUB);
            stmt.setInt(1, club);
            res = stmt.executeQuery();
            
            while (res.next()) {
                clubs.add(new Entrenador(res.getInt("id_entrenador"), res.getString("nombre"), res.getString("apellido"), res.getInt("id_club")));
            }

        } catch (Exception e) {
            Logger.getLogger(CompetidorDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                close(res);
                close(stmt);
                close(conn);
            } catch (Exception e) {
                Logger.getLogger(CompetidorDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return clubs;

    }
}
