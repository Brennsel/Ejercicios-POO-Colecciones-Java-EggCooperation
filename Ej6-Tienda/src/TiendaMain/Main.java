package TiendaMain;

import Servicio.ProductoServicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ProductoServicio ps = new ProductoServicio();
        Scanner leer = new Scanner(System.in);
        Integer opc;

        ps.ingresarProductos();

        do {
            System.out.println("========================TIENDA===MENU========================");
            System.out.println(" 1. INGRESAR PRODUCTO");
            System.out.println(" 2. MODIFICAR PRECIO");
            System.out.println(" 3. ELIMINAR PRODUCTOS");
            System.out.println(" 4. MOSTRAR PRODUCTOS");
            System.out.println(" 5. SALIR");
            System.out.println("--------------------------------------------------------------");
            System.out.print("Seleccione una opcion: ");

            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    ps.ingresarProductos();
                    break;
                case 2:
                    ps.modificarPrecio();
                    break;
                case 3:
                    ps.eliminarProducto();
                    break;
                case 4:
                    ps.mostrarProductos();
                    break;
                case 5:
                    System.out.println("Salir");
                    break;
            }
        } while (opc != 5);
    }
}