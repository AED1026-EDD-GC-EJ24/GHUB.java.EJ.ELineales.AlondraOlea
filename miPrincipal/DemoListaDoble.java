package miPrincipal;

import listaDoble.ListaDoblementeEnlazada;

public class DemoListaDoble {
    public static void menu() throws PosicionIlegalException{
        System.out.println("===================================");
        System.out.println("     LISTA DOBLEMENTE ENLAZADA     ");
        System.out.println("===================================");
        System.out.println( );

        ListaDoblementeEnlazada<Integer> listadoble = new ListaDoblementeEnlazada<Integer>();

        listadoble.agregar(10);
        listadoble.agregar(20);
        listadoble.agregar(30);
        System.out.println(listadoble.getValor(0));
        System.out.println(listadoble.getValor(1));
        System.out.println(listadoble.getValor(2));

        
    }
}
