package miPrincipal;

public class DemoListaSimple {
    public static void menu() throws PosicionIlegalException{
        System.out.println("===============================");
        System.out.println("     LISTA SIMPLE ENLAZADA     ");
        System.out.println("===============================");
        System.out.println( );

        Lista<Integer> lista = new Lista<Integer>();
        lista.agregar(12);
        lista.agregar(15);
        lista.agregar(20);

         //imprimir los datos agregados
         System.out.println("Dato en la posicion 0:"+lista.getValor(0));
         System.out.println("Dato en la posicion 1:"+lista.getValor(1));
         System.out.println("Dato en la posicion 2:"+lista.getValor(2));
 
         lista.insertar(13, 1);
         lista.insertar(16,3);
         System.out.println("Dato en la posicion 0:"+lista.getValor(0));
         System.out.println("Dato en la posicion 1:"+lista.getValor(1));
         System.out.println("Dato en la posicion 2:"+lista.getValor(2));
         System.out.println("Dato en la posicion 3:"+lista.getValor(3));
         System.out.println("Dato en la posicion 4:"+lista.getValor(4));
         lista.insertar(17,0);
         System.out.println("Dato en la posicion 0:"+lista.getValor(0));
         System.out.println("Dato en la posicion 1:"+lista.getValor(1));
         System.out.println("Dato en la posicion 2:"+lista.getValor(2));
         System.out.println("Dato en la posicion 3:"+lista.getValor(3));
         System.out.println("Dato en la posicion 4:"+lista.getValor(4));
         System.out.println("Dato en la posicion 5:"+lista.getValor(5));
         lista.insertar(11,6);
         System.out.println("Dato en la posicion 0:"+lista.getValor(0));
         System.out.println("Dato en la posicion 1:"+lista.getValor(1));
         System.out.println("Dato en la posicion 2:"+lista.getValor(2));
         System.out.println("Dato en la posicion 3:"+lista.getValor(3));
         System.out.println("Dato en la posicion 4:"+lista.getValor(4));
         System.out.println("Dato en la posicion 5:"+lista.getValor(5));
         System.out.println("Dato en la posicion 6:"+lista.getValor(6));
         //lista.insertar(11,8);
         lista.remover(0);
         System.out.println("Dato en la posicion 0:"+lista.getValor(0));
         System.out.println("Dato en la posicion 1:"+lista.getValor(1));
         System.out.println("Dato en la posicion 2:"+lista.getValor(2));
         System.out.println("Dato en la posicion 3:"+lista.getValor(3));
         System.out.println("Dato en la posicion 4:"+lista.getValor(4));
         System.out.println("Dato en la posicion 5:"+lista.getValor(5));
         lista.remover(1);
         System.out.println("Dato en la posicion 0:"+lista.getValor(0));
         System.out.println("Dato en la posicion 1:"+lista.getValor(1));
         System.out.println("Dato en la posicion 2:"+lista.getValor(2));
         System.out.println("Dato en la posicion 3:"+lista.getValor(3));
         System.out.println("Dato en la posicion 4:"+lista.getValor(4));
    }
    
}
