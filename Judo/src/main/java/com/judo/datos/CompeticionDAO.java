/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.judo.datos;

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
 * PERSONA DATA OBJET CONTIENE LOS METODOS APRA HACER LAS CONSLUTAS
 *
 * @author Alumno Mañana
 */
public class CompeticionDAO implements ICompeticionDAO{

    //VARIABLES
    private static final String SQL_SELECT = "SELECT * FROM competicion";
    private static final String SQL_INSERT = "INSERT INTO competicion(nombre, ciudad, mes) VALUES (?, ?)";
    private static final String SQL_UPDATE = "UPDATE  competicion SET nombre = ?, ciudad = ? WHERE id_copa = ?, mes = ?";
    private static final String SQL_DELETE = "DELETE FROM competicion WHERE id_copa = ?";
    private static final String SQL_SELECTNOMBRE = "SELECT * FROM competicion WHERE nombre = ?";
    

    //CONSULTAS
    
    //##############################METODOS PARA LAS CONSULTAS#########################
    //METODO PARA OBTENER TODAS LAS COMPETICIONES
    @Override
    public List<Competicion> mostrartodo() {

        Connection conn = null;
        Statement ins = null;
        ResultSet res = null;
        List<Competicion> competiciones = new ArrayList<>();
        
        try {
            conn = conectarbase();
            ins = conn.createStatement();
            res = ins.executeQuery(SQL_SELECT);

            while (res.next()) {
                competiciones.add(new Competicion(res.getInt("id_copa"), res.getString("nombre"), res.getString("ciudad"), res.getString("mes")));
            }

        } catch (Exception e) {
            Logger.getLogger(CompeticionDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try {
                close(res);
                close(ins);
                close(conn);
            } catch (Exception e) {
                Logger.getLogger(CompeticionDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return competiciones;

    }

    
    //INSERTAR DAOTS
    @Override
    public int insertar(Competicion compe){
    
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try {
            conn = conectarbase();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, compe.getNombre());
            stmt.setString(2, compe.getCiudad());
            stmt.setString(3, compe.getMes());
            

           registros = stmt.executeUpdate();
            
            
        } catch (Exception e) {
            Logger.getLogger(CompeticionDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try {
                close(stmt);
                close(conn);
            } catch (Exception e) {
                Logger.getLogger(CompeticionDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        
        
        return registros;
    
        
    }
    
    //ACTUALIZAR DATOS
    @Override
    public int actualizar(Competicion compe){
    
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try {
            conn = conectarbase();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, compe.getNombre());
            stmt.setString(2, compe.getCiudad());
            stmt.setInt(3, compe.getId());

           registros = stmt.executeUpdate();
            
            
        } catch (Exception e) {
            Logger.getLogger(CompeticionDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try {
                close(stmt);
                close(conn);
            } catch (Exception e) {
                Logger.getLogger(CompeticionDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        
        
        return registros;
     
    }
    
    //BUSCAR POR NOMBRE
    @Override
    public void buscarpornombre(String nombre) {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conn = conectarbase();
            stmt = conn.prepareStatement(SQL_SELECTNOMBRE);
            stmt.setString(1, nombre);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                System.out.println("Nombre = " + rs.getString("nombre"));
            }

        } catch (Exception e) {
            Logger.getLogger(CompeticionDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try {
                close(stmt);
                close(conn);
            } catch (Exception e) {
                Logger.getLogger(CompeticionDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

    }
    
    
    
    //BORRAR DATOS
    @Override
    public int borrardatos(Competicion compe) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try {
            conn = conectarbase();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, compe.getId());
            
            registros = stmt.executeUpdate();
            
        } catch (Exception e) {
            Logger.getLogger(CompeticionDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try {
                close(stmt);
                close(conn);
            } catch (Exception e) {
                Logger.getLogger(CompeticionDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return registros;

    }
}
