/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */

package Servicio;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class ProductoServicio {

    //Producto prod = new Producto();
    HashMap<String, Double> mapProductos = new HashMap<>();
    Scanner leer = new Scanner(System.in).useDelimiter("/n");

    public void ingresarProductos(){

        boolean continuar = false, esIncorrecto;
        String nombre;
        Double precio;
        int opc;

        do {
            System.out.println("Ingreso de producto");
            System.out.print("Nombre: ");
            nombre = leer.next();

            System.out.print("Precio: $");
            precio = leer.nextDouble();

            mapProductos.put(nombre, precio);

            do {
                System.out.println("--------------------------------------------------------------");
                System.out.println("Desea continuar ingresando?");
                System.out.println("1. SI");
                System.out.println("2. NO");
                System.out.println("--------------------------------------------------------------");
                opc = leer.nextInt();

                if(opc == 1){
                    continuar= true;
                    esIncorrecto = false;
                }else if(opc==2){
                    continuar = false;
                    esIncorrecto = false;
                } else{
                    System.out.println("Ingreso incorrecto.");
                    esIncorrecto = true;
                }
            }while(esIncorrecto);

        } while (continuar);


    }

    public void modificarPrecio(){

        String nombre;
        Boolean seEncontro;

        System.out.println("--------------------------------------------------------------");
        System.out.println("Ingrese el producto del que desea modificar el precio: ");

        do{
            nombre = leer.next();

            while ()


        }while(!seEncontro);




    }



}
