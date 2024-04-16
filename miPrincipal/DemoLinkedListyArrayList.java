package miPrincipal;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class DemoLinkedListyArrayList {
    public static void menu() {
        System.out.println("==========================");
        System.out.println("        LinkedList        ");   
        System.out.println("         ArrayList        ");
        System.out.println("==========================");
        try{
            List<Integer> lista = new LinkedList<Integer>();
            List<Integer> lista2 = new ArrayList<Integer>();
            lista.add(12);
            lista.add(15);
            lista.add(20);
            System.out.println("\n~~~~ DATOS DESPUÉS DE LA LISTA ~~~~");
            System.out.println("Dato de la lista1 en la posicion 0: " + lista.get(0));
            System.out.println("Dato de la lista1 en la posicion 1: " + lista.get(1));
            System.out.println("Dato de la lista1 en la posicion 2: " + lista.get(2));
            lista.add(1,13);
            lista.add(3,16);
            System.out.println("\n~~~~ DATOS DESPUÉS DE LA INSERCIÓN ~~~~");
            System.out.println("Dato de la lista1 en la posicion 0: " + lista.get(0));
            System.out.println("Dato de la lista1 en la posicion 1: " + lista.get(1));
            System.out.println("Dato de la lista1 en la posicion 2: " + lista.get(2));
            System.out.println("Dato de la lista1 en la posicion 3: " + lista.get(3));
            System.out.println("Dato de la lista1 en la posicion 4: " + lista.get(4));

            lista.remove(0);
            lista.remove(3);
            System.out.println("\n~~~~ DATOS DESPUÉS DE LA ELIMINACIÓN ~~~~");
            System.out.println("Dato de la lista en la posicion 0: "+lista.get(0));
            System.out.println("Dato de la lista en la posicion 1: "+lista.get(1));
            System.out.println("Dato de la lista en la posicion 2: "+lista.get(2));
            lista2.add(10);
            lista2.add(15);
            lista2.add(24);
            System.out.println("\n~~~~ ELEMENTOS AGREGADOS AL ARRAYLIST ~~~~");
            System.out.println("Dato en la posicion 0: " + lista2.get(0));
            System.out.println("Dato en la posicion 1: " + lista2.get(1));
            System.out.println("Dato en la posicion 2: " + lista2.get(2));

            lista2.add(0,18);
            lista2.add(3,21);
            System.out.println("\n~~~~ ELEMENTOS DESPUÉS DE LA INTERSECIÓN ~~~~");
            System.out.println("Dato en la posicion 0: " + lista2.get(0));
            System.out.println("Dato en la posicion 1: " + lista2.get(1));
            System.out.println("Dato en la posicion 2: " + lista2.get(2));
            System.out.println("Dato en la posicion 3: " + lista2.get(3));
            System.out.println("Dato en la posicion 4: " + lista2.get(4));

            lista2.remove(0);
            lista2.remove(3);
            System.out.println("\n~~~~ ELEMENTOS DESPUÉS DE LA ELIMINACIÓN ~~~~");
            System.out.println("Dato en la posicion 0: " + lista2.get(0));
            System.out.println("Dato en la posicion 1: " + lista2.get(1));
            System.out.println("Dato en la posicion 2: " + lista2.get(2));

            //iterar lista2 para imprimir cada uno de sus elementos
            System.out.println("\n~~~~ ELEMENTOS LISTA2 ~~~~");
            for(Integer aux: lista2){
                System.out.println("Elemento: " + aux);
            }
            System.out.println("Posición del elemento 15: " + lista2.indexOf(15));
            lista2.set(0,100);
            System.out.println("El contenido de elemento 0: " + lista2.get(0));
            System.out.println("El tamaño de Lista2 es: " + lista2.size());

        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());

        }
    }
    
}
