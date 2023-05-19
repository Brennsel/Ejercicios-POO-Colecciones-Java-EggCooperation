package TiendaMain;

import Servicio.ProductoServicio;
public class Main {
    public static void main(String[] args) {

        ProductoServicio ps = new ProductoServicio();

        System.out.println("======TIENDA===MENU======");
        System.out.println(" 1. INGRESAR PRODUCTO");
        System.out.println(" 2. MODIFICAR PRECIO");
        System.out.println(" 3. ELIMINAR PRODUCTOS");
        System.out.println(" 4. MOSTRAR PRODUCTOS");

        ps.ingresarProductos();
        ps.mostrarProductos();
        ps.modificarPrecio();
        ps.mostrarProductos();
        ps.eliminarProducto();





    }


}