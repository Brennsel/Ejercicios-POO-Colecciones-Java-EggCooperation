/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elementoV, modificar su precioV,
eliminar un producto y mostrar los productosV que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */

package Servicio;

import java.util.HashMap;
import java.util.Scanner;

public class ProductoServicio {

    HashMap<String, Double> mapProductos = new HashMap<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void ingresarProductos(){

        String nombre;
        Double precio;

        do {
            System.out.println("Ingreso de producto");
            System.out.print("Nombre: ");
            nombre = leer.next();

            System.out.print("Precio: $");
            precio = leer.nextDouble();

            mapProductos.put(nombre, precio);

        } while (menuContinuar());
    }

    public Boolean menuContinuar(){

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

    public void modificarPrecio(){

        String nombre;
        Double precio;

        System.out.println("--------------------------------------------------------------");
        System.out.print("Ingrese el producto del que desea modificar el precio: ");
        nombre = leer.next();

        if(mapProductos.containsKey(nombre)){

            System.out.print("Ingrese el nuevo precio: $ ");
            precio = leer.nextDouble();

            mapProductos.put(nombre, precio);

        } else{
            System.out.println("No se encontro el producto.");
        }
    }

    public void mostrarProductos(){

        System.out.println("--------------------------------------------------------------");
        System.out.println("Lista de productos: ");

        for(String llave : mapProductos.keySet()){ //devuleve la lista con todas las llaves
            System.out.println("Producto: " +llave + " ------> Precio $" +mapProductos.get(llave));
        }
    }

    public void eliminarProducto(){

        String producto;

        System.out.println("--------------------------------------------------------------");
        System.out.println("Ingrese el producto a eliminar: ");
        producto = leer.next();

        if(mapProductos.containsKey(producto)){
            mapProductos.remove(producto);
        } else {
            System.out.println("El producto no se encuentra.");
        }
    }
}
