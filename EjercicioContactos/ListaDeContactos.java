package EjercicioContactos;

import miPrincipal.*;

public class ListaDeContactos {
    //Atributos
    private Lista<Contacto> contactos;

    //Constructor
    public ListaDeContactos() {
        contactos = new Lista<Contacto>();
    }

    //Retorna una lista de todos los contactos
    public Lista<Contacto> mostrarTodosLosContactos(){
        return contactos;
    }
    //Agrega un nuevo contacto a la lista, si todavia no hay ningun contacto
    //con los nombres y apellidos dados
    public boolean agregarContacto(String nombres, String apellidos, String direccion, 
    String correo, String telefono, String celular) throws PosicionIlegalException{
        Contacto con = buscarContacto(nombres, apellidos);
        if(con == null){
            Contacto nuevo = new Contacto(nombres, apellidos, direccion, correo, telefono, celular);
            contactos.agregar(nuevo);
            return true;
        }else{
            return false;
        }
    }
    
    //Busca un contacto dado sus nombres y apellidos, 
    //retorna el contacta si se encuentra y null en caso contrario
    private Contacto buscarContacto(String nombres, String apellidos) throws PosicionIlegalException {
        for(int i = 0; i < contactos.getTamanio(); i++){
            Contacto con = contactos.getValor(i);
            if(nombres.equals(con.getNombres()) && apellidos.equals(con.getApellidos())){
                return con;
            } 
        }
        return null; //No econtro, devuelbe null
    }

    
}
