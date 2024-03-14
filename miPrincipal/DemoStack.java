package miPrincipal;
import java.util.Stack;
public class DemoStack {
    public static void menu() {
        System.out.println("====================");
        System.out.println("        STACK       ");
        System.out.println("====================");
        System.out.println( );

        Stack<Integer> pila = new Stack<Integer>();

        //Se introducen nuevos elementos a la pila PUSH
        pila.push(2);
        pila.push(6);
        pila.push(7);
        pila.push(2);

        //Consultamos el elemento cima de la pila PEEK
        System.out.println("El TOPE de la pila es: " + pila.peek());

         //Comprueba si la pila esta vacia EMPTY
         System.out.println(pila.empty());

         //Buscar un elemento de la pila SEARCH
         System.out.println("Posicion Elemento buscado: " + pila.search(2));

        //Sacamos elementos de la pila POP
        pila.pop();
        System.out.println("El nuevo TOPE de la pila es: " + pila.peek());
        pila.pop();
        System.out.println("El nuevo nuevo TOPE de la pila es: " + pila.peek());
    }
}
