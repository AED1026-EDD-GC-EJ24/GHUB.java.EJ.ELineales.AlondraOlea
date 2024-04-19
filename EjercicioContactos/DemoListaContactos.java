package EjercicioContactos;
import java.util.*;

import miPrincipal.Lista;
import miPrincipal.PosicionIlegalException;

public class DemoListaContactos{
    public static void menu() throws PosicionIlegalException{
        System.out.println("===========================");
        System.out.println("      LISTA CONTACTOS      ");
        System.out.println("===========================");
        System.out.println( );

        ListaDeContactos ldc = new ListaDeContactos();
        //agregamos algunos contactos
        ldc.agregarContacto("Fernando", "Castro", "C11 12 No. 12-12 Papagayo", "fernando@gmail.com", "8207858", "314878245");
        ldc.agregarContacto("Maria Andrea", "Vargas", "C11 11 No. 10-45", "marix@gmail.com", "8237252", "3113231231");
        ldc.agregarContacto("Carolina", "Sanchez", ", ", "caro@gmail.com", "8211121", "30012587496");
        ldc.agregarContacto("Federico", "Cardenas", ",", "fede@gmail.com", "8965471", "2216857496");

        System.out.println("\n~~~~ LISTADO DE TODOS LOS CONTACTOS ~~~~");
        Lista<Contacto> listado = ldc.mostrarTodosLosContactos();
        for (int i = 0; i < listado.getTamanio(); i++) {
            System.out.println(listado.getValor(i));
        }
        if(ldc.eliminarContacto("Federico", "Cardenas")){
            System.out.println("Contacto Eliminado.");
        }
        listado = ldc.mostrarTodosLosContactos();
        System.out.println("\n~~~~ LISTADO DESPUES DE ELIMINAR CONTACTOS ~~~~");
        for (int i = 0; i < listado.getTamanio(); i++) {
            System.out.println(listado.getValor(i));
        }
        ldc.modificarContacto("Fernando", "Castro", "Cra 16 No. 11-12 Cali", "fernando@gmail.com", "82523230", "314878245");
    }
}
