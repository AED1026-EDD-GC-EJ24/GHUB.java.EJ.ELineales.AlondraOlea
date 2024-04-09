package miPrincipal;
import java.util.*;
public class DemoEstCombinada {
    public static void menu() {
        System.out.println("================================");
        System.out.println("     ESTRUCTURA COMBINADA       "); //Estructura que SI puede tener 
        System.out.println("     HashTable - LinkedList     "); //REPETIDOS las claves 
        System.out.println("================================"); //HASHTABLE Y LISTAS 
        System.out.println( );

        //Crear una tabla Hash
        HashTable2<Integer> ht = new HashTable2<Integer>();
        ht.put("par", 2);
        ht.put("par", 4);
        ht.put("par", 6);
        ht.put("impar", 1);
        ht.put("par", 8);
        ht.put("impar", 3);
        ht.put("impar", 5);
        ht.put("par", 10);
        ht.put("impar", 7);
        ht.put("impar", 9);

        LinkedList<Integer> pares = ht.get("par"); 
        System.out.println("==== NUMEROS PARES ====");
        for (Integer i : pares) {
            System.out.println(i);
        }
        LinkedList<Integer> impares = ht.get("impar");
        System.out.println("==== NUMEROS IMPARES ====");
        for (Integer i : impares) {
            System.out.println(i);
        }
        
        Collection<String> keys = ht.keys();
        for (String k : keys) {
            System.out.println(k);
        }
    }
}
