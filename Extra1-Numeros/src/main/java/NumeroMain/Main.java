package NumeroMain;

import Servicio.NumeroServicio;

public class Main {
    public static void main(String[] args){

        NumeroServicio.cargarNumeros();
        NumeroServicio.mostrarNumeros();
        NumeroServicio.promedioNumeros();
    }
}