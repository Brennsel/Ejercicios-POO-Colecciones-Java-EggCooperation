import java.util.*;

public class Main {
    public static void main(String[] args) {

        /* MANOS A LA OBRA – DETECCIÓN DE ERRORES (pag 6)
        ArrayList<Integer> listado = new ArrayList<>();
        TreeSet<String> datos = new TreeSet();
        HashMap<Integer, String> personas = new HashMap<>();  //clave, valor

           MANOS A LA OBRA – DETECCIÓN DE ERRORES (pag 10)
        HashMap<Integer, String> personas = new HashMap<>();
        Integer x1 = 456, x2 = 764;
        String n1 = “Albus”;
        String n2 = “Severus”;
        personas.put(x1, n1);
        personas.put(x2, n2);

            MANOS A LA OBRA - DETECCIÓN DE ERRORES (pag 11)
        ArrayList<String> bebidas = new ArrayList<>();
        bebidas.add("cafe");
        bebidas.add("te");
        Iterator<String> it = bebidas.iterator();
        while(it.hasNext()){
            if (it.next().equals("café")){
            it.remove();
            }
        }
        */

        /*
        EJERCICIO COLECCIONES (pag 7)
        Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.
        */

        ArrayList<Integer> numerosA = new ArrayList<>(); //LISTAS (tienen indice) (remove (indice) o remove(elemento))
        Integer x = 20, x1=15, x2=20, x3=2, x4=12;
        numerosA.add(x);
        numerosA.add(x1);
        numerosA.add(x2);
        numerosA.add(x3);
        numerosA.add(x4);

        HashSet<Integer> numerosB = new HashSet<>(); //CONJUNTOS (no tienen indices) (solo remove(elemento))
        Integer y = 17, y1= 25, y2= 4, y3=8, y4=19;
        numerosB.add(y);
        numerosB.add(y1);
        numerosB.add(y2);
        numerosB.add(y3);
        numerosB.add(y4);

        HashMap<Integer, String> alumnos = new HashMap<>(); //MAPAS (solo remove(llave))
        int dni = 38422, dni1= 4567, dni2= 78977, dni3= 87334, dni4= 8393;
        String nombre = "brenda", nombre1= "martin", nombre2= "gimena", nombre3= "maia", nombre4="agustin";
        alumnos.put(dni, nombre);
        alumnos.put(dni1, nombre1);
        alumnos.put(dni2, nombre2);
        alumnos.put(dni3, nombre3);
        alumnos.put(dni4, nombre4);

        System.out.println(Arrays.toString(numerosA.toArray()));
        System.out.println(Arrays.toString(numerosB.toArray()));
        System.out.println(alumnos.get(dni1)); //obtener valor por clave
        System.out.println(alumnos.values()); //obtener valores

        /*Toma la Lista, el Conjunto y el Mapa que hiciste previamente y elimina en cada uno un objeto de
        cada forma que aprendiste arriba (pag 8)
         */

        numerosA.remove(x1); //Eliminar elemento de lista
        numerosA.remove(3); //Eliminar elemento de lista por posicion
        numerosB.remove(y1); //Eliminar elemento del conjunto
        alumnos.remove(dni1); //Eliminar llave de mapa

        System.out.println(Arrays.toString(numerosA.toArray()));
        System.out.println(Arrays.toString(numerosB.toArray()));
        System.out.println(alumnos.get(dni1)); //obtener valor por clave
        System.out.println(alumnos.values()); //obtener valores


        //Ordenar
        Collections.sort(numerosA); //Ordenar lista

        ArrayList<Integer> numerosLista = new ArrayList<>(numerosB); // convertir hashSet en lista
        Collections.sort(numerosLista); //Ordenar lista

        TreeMap<Integer, String> alumnosTree = new TreeMap<>(alumnos); // convertir hashMap a treeMap


        //mostrar
        System.out.println(Arrays.toString(numerosA.toArray()));
        System.out.println(Arrays.toString(numerosB.toArray()));
        System.out.println(alumnos.get(dni1)); //obtener valor por clave
        System.out.println(alumnos.values()); //obtener valores
    }
}