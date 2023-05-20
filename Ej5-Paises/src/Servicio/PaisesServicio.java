/*
 Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente) V
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.V
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */

package Servicio;

import java.util.*;

public class PaisesServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashSet<String> conjPaises = new HashSet<>();

    public void crearPaises() {

        String pais;
        Integer opc;
        Boolean continuar = false, esIncorrecto;

        do {
            System.out.print("Ingrese el pais: ");
            pais = leer.next();

            conjPaises.add(pais);

        } while (menuContinuar());
    }

    public Boolean menuContinuar() {

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

            if (opc == 1) {
                continuar = true;
            } else if (opc != 2) {
                System.out.println("Ingreso incorrecto.");
                esIncorrecto = true;
            }
        } while (esIncorrecto);

        return continuar;
    }

    public void mostrarPaises() {

        System.out.println("-----------------------------------------------------");
        System.out.println("Conjunto de paises: ");

        for (String pais : conjPaises) {
            System.out.println(pais);
        }
    }

    public void ordenarPaises() {

        System.out.println("-----------------------------------------------------");
        System.out.println("Conjunto de ordenado de paises: ");

        ArrayList<String> listaPaises = new ArrayList<>(conjPaises);
        Collections.sort(listaPaises);

        for (String pais : listaPaises) {
            System.out.println(pais);
        }
    }

    public Boolean buscarPais() {

        String pais;
        Boolean seEncontro = false;
        Iterator<String> it = conjPaises.iterator();

        System.out.println("-----------------------------------------------------");
        System.out.print("Ingrese pais a buscar: ");
        pais = leer.next();

        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(pais)) {
                it.remove();
                seEncontro = true;
            }
        }
        return seEncontro;
    }
}
