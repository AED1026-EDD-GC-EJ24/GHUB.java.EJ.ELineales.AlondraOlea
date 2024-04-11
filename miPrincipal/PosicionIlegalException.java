package miPrincipal;

public class PosicionIlegalException extends Exception{
    public PosicionIlegalException(){
        super("Posición Ilegal en la lista");
    }
}
