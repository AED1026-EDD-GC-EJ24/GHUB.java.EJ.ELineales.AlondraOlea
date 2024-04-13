package miPrincipal;

public class DemoCola {
    public static void menu() {
        System.out.println("========================");
        System.out.println("          COLA          ");
        System.out.println("========================");
        System.out.println( );

        //Crae una nueva cola de enteros
        Cola<Integer> cola = new Cola<Integer>();

        //Encolar algunos elementos
        cola.encolar(12);
        cola.encolar(13);
        cola.encolar(14);
        cola.encolar(15);

        //Preguntamos cual es el primero y empezamos a desencolar
        System.out.println("El primer elemento de la Cola es: " + cola.frente().toString());
        cola.desencolar();
        System.out.println("El nuevo primer elemento es: " + cola.frente().toString());
        cola.desencolar();
        System.out.println("El nuevo primer elemento es: " + cola.frente().toString());
        cola.desencolar();
        System.out.println("El nuevo primer elemento es: " + cola.frente().toString());
        cola.desencolar();
        System.out.println("El nuevo primer elemento es: " + cola.frente());
        
    }
    
}


