package cine;

/**
 * Created by Nacho on 5/4/17.
 */
public class Cine {

    private String nombre;
    private Sala[] sala;

    public Cine(String nombre, Sala[] sala){

        this.nombre = nombre;
        this.sala =  sala;

    }

    public void comprarEntrada (int sala, int sesion, int fila, int columna){

    }

    public int getIdEntrada (int sala, int sesion, int fila, int columna){

    }

    public char[] getEstadoSesion (int sala, int sesion){

    }

    public String getPeliculas (){

    }

    public String[] getHorasDeSesionesDeSala (int sala){

    }

    public String recogerEntradas (int id, int sala, int sesion){

    }

    public int getButacasDisponiblesSesion (int sala, int sesion){

    }

    public ButacasContiguas recomendarButacasContiguas (int noButacas, int sala, int sesion){

    }

    public void comprarEntradasRecomendadas (int sala, int sesion, ButacasContiguas butacas){

    }

    public void incluirSesion (int sala, String horaSesion){

    }

    public void borrarSesion (int sala, String horaSesion){


    }

}
