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
    	this.sala[sala-1].comprarEntrada(sesion-1, fila, columna);
    }

    public int getIdEntrada (int sala, int sesion, int fila, int columna){
    	return this.sala[sala-1].getIdEntrada(sesion-1, fila, columna);
    }

    public char[][] getEstadoSesion (int sala, int sesion){
        return this.sala[sala-1].getEstadoSesion(sesion-1);

    }

    public String[] getPeliculas (){
        String[] Peliculas = new String[sala.length];
        for (int i = 0; i < sala.length; i++){
            Peliculas[i] = sala[i].getPelicula();
        }
        return Peliculas;

    }

    public String[] getHorasDeSesionesDeSala (int sala){
    	return this.sala[sala-1].getHorasDeSesionesDeSala();
    }

    public String recogerEntradas (int id, int sala, int sesion){
    	return this.sala[sala-1].recogerEntradas(id, sesion-1);
    }

    public int getButacasDisponiblesSesion (int sala, int sesion){
    	return this.sala[sala-1].getButacasDisponiblesSesion(sesion-1) ;
    }

    public ButacasContiguas recomendarButacasContiguas (int noButacas, int sala, int sesion){
    	return this.sala[sala-1].recomendarButacasContiguas(noButacas, sesion-1);

    }

    public void comprarEntradasRecomendadas (int sala, int sesion, ButacasContiguas butacas){
    	this.sala[sala-1].comprarEntradasRecomendadas(sesion-1, butacas);
    }

    public void incluirSesion (int sala, String horaSesion){
    	this.sala[sala-1].incluirSesion(horaSesion);
    }

    public void borrarSesion (int sala, String horaSesion){
        this.sala[sala-1].borrarSesion(horaSesion);


    }

}
