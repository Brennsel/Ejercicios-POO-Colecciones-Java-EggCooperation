/*
1- Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
2- . Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */

package PerroMain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        ArrayList<String> listaPerros = new ArrayList<>();
        boolean continuar = false, esIncorrecto;
        String raza;
        int opc;

        do {
            System.out.print("Ingrese una raza de perro: ");
            raza = leer.next();

            listaPerros.add(raza);

            do {
                System.out.println("------------------------------");
                System.out.println("Desea ingresar otra raza?");
                System.out.println("1. SI");
                System.out.println("2. NO");
                System.out.println("------------------------------");
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

       // listaPerros.forEach(System.out::println); //metodo de extension iterable

        for(String razaActual : listaPerros){
            System.out.println(razaActual);
        }

        System.out.println("------------------------------");
        System.out.print("Ingrese el perro a buscar: ");
        String razaBuscar = leer.next();

        Iterator<String> it = listaPerros.iterator();

        if(listaPerros.contains(razaBuscar)){
            while(it.hasNext()){ //si la lista tiene un siguiente
                if(it.next().equalsIgnoreCase(razaBuscar)){
                    it.remove();
                }
            }
        }else{
            System.out.println("No se encontro la raza ingresada.");
        }
        System.out.println("------------------------------");
        System.out.println("Razas ingresadas: ");

        Collections.sort(listaPerros);
        listaPerros.forEach(System.out::println);
    }
}