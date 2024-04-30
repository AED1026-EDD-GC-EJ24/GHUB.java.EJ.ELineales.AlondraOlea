package miPrincipal;
import EjercicioContactos.Contacto;
import java.util.LinkedList;
public class ExamenUni3_OleaCardenas {
    public static void main(String[] args) {
    LinkedList<Contacto> lista = new LinkedList<Contacto>();

    //Agregar 3 contactos nuevos
    lista.add(new Contacto("Alondra", "Olea", "Calle 12345", "alondra12@gmail.com", "6674853322", "5566332"));
    lista.add(new Contacto("Isaac", "Medina", "Sandin234", "Isaac234@gmail.com", "6685742365", "8855669"));
    lista.add(new Contacto("Jose Juan", "Lopez Lopez", "vuelta Plaza 12", "JuanLopez@gmail.com", "6685742365", "2365741"));

    //Agregamos 2 contactos en la posicion 1 y 2 (0 y 1 en programa)
    lista.add(0, new Contacto("Manuel", "Osuna", "SanPedro", "OsunaManuel@gmail.com", "6678962541", "78962541"));
    lista.add(1, new Contacto("Rocio", "Uriarte", "Culiacan98", "rociorocio@gmail.com", "6679856241", "123987"));

    System.out.println("~~~~ LISTA DE CONTACTOS DESPUES DE AGREGAR ~~~~");
    int i = 1;
    for (Contacto contacto : lista) {
        System.out.println("Contacto "+ i+ ": " + contacto);
        i++;
    }
    //Removemos el ultimo en la lista
    lista.removeLast();
    System.out.println("~~~~ LISTA DE CONTACTOS DESPUES DE ELIMINAR ULTIMO ~~~~");
    int j = 1;
    for (Contacto contacto : lista) {
        System.out.println("Contacto "+ j+ ": " + contacto);
        j++;
    }
}
}