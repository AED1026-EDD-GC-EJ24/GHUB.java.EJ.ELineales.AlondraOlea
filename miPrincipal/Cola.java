package miPrincipal;
public class Cola<T> { //Clase generica

    //Atributo cabeza que apunta al primer elemento de la cola
    private Nodo<T> cabeza;
    //Atributo cola que apunta al ultimo elemento de la cola
    private Nodo<T> cola;
    //Almacena el total de elementos de la cola
    private int tamanio;

    public Cola(){
        cabeza = null;
        cola = null;
        tamanio = 0;
    }
    public int getTamanio(){
        return tamanio;
    }
    public boolean esVacio(){
        return (cabeza == null);
    }
    public void encolar(T valor){
        //Crear nuevo nodo
        Nodo<T> nuevo = new Nodo<T>();

        //fijar el valor dentro del nodo
        nuevo.setValor(valor);
        if(esVacio()){
        //Cabeza y Cola apuntan al nuevo nodo
            cabeza = nuevo;
            cola = nuevo;
        }else{
            //Se enlaza el campo siguiente de cola con el nuevo elemento
            cola.setSiguiente(nuevo);
            //Nueva cola pasa a ser el nuevo
            cola = nuevo;
        }
        tamanio++; //Nuevo nodo por lo tanto incrementa
    }
    public void desencolar(){
        //si no es vacia
        if(!esVacio()){
            //verificar si hay un solo elemento
            if(cabeza == cola){
                cabeza = null;
                cola = null;
            }else{
                //Se elimina el primer elemento de la cola
                //dezplazando la cabeza a siguiente
                cabeza = cabeza.getSiguiente();
            }
        }
        tamanio--;
    }
    //Devuelve el primer elemento de la cola
    public T frente(){
        if(!esVacio()){
            return cabeza.getValor();
        }else{
            return null;
        }
    }   
}