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
    	this.sala[sala].comprarEntrada(sesion, fila, columna);
    }

    public int getIdEntrada (int sala, int sesion, int fila, int columna){
    	return this.sala[sala].getIdEntrada(sesion, fila, columna);
    }

    public char[][] getEstadoSesion (int sala, int sesion){
        return this.sala[sala].getEstadoSesion(sesion);

    }

    public String getPeliculas (){
        String Peliculas = new String("");
        String aux;
        for (int i = 0; i < sala.length; i++){
            aux = sala[i].getPelicula();
            Peliculas = Peliculas + aux;
        }
        return Peliculas;

    }

    public String[] getHorasDeSesionesDeSala (int sala){
    	return this.sala[sala].getHorasDeSesionesDeSala();
    }

    public String recogerEntradas (int id, int sala, int sesion){
    	return this.sala[sala].recogerEntradas(id, sesion);
    }

    public int getButacasDisponiblesSesion (int sala, int sesion){
    	return this.sala[sala].getButacasDisponiblesSesion(sesion) ;
    }

    public ButacasContiguas recomendarButacasContiguas (int noButacas, int sala, int sesion){
    	return this.sala[sala].recomendarButacasContiguas(noButacas, sesion);

    }

    public void comprarEntradasRecomendadas (int sala, int sesion, ButacasContiguas butacas){
    	this.sala[sala].comprarEntradasRecomendadas(sesion, butacas);
    }

    public void incluirSesion (int sala, String horaSesion){
    	this.sala[sala].incluirSesion(horaSesion);
    }

    public void borrarSesion (int sala, String horaSesion){


    }

}
