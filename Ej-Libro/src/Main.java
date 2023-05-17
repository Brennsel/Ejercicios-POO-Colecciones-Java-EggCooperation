/*
EJERCICIO LISTA LIBROS
Crea una lista de Libros y muestra el título de cada uno con un bucle
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> listaLibros = new ArrayList<>();

        String l1 = "El Principito", l2= "Martin Fierro", l3="El Hobbit", l4= "Los arboles mueren de pie", l5= "Rebelion en la granja";

        listaLibros.add(l1);
        listaLibros.add(l2);
        listaLibros.add(l3);
        listaLibros.add(l4);
        listaLibros.add(l5);

        for(String titulos : listaLibros){
            System.out.println(titulos);
        }
    }
}