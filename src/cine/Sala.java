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

    public Sala (String pelicula, String[] horasSesiones, int filas, int columnas){

        this.pelicula = pelicula;
        this.sesiones = new ArrayList();
        int pos = 0;
        for (int i = 0; i < horasSesiones.length; i++){
            Sesion sesion = new Sesion(horasSesiones[i], filas, columnas);
            for (int j = 0; j < sesiones.size(); j++){
                if (sesiones.get(j).getHora().compareTo(horasSesiones[i]) < 0){
                    pos++;
                }
            }
            sesiones.add(pos, sesion);
        }
        this.filas = filas;
        this.columnas = columnas;

    }

    public void comprarEntrada (int sesion, int fila, int columna){
        sesiones.get(sesion).comprarEntrada(fila, columna);

    }

    public int getIdEntrada (int sesion, int fila, int columna){
        return sesiones.get(sesion).getIdEntrada(fila, columna);

    }

    public String[] getHorasDeSesionesDeSala (){
        String[] horasSesiones = new String[sesiones.size()];
        String aux;
        for (int i = 0; i < sesiones.size(); i++){
            aux = sesiones.get(i).getHora();
            horasSesiones[i] = aux;
        }

        return horasSesiones;

    }

    public char[][] getEstadoSesion (int sesion){
        return sesiones.get(sesion).getEstadoSesion();

    }

    public String getPelicula (){
        return pelicula;

    }

    public String recogerEntradas (int id, int sesion){
        return sesiones.get(sesion).recogerEntradas(id);

    }

    public int getButacasDisponiblesSesion (int sesion){
        return sesiones.get(sesion).getButacasDisponiblesSesion();

    }

    public ButacasContiguas recomendarButacasContiguas (int noButacas, int sesion){
        return sesiones.get(sesion).recomendarButacasContiguas(noButacas);

    }

    public void comprarEntradasRecomendadas (int sesion, ButacasContiguas butacas){
        sesiones.get(sesion).comprarEntradasRecomendadas(butacas);

    }

    public void incluirSesion (String horaSesion){
        int pos = 0;
        Sesion sesion = new Sesion(horaSesion, filas, columnas);
        for (int i = 0; i < sesiones.size(); i++){
            if (sesiones.get(i).getHora().compareTo(horaSesion) < 0){
                pos++;
            }

            sesiones.add(pos, sesion);
        }

    }

    public void borrarSesion (String horaSesion){
        Sesion sesion = new Sesion(horaSesion, filas, columnas);
        sesiones.remove(sesion);

    }
}
