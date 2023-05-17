package PeliculaMain;

import Servicio.PeliculaServicio;

public class Main {
    public static void main(String[] args) {

        PeliculaServicio ps = new PeliculaServicio();

        ps.crearPelicula();
        ps.mostrarPeliculas();
        ps.mostrarMayoresDuracion();
        ps.duracionDescendiente();
        ps.duracionAscendiente();
        ps.ordenarPorTitulo();
        ps.ordenarPorDirector();
    }
}