package miPrincipal;

public class DemoPila {
    public static void menu() {
        System.out.println("====================");
        System.out.println("        PILA        ");
        System.out.println("====================");
        System.out.println( );

        //Crear una nueva pila de enteros
        Pila<Integer> pila1 = new Pila<Integer>();

        //Apilar elementos
        pila1.apilar(2);
        pila1.apilar(5);
        pila1.apilar(7);

        System.out.println("El TOPE de la pila es: " + pila1.cima());
        pila1.retirar();
        System.out.println("El TOPE de la pila es: " + pila1.cima());
        pila1.retirar();
        System.out.println("El TOPE de la pila es: " + pila1.cima());
        pila1.retirar();
        System.out.println("El TOPE de la pila es: " + pila1.cima());
    }
}


