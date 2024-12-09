/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.judo.datos;

import com.judo.dominio.Competidor;
import static com.mycompany.judo.Judo.*;
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
public class CompetidorDAO implements ICompetidorDAO{

    //VARIABLES
    private static final String SQL_SELECT = "SELECT * FROM competidor";
    private static final String SQL_INSERT = "INSERT INTO competidor(usuario, nombre, apellido, clave, puntos,id_club, id_peso) VALUES (?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE  competidor SET usuario = ?, nombre = ?, apellido = ?, clave = ?, puntos = ?, id_club = ?, id_peso = ? WHERE id_competidor = ?";
    private static final String SQL_DELETE = "DELETE FROM competidor WHERE id_competidor = ?";
    private static final String SQL_RANKING= "SELECT * FROM competidor WHERE id_peso = ? ORDER BY puntos DESC";
    private static final String SQL_LUCHA= "SELECT * FROM competidor WHERE id_peso = ?";
    private static final String SQL_CLUB= "SELECT * FROM competidor WHERE id_club = ?";

    //CONSULTAS
    //##############################METODOS PARA LAS CONSULTAS#########################
    //METODO PARA OBTENER TODAS 
    @Override
    public List<Competidor> mostrartodo() {

        Connection conn = null;
        Statement ins = null;
        ResultSet res = null;
        List<Competidor> competidores = new ArrayList<>();

        try {
            conn = conectarbase();
            ins = conn.createStatement();
            res = ins.executeQuery(SQL_SELECT);

            while (res.next()) {
                competidores.add(new Competidor(res.getInt("id_competidor"), res.getString("usuario"), res.getString("nombre"), res.getString("apellido"), res.getString("clave"), res.getInt("puntos"), res.getInt("id_club"),res.getInt("id_peso")));
            }

        } catch (Exception e) {
            Logger.getLogger(CompetidorDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                close(res);
                close(ins);
                close(conn);
            } catch (Exception e) {
                Logger.getLogger(CompetidorDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return competidores;

    }

    //INSERTAR DAOTS
    @Override
    public int insertar(Competidor competidor) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = conectarbase();
            stmt = conn.prepareCall(SQL_INSERT);
            stmt.setString(1, competidor.getUsuario());
            stmt.setString(2, competidor.getNombre());
            stmt.setString(3, competidor.getApellido());
            stmt.setString(4, competidor.getClave());
            stmt.setInt(5, competidor.getPuntos());
            stmt.setInt(6, competidor.getId_club());
            stmt.setInt(7, competidor.getPeso());

            registros = stmt.executeUpdate();

        } catch (Exception e) {
            Logger.getLogger(CompetidorDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (Exception e) {
                Logger.getLogger(CompetidorDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        competidores = icompetidorDAO.mostrartodo();
        
        return registros;

    }

    //ACTUALIZAR DATOS
    @Override
    public int actualizar(Competidor competidor) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = conectarbase();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, competidor.getUsuario());
            stmt.setString(2, competidor.getNombre());
            stmt.setString(3, competidor.getApellido());
            stmt.setString(4, competidor.getClave());
            stmt.setInt(5, competidor.getPuntos());
            stmt.setInt(6, competidor.getId_club());
            stmt.setInt(7, competidor.getPeso());
            stmt.setInt(8, competidor.getId_competidor());

            registros = stmt.executeUpdate();

        } catch (Exception e) {
            Logger.getLogger(CompetidorDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (Exception e) {
                Logger.getLogger(CompetidorDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return registros;

    }



    //BORRAR DATOS
    @Override
    public int borrardatos(Competidor competidor) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = conectarbase();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, competidor.getId_competidor());

            registros = stmt.executeUpdate();

        } catch (Exception e) {
            Logger.getLogger(CompetidorDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (Exception e) {
                Logger.getLogger(CompetidorDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return registros;

    }
    
    //RELLENAR RANKING
    @Override
     public List<Competidor> ranking(int peso) {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet res = null;
        List<Competidor> ranking = new ArrayList<>();

        try {
    
            conn = conectarbase();
            stmt = conn.prepareStatement(SQL_RANKING);
            stmt.setInt(1, peso);
            res = stmt.executeQuery();
            
            while (res.next()) {
                ranking.add(new Competidor(res.getInt("id_competidor"), res.getString("usuario"), res.getString("nombre"), res.getString("apellido"), res.getString("clave"), res.getInt("puntos"), res.getInt("id_club"),res.getInt("id_peso")));
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

        return ranking;

    }
    


    //RELLENAR CLUBS
    @Override
     public List<Competidor> clubs(int club) {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet res = null;
        List<Competidor> clubs = new ArrayList<>();

        try {
    
            conn = conectarbase();
            stmt = conn.prepareStatement(SQL_CLUB);
            stmt.setInt(1, club);
            res = stmt.executeQuery();
            
            while (res.next()) {
                clubs.add(new Competidor(res.getInt("id_competidor"), res.getString("usuario"), res.getString("nombre"), res.getString("apellido"), res.getString("clave"), res.getInt("puntos"), res.getInt("id_club"),res.getInt("id_peso")));
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
     
     //RELLENAR RANKING
    
    @Override
     public List<Competidor> lista(int peso) {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet res = null;
        List<Competidor> lista = new ArrayList<>();

        try {
    
            conn = conectarbase();
            stmt = conn.prepareStatement(SQL_LUCHA);
            stmt.setInt(1, peso);
            res = stmt.executeQuery();
            
            while (res.next()) {
                lista.add(new Competidor(res.getInt("id_competidor"), res.getString("usuario"), res.getString("nombre"), res.getString("apellido"), res.getString("clave"), res.getInt("puntos"), res.getInt("id_club"),res.getInt("id_peso")));
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

        return lista;

    }
}
