/*
Implemente un programa para una Librería haciendo uso de un HashSet para evitar datos repetidos.
Para ello, se debe crear una clase llamada Libro que guarde la información de cada uno de los libros de una Biblioteca.
La clase Libro debe guardar el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libro que guardará todos los libros creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos sus datos y los seteandolos en el Libro.v
Despues, ese Libro se guarda en el conjunto y se le pregunta al usuario si quiere crear otro Libro o no.v
La clase Libro contendrá además los siguientes métodos:
    • Constructor por defecto.v
    • Constructor con parámetros.v
    • Métodos Setters/gettersv
    • Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo busca en el conjunto.
Si está en el conjunto, se llama con ese objeto Libro al método. El método se incrementa de a uno, como un carrito de compras,
el atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá cada vez que se realice un préstamo del libro.
 No se podrán prestar libros de los que no queden ejemplares disponibles para prestar.
 Devuelve true si se ha podido realizar la operación y false en caso contrario.
    • Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo busca en el conjunto.
 Si está en el conjunto, se llama con ese objeto al método. El método decrementa de a uno,
 como un carrito de compras, el atributo ejemplares prestados, del libro seleccionado por el usuario.
 Esto sucederá cada vez que se produzca la devolución de un libro.
 No se podrán devolver libros donde que no tengan ejemplares prestados.
 Devuelve true si se ha podido realizar la operación y false en caso contrario.
    • Método toString para mostrar los datos de los libros.
 */
package LibreriaMain;

import Entidad.Libro;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    static HashSet<Libro> conjLibros = new HashSet<>();

    public static void main(String[] args) {

        cargarLibros();
        menu();
    }

    public static void cargarLibros(){

        conjLibros.add(new Libro("Caperucita", "Anonimo", 4, 2));
        conjLibros.add(new Libro("Harry Potter", "JK", 0, 3));
        conjLibros.add(new Libro("It","S. King", 2, 1));
        conjLibros.add(new Libro("La metamorfosis", "F. Kafka", 1, 0));
    }

    public static void menu(){

        Integer opc;

        do {
            System.out.println("====================MENU===LIBRERIA===========================");
            System.out.println("1. AGREGAR NUEVO LIBRO");
            System.out.println("2. PRESTAR");
            System.out.println("3. DEVOLVER");
            System.out.println("4. MOSTRAR");
            System.out.println("5. SALIR");
            System.out.println("--------------------------------------------------------------");
            System.out.print("Ingrese una opcion: ");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    crearLibro();
                    break;
                case 2:
                    prestarLibro();
                    break;
                case 3:
                    devolverLibro();
                    break;
                case 4:
                    mostrarLibros();
                    break;
                case 5:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Ingreso incorrecto.");
                    break;
            }
        }while(opc!=5);
    }

    public static void crearLibro(){

        String titulo, autor;
        Integer nroEjemplares, nroEjemplaresPrestados;

        do {
            System.out.println("--------------------------------------------------------------");
            System.out.println(">LIBRERIA ~ Ingreso de datos<");
            System.out.print("Titulo: ");
            titulo = leer.next();
            System.out.print("Autor: ");
            autor = leer.next();
            System.out.print("Nro de ejempleres: ");
            nroEjemplares = leer.nextInt();
            System.out.print("Nro de ejemplares prestados: ");
            nroEjemplaresPrestados = leer.nextInt();

            conjLibros.add(new Libro(titulo, autor, nroEjemplares, nroEjemplaresPrestados));

        } while (menuContinuar());
    }

    public static Boolean menuContinuar(){

        Integer opc;
        Boolean continuar, esIncorrecto;

        do {
            continuar = false;
            esIncorrecto = false;

            System.out.println("--------------------------------------------------------------");
            System.out.println("Desea continuar ingresando?");
            System.out.println("1. SI");
            System.out.println("2. NO");
            System.out.println("--------------------------------------------------------------");
            opc = leer.nextInt();

            if(opc == 1){
                continuar= true;
            } else if(opc!=2){
                System.out.println("Ingreso incorrecto.");
                esIncorrecto = true;
            }
        }while(esIncorrecto);

        return continuar;
    }

    public static void prestarLibro(){

        String tituloAPrestar;
        Libro libro;

        System.out.println("--------------------------------------------------------------");
        System.out.print("Ingrese el titulo que desea prestar: ");
        tituloAPrestar = leer.next();
        libro = buscarLibro(tituloAPrestar);

        if(libro!=null){

            if(libro.prestar()){
                System.out.println("Se presto el libro correctamente.");
            } else{
                System.out.println("No se pudo prestar el libro.");
            }

        }else {
            System.out.println("No se encontro el libro.");
        }
    }

    public static void devolverLibro(){

        String tituloADevolver;
        Libro libro;

        System.out.println("--------------------------------------------------------------");
        System.out.print("Ingrese el titulo que desea devolver: ");
        tituloADevolver = leer.next();

        libro = buscarLibro(tituloADevolver);

        if(libro!=null){

            if(libro.devolver()){
                System.out.println("Devolucion correcta.");
            } else{
                System.out.println("Devolucion incorrecta.");
            }

        }else{
            System.out.println("No se encontro el libro.");
        }

    }

    public static Libro buscarLibro(String titulo){

        Iterator<Libro> it = conjLibros.iterator();
        Libro libro;

        while (it.hasNext()){
            libro=it.next();
            if(libro.getTitulo().equalsIgnoreCase(titulo)){
                return libro;
            }
        }
        return null;
    }

    public static void mostrarLibros(){

        System.out.println("--------------------------------------------------------------");
        System.out.println("Lista de libros");

        for(Libro libroActual : conjLibros){
            System.out.println(libroActual);
        }
    }

}