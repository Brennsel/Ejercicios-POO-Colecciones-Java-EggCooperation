package PaisesMain;

import Servicio.PaisesServicio;

public class Main {
    public static void main(String[] args) {

        PaisesServicio ps = new PaisesServicio();

        ps.crearPaises();
        ps.mostrarPaises();
        ps.ordenarPaises();

        if(ps.buscarPais()){
            ps.mostrarPaises();
        } else{
            System.out.println("No se encontro el pais ingresado");
        }
    }
}