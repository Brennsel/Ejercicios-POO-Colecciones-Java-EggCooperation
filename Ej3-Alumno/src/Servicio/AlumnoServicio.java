/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */

package Servicio;

import Entidad.Alumno;

import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumno> listaAlumnos = new ArrayList<>();

    public void crearAlumno() {

        String nombre;
        Integer n1, n2, n3, opc;
        Boolean continuar = false, esIncorrecto;
        ArrayList<Integer> notas = new ArrayList<>();

        do {
            do {

                System.out.print("Ingrese nombre del alumno: ");
                nombre = leer.next();

                System.out.println("Ingrese las notas");
                System.out.print("Nota 1: ");
                n1 = leer.nextInt();
                System.out.print("Nota 2: ");
                n2 = leer.nextInt();
                System.out.print("Nota 3: ");
                n3 = leer.nextInt();

                notas.add(n1);
                notas.add(n2);
                notas.add(n3);

                listaAlumnos.add(new Alumno(nombre, notas));

                System.out.println("------------------------------");
                System.out.println("Desea continuar?");
                System.out.println("1. SI");
                System.out.println("2. NO");
                System.out.println("------------------------------");
                opc = leer.nextInt();

                if (opc == 1) {
                    continuar = true;
                    esIncorrecto = false;
                } else if (opc == 2) {
                    continuar = false;
                    esIncorrecto = false;
                } else {
                    System.out.println("Ingreso incorrecto.");
                    esIncorrecto = true;
                }
            } while (esIncorrecto);

        } while (continuar);

    }


    public Double notaFinal(){

        String nombre;
        Double suma= (double) 0;

        System.out.print("Ingrese el nombre del alumno del que desea ver su promedio: ");
        nombre = leer.next();

        for(Alumno alumnoActual: listaAlumnos){
            if(alumnoActual.getNombre().equalsIgnoreCase(nombre)){
                for(Integer nota : alumnoActual.getNotas()){
                    suma+=nota;
                }
                return (double) (suma/alumnoActual.getNotas().size());
            }
        }

        return (double) 0;
    }

}
