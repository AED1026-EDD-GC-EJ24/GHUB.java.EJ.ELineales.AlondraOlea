package miPrincipal;
import java.util.*;
public class Principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc = 0;
        do{
            System.out.println("===========================");
            System.out.println("    ESTRUCTURA LINEALES    ");
            System.out.println("===========================");
            System.out.println("1) Pila"); //ultimo en entrar primero en salir
            System.out.println("2) Stack");
            System.out.println("3) Demilitadores");
            System.out.println("4) Expresion infija a posfija");
            System.out.println("5) Cola"); //primero en entrar primero en salir (filas super, banco, etc)
            System.out.println("0) Salir");
            System.out.println( );
            System.out.println("Selecciona opción de Estructura: ");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    DemoPila.menu();
                    break;
                case 2:
                    DemoStack.menu();
                    break;
                case 3:
                    DemoDelimitadores.menu();
                    break;
                case 4:
                //TAREA
                    break;
                case 5:
                    DemoCola.menu();
                    break;
                case 0:
                    System.out.println("PROGRAMA FINALIZADO:)");
                    leer.close();
                    break;
                default:
                System.out.println("Valor incorrecto, intente de nuevo:()");
                    break;
            }
        }while(opc != 0);
    }
}