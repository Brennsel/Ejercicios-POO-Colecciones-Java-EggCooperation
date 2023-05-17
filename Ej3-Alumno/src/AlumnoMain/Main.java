package AlumnoMain;

import Servicio.AlumnoServicio;


public class Main {
    public static void main(String[] args) {

        AlumnoServicio as = new AlumnoServicio();
        Double prom;

        as.crearAlumno();
        prom = as.notaFinal();

        if(prom!=0){
            System.out.println("El promedio es: " +prom);
        } else{
            System.out.println("El alumno no se encontro.");
        }
    }
}