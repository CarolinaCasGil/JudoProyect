/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.judo.datos;

import com.judo.dominio.Peso;
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
public class PesoDAO implements IPesoDAO {

    //VARIABLES
    private static final String SQL_SELECT = "SELECT * FROM peso";
    private static final String SQL_INSERT = "INSERT INTO peso(kilos) VALUES (?)";
    private static final String SQL_UPDATE = "UPDATE  peso SET kilos = ? WHERE id_peso = ?";
    private static final String SQL_DELETE = "DELETE FROM peso WHERE id_peso = ?";

    //CONSULTAS
    //##############################METODOS PARA LAS CONSULTAS#########################
    //METODO PARA OBTENER TODAS LAS COMPETICIONES
    public List<Peso> mostrartodo() {

        Connection conn = null;
        Statement ins = null;
        ResultSet res = null;
        List<Peso> pesos = new ArrayList<>();

        try {
            conn = conectarbase();
            ins = conn.createStatement();
            res = ins.executeQuery(SQL_SELECT);

            while (res.next()) {
                pesos.add(new Peso(res.getInt("id_peso"), res.getInt("kilos")));
            }

        } catch (Exception e) {
            Logger.getLogger(PesoDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                close(res);
                close(ins);
                close(conn);
            } catch (Exception e) {
                Logger.getLogger(PesoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return pesos;

    }

    //INSERTAR DAOTS
    @Override
    public int insertar(Peso peso) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = conectarbase();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, peso.getPeso());

            registros = stmt.executeUpdate();

        } catch (Exception e) {
            Logger.getLogger(PesoDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (Exception e) {
                Logger.getLogger(PesoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return registros;

    }

    //ACTUALIZAR DATOS
    @Override
    public int actualizar(Peso peso) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = conectarbase();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setInt(1, peso.getPeso());
            stmt.setInt(2, peso.getId_peso());

            registros = stmt.executeUpdate();

        } catch (Exception e) {
            Logger.getLogger(PesoDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (Exception e) {
                Logger.getLogger(PesoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return registros;

    }


    //BORRAR DATOS
    @Override
    public int borrardatos(Peso peso) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = conectarbase();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, peso.getId_peso());

            registros = stmt.executeUpdate();

        } catch (Exception e) {
            Logger.getLogger(PesoDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (Exception e) {
                Logger.getLogger(PesoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return registros;

    }
}
