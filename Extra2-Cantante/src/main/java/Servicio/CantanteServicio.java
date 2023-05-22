/*
Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y tendrá como atributos el nombre
y discoConMasVentas. Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos de
tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de agregar un cantante más,
mostrar todos los cantantes, eliminar un cantante que el usuario elija o de salir del programa.
 Al final se deberá mostrar la lista con todos los cambios.
 */

package Servicio;

import Entidad.CantanteFamoso;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CantanteServicio {

    static ArrayList<CantanteFamoso> listaCantantes = new ArrayList<>();
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void cargarCantantes(){

       listaCantantes.add(new CantanteFamoso("Luis Miguel", "Romance"));
       listaCantantes.add(new CantanteFamoso("Cristian Castro", "Azul"));
       listaCantantes.add(new CantanteFamoso("Chayanne", "Atado a tu amor"));
       listaCantantes.add(new CantanteFamoso("Ricky Martin", "Vuelve"));
       listaCantantes.add(new CantanteFamoso("Alejando Sanz", "Mas"));
    }

    public static void mostrarCantantes(){

        System.out.println("========================================================");
        System.out.println("Lista de cantantes famosos y sus discos mas vendidos: ");

        for(CantanteFamoso cantanteActual : listaCantantes){
            System.out.println(cantanteActual);
        }
    }

    public static void agregarCantante(){

        String nombre, discoMasVendido;

        System.out.println("========================================================");
        System.out.print("Ingrese el cantante que desea agregar: ");
        nombre = leer.next();

        System.out.print("Ingrese el disco mas vendido: ");
        discoMasVendido = leer.next();

        listaCantantes.add(new CantanteFamoso(nombre, discoMasVendido));

        System.out.println("Cantante añadido");
    }

    public static void eliminarCantante(){

        String nombre;
        Boolean encontro = false;
        Iterator<CantanteFamoso> it = listaCantantes.iterator();

        System.out.println("========================================================");
        System.out.print("Ingrese el cantante que desea eliminar de la lista: ");
        nombre = leer.next();

        while (it.hasNext()){
            if(it.next().getNombre().equalsIgnoreCase(nombre)){
                it.remove();
                encontro=true;
            }
        }

        if(encontro){
            System.out.println("Se elimino el cantante");
        } else{
            System.out.println("El cantante ingresado no se encuentra en la lista");
        }
    }
}
