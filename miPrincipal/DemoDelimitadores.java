package miPrincipal;

public class DemoDelimitadores {
    public static void menu() {
        System.out.println("============================");
        System.out.println("        DELIMITADORES       ");
        System.out.println("============================");
        System.out.println( );

        String expr = "(a+b/2)";

        Delimitadores objDel = new Delimitadores();
        if (objDel.evaluacionDelimitadores(expr)) 
            System.out.println("Expresión Correcta");
        else
            System.out.println("Expresión Incorrecta");

        expr = "while (m<(n[8]+o)) { "+
        "int p=7; "+
        "/*comentarios*/"+
        "               } ";
        if (objDel.evaluacionDelimitadores(expr)) 
            System.out.println("Expresión Correcta");
        else
            System.out.println("Expresión Incorrecta");
        
        expr= "while (m<(n[8]+o)) { "+
            "int p=7; "+
            "/*comentarios*/";
        if (objDel.evaluacionDelimitadores(expr))
             System.out.println("Expresión correcta");
        else
            System.out.println("Expresión Incorrecta");  
    }
    
}
