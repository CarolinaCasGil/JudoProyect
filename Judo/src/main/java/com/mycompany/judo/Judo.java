/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.judo;

import com.judo.datos.*;
import com.judo.dominio.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
public class Judo {

    public static String copa;
    public static int count = 0;
    public static int numero1 = (int) (Math.random() * 8 + 1);
    public static int numero2 = (int) (Math.random() * 8 + 1);
    public static int numero3 = (int) (Math.random() * 8 + 1);
    public static int[] numeros = new int[3];
    public static int puntos1 = 0, puntos2 = 0, puntos3 = 0, puntos4 = 0, puntos5 = 0, puntos6 = 0, pts = 0, pts2 = 0;

    public static Competidor competidor = new Competidor();

    public static ICompetidorDAO ilistaDAO = new CompetidorDAO();
    public static List<Competidor> lista = ilistaDAO.lista(competidor.getPeso());

    public static ICompeticionDAO icompeticionDAO = new CompeticionDAO();
    public static List<Competicion> competiciones = icompeticionDAO.mostrartodo();

    public static IArbitroDAO iarbiDAO = new ArbitroDAO();
    public static List<Arbitro> arbis = iarbiDAO.mostrartodo();

    public static IClubDAO iclubDAO = new ClubDAO();
    public static List<Club> clubs = iclubDAO.mostrartodo();

    public static ICompetidorDAO icompetidorDAO = new CompetidorDAO();
    public static List<Competidor> competidores = icompetidorDAO.mostrartodo();

    public static IEntrenadorDAO ientreDAO = new EntrenadorDAO();
    public static List<Entrenador> entrenadores = ientreDAO.mostrartodo();

    public static IPesoDAO ipesoDAO = new PesoDAO();
    public static List<Peso> pesos = ipesoDAO.mostrartodo();
    
    public static ArrayList<Tecnica> tecnicas = new ArrayList<Tecnica>();

    public static void main(String[] args) {

        Tecnica tecnica1 = new Tecnica(1, "Judo Throw", 70, 50);
        Tecnica tecnica2 = new Tecnica(2, "Armbar", 60, 40);
        Tecnica tecnica3 = new Tecnica(3, "Triangle Choke", 80, 30);
        Tecnica tecnica4 = new Tecnica(4, "Kimura Lock", 50, 30);
        Tecnica tecnica5 = new Tecnica(5, "Ankle Lock", 40, 20);
        Tecnica tecnica6 = new Tecnica(6, "Guillotine Choke", 90, 20);
        Tecnica tecnica7 = new Tecnica(7, "Rear Naked Choke", 80, 30);
        Tecnica tecnica8 = new Tecnica(8, "Omoplata", 60, 20);
        Tecnica tecnica9 = new Tecnica(9, "Kneebar", 70, 30);
        Tecnica tecnica10 = new Tecnica(10, "Americana", 50, 60);


        tecnicas.add(tecnica1);
        tecnicas.add(tecnica2);
        tecnicas.add(tecnica3);
        tecnicas.add(tecnica4);
        tecnicas.add(tecnica5);
        tecnicas.add(tecnica6);
        tecnicas.add(tecnica7);
        tecnicas.add(tecnica8);
        tecnicas.add(tecnica9);
        tecnicas.add(tecnica10);

        for (int i = 0; i < competidores.size(); i++) {
            competidores.get(i).relleno_tecnicas(tecnicas);
        }

        competidor.relleno_tecnicas(tecnicas);

        Inicio_Sesion ventana = new Inicio_Sesion();
        ventana.setVisible(true);

    }

}
