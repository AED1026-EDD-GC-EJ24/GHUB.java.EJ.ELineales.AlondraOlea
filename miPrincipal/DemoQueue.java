package miPrincipal;
import java.util.Queue; //Interface (ES UNA COLA)
import java.util.LinkedList;

/* Queue es una interface, por lo que se requiere instamnciar como un objeto 
en concreto: Se puede elegir una de las implementaciones de la API Collections de java:
java.util.LikedList o java.util.PriorityQueue;

LinkedList: es una cola estandar 
PriorityQueue: es una cola con prioridades que almacena elementos internos de acuerdo al orden

add() = inserta un elemento en la cola
remove() = devuelve y remueve el primer elemento de la cola
peek() = devuelve el primer elemento de la cola y devuelve null cuando la cola esta vacia
*/ 
public class DemoQueue {
    public static void menu() {
        System.out.println("===========================");
        System.out.println("            QUEUE          ");
        System.out.println("===========================");
        System.out.println();

        //Crea una cola generica
        Queue micola = new LinkedList();

        //Agregar elemenos a la Cola
        micola.add("Elemento 0");
        micola.add("Elemento 1");
        micola.add("Elemento 2");

        //Muestra el primer elemento de la cola
        System.out.println("El primer elemento de la Cola es: " + micola.peek());
        micola.remove();
        System.out.println("El nuevo primer elemento de la Cola es: " + micola.peek());
        micola.remove();
        System.out.println("El nuevo primer elemento de la Cola es: " + micola.peek());
        micola.remove();
        System.out.println("El nuevo primer elemento de la Cola es: " + micola.peek());


        
    }

    
}