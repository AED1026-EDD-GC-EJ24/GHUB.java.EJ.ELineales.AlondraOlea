package miPrincipal;
public class Pila<T> {

    ///Atributo cabeza que apunta al tope de la pila
    private Nodo<T> cabeza;
    //Almacena el total de elementos de la pila
    private int tamanio;

    //Constructor
    public Pila(){
        cabeza = null;
        tamanio = 0;
    }

    //Devuelve el total de elementos de la pila
    public int getTamanio(){
        return tamanio;
    }
    //Verifica si la pila esta vacia
    public boolean esVacio(){
        return (cabeza == null);
    }
    //Apila un elemento nuevo
    public void apilar(T valor){
        //Crear un nuevo Nodo
        Nodo<T> nuevo = new Nodo<T>(); //CREAR NUEVO NODO
        //Fijar el valor dentro del nodo
        nuevo.setValor(valor);
        if(esVacio()){
            //Cuando esta vacia la cabeza apunta al nodo nuevo
            cabeza = nuevo;
        }else{
            //Se enlaza el campo siguiente el nuevo con la cabeza
            nuevo.setSiguiente(cabeza);
            //La nueva cabeza de la pila pasa a ser nuevo
            cabeza = nuevo;
        }
        //Incremento el tamaño de la pila por el nuevo nodo
        tamanio ++;
    } 
    //Elimina un elemento de la pila
    public void retirar(){
        if(!esVacio()){
            cabeza = cabeza.getSiguiente();
            tamanio--;
        }
    }
    //Devueve el elemento almacenado en el TOPE de la pila
    public T cima(){
        if(!esVacio()){
            return cabeza.getValor();
        }else{
            return null;
        }
    }



    
}