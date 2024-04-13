package miPrincipal;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class DemoLinkedListArrayList {
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("     DemoLinkedListArrayList     ");     
        System.out.println("=================================");
        System.out.println( );
        try{
            List<Integer> lista = new LinkedList<Integer>();
            List<Integer> lista2 = new LinkedList<Integer>();
            lista.add(12);
            lista.add(15);
            lista.add(18);
            System.out.println("Dato de la lista en la posicion 0: " + lista.get(0));
            System.out.println("Dato de la lista en la posicion 1: " + lista.get(1));
            System.out.println("Dato de la lista en la posicion 2: " + lista.get(2));
            lista.add(1,13);
            lista.add(3,16);
            System.out.println("Dato de la lista en la posicion 0: " + lista.get(0));
            System.out.println("Dato de la lista en la posicion 1: " + lista.get(1));
            System.out.println("Dato de la lista en la posicion 2: " + lista.get(2));
            System.out.println("Dato de la lista en la posicion 3: " + lista.get(3));
            System.out.println("Dato de la lista en la posicion 4: " + lista.get(4));

            lista.remove(0);
            lista.remove(3);
            System.out.println("Dato de la lista en la posicion 0: "+lista.get(0));
            System.out.println("Dato de la lista en la posicion 1: "+lista.get(1));
            System.out.println("Dato de la lista en la posicion 2: "+lista.get(2));
            lista2.add(10);
            lista2.add(15);
            lista2.add(24);

            //iterar para imprimir los datos de la lista
            System.out.println("Lista 2");
            for(Integer aux: lista2){
                System.out.println(aux);
            }
            lista2.set(1,155);
            System.out.println("Lista 2");
            for(Integer aux: lista2){
                System.out.println(aux);
            }
            System.out.println("Posicion del valor 155:"+lista2.indexOf(155));
            System.out.println(lista);

        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());

        }
    }
    
}
