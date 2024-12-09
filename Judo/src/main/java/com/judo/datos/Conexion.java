/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.judo.datos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author Alumno Mañana
 */
public class Conexion {
    
    private static final String url = "jdbc:mysql://localhost:3306/judo?useSSL=false&"
                + "useTimezone=true&serverTimezone=UTC&"
                + "allowPublicKeyRetrieval=true";
    private static final String usuario = "root";
    private static final String clave = "1234";
    
    
    //#################CONEXION A LA BASE DE DATOS########################
    public static Connection conectarbase() throws SQLException{
        return getDataSource().getConnection();
    }

    //#######################METODO PARA CERRAR RESULSET##################
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    
    //#######################METODO PARA CERRAR STATEMENT##################
    public static void close(Statement st) throws SQLException{
        st.close();
    }
    
    //#######################METODO PARA CERRAR STATEMENT##################
    public static void close(PreparedStatement stmt) throws SQLException{
        stmt.close();
    }
    
    //#######################METODO PARA CERRAR LA CONEXION##################
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
    
    public static DataSource getDataSource(){
        BasicDataSource ds = new BasicDataSource(); 
        ds.setUrl(url);
        ds.setUsername(usuario);
        ds.setPassword(clave);
        
        //5 CONEXIONES Q PIDEN MUCHOS RECURSOS
        ds.setInitialSize(45);
        return ds;
    }
    
}

