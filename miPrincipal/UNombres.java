package miPrincipal;
import java.util.Collection;
import java.util.Vector;
public class UNombres {

    public static Collection<String> obtenerLista(){
         //Instanciar un Vector especializado en String
         Vector<String> v = new Vector<String>();

         //Agregar elementos al Vector
         v.add("Pablo");
         v.add("Juan");
         v.add("Pedro");
         return v;
    }
    
}
