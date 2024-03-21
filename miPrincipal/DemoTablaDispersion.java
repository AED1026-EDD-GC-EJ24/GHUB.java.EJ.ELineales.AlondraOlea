package miPrincipal;
import java.util.*;

public class DemoTablaDispersion {
    public static void menu() {
        System.out.println("===============================");
        System.out.println("      TABLA DE DISPERSIÓN      ");
        System.out.println("===============================");
        System.out.println( );
        //Instanciar varias personas 
        Persona p1 = new Persona("Pablo", 23, "Argentina");
        Persona p2 = new Persona("Juan", 25, "Mexicano");
        Persona p3 = new Persona("Pedro", 18, "Español");

        //Crear la Tabla Hash ES GENERICA POR LO QUE VA <>
        Hashtable<String, Persona> tabla = new Hashtable<String, Persona>();

        //Agregamos a las personas tomando su nombre como CLAVE (AGREGAR = PUT)

        tabla.put(p1.getNombre(), p1);
        tabla.put(p2.getNombre(), p2);
        tabla.put(p3.getNombre(), p3);

        //Acceso a cada uno de los elementos de la tabla por su clave

        System.out.println(tabla.get("Pablo"));
        System.out.println(tabla.get("Juan"));
        System.out.println(tabla.get("Pedro"));

        //En este caso regresa un NULL ya que no hay ningun objeto
        //asociado a la clave Rolando
        System.out.println(tabla.get("Rolando"));

        /*
         * Obtengo una enumeracion de las claves existentes en la tabla
         * se recorre y por cada una se accede al elemento asociado para
         * mostrar "clave = valor"
         */
        System.out.println("\n======== ELEMENTOS SIN PEDIR UNO POR UNO ========");
        String aux;
        Enumeration<String> keys = tabla.keys();

        //DIFERENCIA = AQUI NO SE RESPETA EL ORDEN DE COMO SE AGREGARON LOS ELEMENTOS
        while(keys.hasMoreElements()){
            aux = keys.nextElement();
            System.out.println(aux + " = " + tabla.get(aux));
        }
    }    
}
