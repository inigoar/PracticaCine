package cine;

import list.ArrayList;

/**
 * Created by Nacho on 5/4/17.
 */
public class Sala {

    private String pelicula;
    private ArrayList<Sesion> sesiones;
    private int filas;
    private int columnas;
    private String[] horasSesiones;

    public Sala (String pelicula, String[] horasSesiones, int filas, int columnas){

        this.pelicula = pelicula;
        this.sesiones = new ArrayList();
        for (int i = 0; i < horasSesiones.length; i++){
            Sesion sesion = new Sesion(horasSesiones[i], filas, columnas);
            sesiones.add(sesiones.size(), sesion);
        }
        this.filas = filas;
        this.columnas = columnas;
        this.horasSesiones = horasSesiones;

    }

    public void comprarEntrada (int sesion, int fila, int columna){


    }

    public int getIdEntrada (int sesion, int fila, int columna){
        return sesiones.get(sesion).getIdEntrada(fila,columna);

    }

    public String[] getHorasDeSesionesDeSala (){
        return horasSesiones;

    }

    public char[][] getEstadoSesion (int sesion){

    }

    public String getPelicula (){

    }

    public String recogerEntradas (int id, int sesion){

    }

    public int getButacasDisponiblesSesion (int sesion){

    }

    public ButacasContiguas recomendarButacasContiguas (int noButacas, int sesion){

    }

    public void comprarEntradasRecomendadas (int sesion, ButacasContiguas butacas){

    }

    public void incluirSesion (String horaSesion){

    }

    public void borrarSesion (String horaSesion){

    }
}
