/*
4. Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta página: https://mapanet.eu/index.htm.
Nota: Poner el código postal sin la letra, solo el numero.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap.
 */

package PostalesMain;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static HashMap<Integer, String> mapsPostales = new HashMap<>();
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        cargarCodigos();
        mostrarDatos();
        pedirCp();
        mostrarDatos();
        agregarCiudad();
        mostrarDatos();
        eliminarCiudad();
        mostrarDatos();
    }

    public static void cargarCodigos() {

        Integer cp;
        String ciudad;
        System.out.println("---------------------------------------------------------------");
        System.out.println(">Ingreso de datos<");

        for (int i = 0; i < 10; i++) {
            System.out.println("---------------------------------------------------------------");
            System.out.print("Codigo Postal " + (i + 1) + " : ");
            cp = leer.nextInt();
            System.out.print("Cuidad: ");
            ciudad = leer.next();

            mapsPostales.put(cp, ciudad);
        }
    }

    public static void mostrarDatos() {

        System.out.println("---------------------------------------------------------------");
        System.out.println(">Codigos postales y sus ciudades<");

        for (Integer llave : mapsPostales.keySet()) {
            System.out.println("CP: " + llave + "-------> Ciudad: " + mapsPostales.get(llave));
        }
    }

    public static Boolean buscarCp(Integer cp) {

        if (mapsPostales.containsKey(cp)) {
            return true;
        } else {
            return false;
        }
    }

    public static void pedirCp() {

        Integer cp;

        System.out.println("---------------------------------------------------------------");
        System.out.print("Ingrese el CP que desea buscar: ");
        cp = leer.nextInt();

        if (buscarCp(cp)) {
            System.out.println("El codigo postal " + cp + " corresponde a " + mapsPostales.get(cp));
        } else {
            System.out.println("El codigo postal ingresado no corresponde a ninguna ciudad.");
        }
    }

    public static void agregarCiudad() {

        Integer cp;
        String ciudad;

        System.out.println("---------------------------------------------------------------");
        System.out.println(">Nuevo ingreso<");
        System.out.print("CP: ");
        cp = leer.nextInt();

        if (buscarCp(cp)) {
            System.out.println("El codigo postal ingresado ya se encuentra cargado.");
        } else {
            System.out.print("Cuidad: ");
            ciudad = leer.next();

            mapsPostales.put(cp, ciudad);
        }
    }

    public static void eliminarCiudad() {

        Integer cp;

        System.out.println("---------------------------------------------------------------");
        System.out.println(">Ingrese tres codigos postales que desee eliminar<");

        for (int i = 0; i < 3; i++) {
            Boolean noEncontrado;

            do {
                noEncontrado = false;

                System.out.print("CP " + (i + 1) + ": ");
                cp = leer.nextInt();

                if (buscarCp(cp)) {

                    mapsPostales.remove(cp);
                    System.out.println("Se elimino correctamente");

                } else {
                    System.out.println("El codigo postal ingresado no corresponde a ninguna ciudad.");
                    System.out.println("Ingrese nuevamente.");
                    noEncontrado = true;
                }
            } while (noEncontrado);
        }
    }
}