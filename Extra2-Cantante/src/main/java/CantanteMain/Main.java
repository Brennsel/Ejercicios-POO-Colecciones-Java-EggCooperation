/*
Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y tendrá como atributos el nombre
y discoConMasVentas. Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos de
tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de agregar un cantante más,
mostrar todos los cantantes, eliminar un cantante que el usuario elija o de salir del programa.
 Al final se deberá mostrar la lista con todos los cambios.
 */

package CantanteMain;

import Servicio.CantanteServicio;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CantanteServicio.cargarCantantes();
        CantanteServicio.mostrarCantantes();
        Integer opc;

        do {
            System.out.println("========================================================");
            System.out.println(">===================MENU===============================<");
            System.out.println("1. AGREGAR CANTANTE");
            System.out.println("2. MOSTRAR CANTANTES");
            System.out.println("3. ELIMINAR CANTANTE");
            System.out.println("4. SALIR");
            System.out.println("========================================================");
            System.out.print("Ingrese una opcion: ");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    CantanteServicio.agregarCantante();
                    break;

                case 2:
                    CantanteServicio.mostrarCantantes();
                    break;

                case 3:
                    CantanteServicio.eliminarCantante();
                    break;

                case 4:
                    System.out.println("FIN.");
                    CantanteServicio.mostrarCantantes();
                    break;

                default:
                    System.out.println("Ingreso incorrecto.");
                    break;
            }
        }while(opc!=4);
    }
}