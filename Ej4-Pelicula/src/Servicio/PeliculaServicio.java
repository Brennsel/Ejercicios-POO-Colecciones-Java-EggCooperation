/*
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas. V
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora. V
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla. V
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla. V
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla. V
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla. V
 */

package Servicio;

import Entidad.Pelicula;

import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> listaPeliculas = new ArrayList<>();

    public void crearPelicula() {

        String titulo, director;
        Integer opc;
        Double duracion;
        Boolean continuar = false, esIncorrecto;

        do {
            do {
                System.out.println("Datos de la pelicula");
                System.out.print("Titulo: ");
                titulo = leer.next();
                System.out.print("Director: ");
                director = leer.next();
                System.out.print("Duracion: ");
                duracion = leer.nextDouble();

                listaPeliculas.add(new Pelicula(titulo, director, duracion));

                System.out.println("-----------------------------------------------------");
                System.out.println("Desea continuar?");
                System.out.println("1. SI");
                System.out.println("2. NO");
                System.out.println("-----------------------------------------------------");
                opc = leer.nextInt();

                if (opc == 1) {
                    continuar = true;
                    esIncorrecto = false;
                } else if (opc == 2) {
                    continuar = false;
                    esIncorrecto = false;
                } else {
                    System.out.println("Ingreso incorrecto.");
                    esIncorrecto = true;
                }
            } while (esIncorrecto);

        } while (continuar);

    }

    public void mostrarPeliculas() {

        System.out.println("-----------------------------------------------------");
        System.out.println("Lista de peliculas: ");

        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula);
        }
    }

    public void mostrarMayoresDuracion() {

        System.out.println("-----------------------------------------------------");
        System.out.println("Lista de peliculas con duracion mayor a una hora: ");

        for (Pelicula peliculaActual : listaPeliculas) {
            if (peliculaActual.getDuracion() > 1) {
                System.out.println(peliculaActual);
            }
        }
    }

    public void duracionDescendiente() {

        System.out.println("-----------------------------------------------------");
        System.out.println("Orden de duracion descendiente: ");

        listaPeliculas.sort(Pelicula.compararDuracion.reversed());

        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula);
        }
    }

    public void duracionAscendiente() {

        System.out.println("-----------------------------------------------------");
        System.out.println("Orden de duracion ascendiente: ");

        listaPeliculas.sort(Pelicula.compararDuracion);

        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula);
        }
    }

    public void ordenarPorTitulo() {

        System.out.println("-----------------------------------------------------");
        System.out.println("Orden por titulo: ");

        listaPeliculas.sort(Pelicula.compararTitulos);

        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula);
        }
    }

    public void ordenarPorDirector() {

        System.out.println("-----------------------------------------------------");
        System.out.println("Orden por director: ");

        listaPeliculas.sort(Pelicula.compararDirector);

        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula);
        }
    }
}
