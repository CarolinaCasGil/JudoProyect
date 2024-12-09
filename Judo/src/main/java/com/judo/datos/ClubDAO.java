/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.judo.datos;

import com.judo.dominio.Club;
import com.judo.dominio.Competicion;
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
public class ClubDAO implements IClubDAO{

    private static final String SQL_SELECT = "SELECT * FROM club";
    private static final String SQL_INSERT = "INSERT INTO club(nombre, ciudad) VALUES (?, ?)";
    private static final String SQL_UPDATE = "UPDATE  club SET nombre = ?, ciudad = ? WHERE id_club = ?";
    private static final String SQL_DELETE = "DELETE FROM club WHERE id_club = ?";

    //CONSULTAS
    //##############################METODOS PARA LAS CONSULTAS#########################
    //METODO PARA OBTENER TODAS LAS COMPETICIONES
    public List<Club> mostrartodo() {

        Connection conn = null;
        Statement ins = null;
        ResultSet res = null;
        List<Club> clubs = new ArrayList<>();

        try {
            conn = conectarbase();
            ins = conn.createStatement();
            res = ins.executeQuery(SQL_SELECT);

            while (res.next()) {
                clubs.add(new Club(res.getInt("id_club"), res.getString("nombre"), res.getString("ciudad")));
            }

        } catch (Exception e) {
            Logger.getLogger(ClubDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                close(res);
                close(ins);
                close(conn);
            } catch (Exception e) {
                Logger.getLogger(ClubDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return clubs;

    }

    //INSERTAR DAOTS
    @Override
    public int insertar(Club club){
    
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try {
            conn = conectarbase();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, club.getNombre());
            stmt.setString(2, club.getCiudad());
            

           registros = stmt.executeUpdate();
            
            
        } catch (Exception e) {
            Logger.getLogger(ClubDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try {
                close(stmt);
                close(conn);
            } catch (Exception e) {
                Logger.getLogger(ClubDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        
        
        return registros;
    
        
    }
    
    //ACTUALIZAR DATOS
    @Override
    public int actualizar(Club club){
    
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try {
            conn = conectarbase();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, club.getNombre());
            stmt.setString(2, club.getCiudad());
            stmt.setInt(3, club.getId_club());

           registros = stmt.executeUpdate();
            
            
        } catch (Exception e) {
            Logger.getLogger(ClubDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try {
                close(stmt);
                close(conn);
            } catch (Exception e) {
                Logger.getLogger(ClubDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        
        
        return registros;
     
    }
   
    
 
    //BORRAR DATOS
    @Override
    public int borrardatos(Club club) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try {
            conn = conectarbase();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, club.getId_club());
            
            registros = stmt.executeUpdate();
            
        } catch (Exception e) {
            Logger.getLogger(ClubDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try {
                close(stmt);
                close(conn);
            } catch (Exception e) {
                Logger.getLogger(ClubDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return registros;

    }
}
