package cine;

/**
 * Created by Nacho on 06/04/2017.
 */
public class Sesion {

    private String hora;
    private int asientosDisponibles;
    private int sigIdCompra;
    private int[][] estadoAsientos;

    public Sesion (String hora, int filas, int columnas){

        this.hora = hora;
        estadoAsientos = new int[filas][columnas];
        this.asientosDisponibles = filas * columnas;
        this.sigIdCompra = 1;
    }

    public void comprarEntrada (int fila, int columna){
        estadoAsientos[fila-1][columna-1] = sigIdCompra;
        sigIdCompra++;
        asientosDisponibles--;

    }

    public int getIdEntrada (int fila, int columna){
        return estadoAsientos[fila-1][columna-1];

    }

    public int getButacasDisponiblesSesion (){
        return asientosDisponibles;

    }

    public String getHora (){
        return hora;

    }

    public char[][] getEstadoSesion (){
        char[][] estadoSesion = new char[estadoAsientos.length][estadoAsientos[0].length];
        for (int i = 0; i < estadoAsientos.length; i++){
            for (int j = 0; j < estadoAsientos[0].length; j++){
                if (estadoAsientos[i][j] != 0){
                    estadoSesion[i][j] = '#';
                }
                else {
                    estadoSesion[i][j] = 'O';
                }
            }
        }
        return estadoSesion;

    }

    public String recogerEntradas (int id){
        String entrada = new String(hora + "+");
        String aux = null;
        for (int i = 0; i < estadoAsientos.length; i++){
            for (int j = 0; j < estadoAsientos[0].length; j++){
                if (estadoAsientos[i][j] == id){
                    String asientos = new String(i + "," + j + "+");
                    aux = aux + asientos;
                }
            }
        }

        if (aux == null){
            return null;
        }

        else{
            return entrada + aux;
        }

    }

    public ButacasContiguas recomendarButacasContiguas (int noButacas){
        int butacasDisponibles = 0;
        ButacasContiguas butacasContiguas = null;
        for (int i = (estadoAsientos.length+1)/2+1; i < estadoAsientos.length || butacasDisponibles == noButacas; i++){
            for (int j = estadoAsientos[0].length; j >= 1; j--){
                if (estadoAsientos[i][j] == 0){
                    for (int k = 0; k < noButacas ;k++){
                        if (estadoAsientos[i][j+k] == 0){
                            butacasDisponibles++;
                        }else{
                            butacasDisponibles=0;
                        }
                    }
                }
                if (butacasDisponibles == noButacas){
                    ButacasContiguas aux = new ButacasContiguas(i,j,noButacas);
                    butacasContiguas = aux;
                }
            }
        }
        for (int i = (estadoAsientos.length+1)/2; i > 0 || butacasDisponibles == noButacas; i--){
            for (int j = estadoAsientos[0].length; j >= 1; j--){
                if (estadoAsientos[i][j] == 0){
                    for (int k = 0; k < noButacas ;k++){
                        if (estadoAsientos[i][j+k] == 0){
                            butacasDisponibles++;
                        }else{
                            butacasDisponibles=0;
                        }
                    }
                }
                if (butacasDisponibles == noButacas){
                    ButacasContiguas aux = new ButacasContiguas(i,j,noButacas);
                    butacasContiguas = aux;
                }
            }
        }
        return butacasContiguas;
    }

    public void comprarEntradasRecomendadas (ButacasContiguas butacas){
        for (int i = 0; i <= butacas.getNoButacas(); i++){
            estadoAsientos[butacas.getFila()+i][butacas.getColumna()+i] = sigIdCompra;
        }
        sigIdCompra++;
        asientosDisponibles = asientosDisponibles - butacas.getNoButacas();
    }

    public boolean equals (Sesion obj){
        return this.hora == obj.hora;

    }
}
