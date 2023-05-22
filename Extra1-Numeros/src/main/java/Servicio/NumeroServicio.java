/*Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y los guarde en un ArrayList
de tipo Integer. La lectura de números termina cuando se introduzca el valor -99. Este valor no se guarda en el ArrayList.
A continuación, el programa mostrará por pantalla el número de valores que se han leído, su suma y su media (promedio).
 */

package Servicio;

import java.util.ArrayList;
import java.util.Scanner;

public class NumeroServicio {

    static ArrayList<Integer> listaNumeros = new ArrayList<>();
    public static Scanner leer = new Scanner(System.in);

    public static void cargarNumeros() {

        Integer num;

        System.out.println(">Carga de numeros enteros<");

        do {
            System.out.print("Ingrese un numero entero: ");
            num = leer.nextInt();

            if(num!=(-99)){
                listaNumeros.add(num);
            }

        } while(num!=(-99));
    }
    public static void mostrarNumeros(){

        System.out.println("=================================================");
        System.out.println(">Lista de numeros enteros<");

        System.out.println(listaNumeros);
    }

    public static Integer sumaNumeros(){

        Integer suma = 0;

        for (Integer numActual : listaNumeros){
            suma+=numActual;
        }

        System.out.println("=================================================");
        System.out.println("La suma de los numeros ingresados es: " +suma);

        return suma;
    }

    public static void promedioNumeros(){

        Integer suma = sumaNumeros();
        Double promedio = ((double) suma/listaNumeros.size());

        System.out.println("=================================================");
        System.out.println("El promedio de los numeros ingresados es: " +promedio);
    }
}
