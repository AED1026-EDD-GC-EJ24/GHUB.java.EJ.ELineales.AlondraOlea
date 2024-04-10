package miPrincipal;
import java.util.Collection;

public class TestVector {
    public static void main(String[] args) {
      //El metodo obtenerLista retorna una coleccion de tipo Vcetor

      Collection<String> coll = UNombres.obtenerLista();

      for (String nombre : coll) {
        System.out.println(nombre);
      }
    }
}
