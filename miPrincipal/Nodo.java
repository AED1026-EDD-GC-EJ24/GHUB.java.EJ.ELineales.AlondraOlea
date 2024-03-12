package miPrincipal;
public class Nodo<T>{
    // Atributos de valor tipo T. Almacenan la referencia al objeto *(variable generica)*
    //que se guarda en el nodo
    private T valor;
    //Referencia al siguiente nodo enlazado
    Nodo<T> siguiente;

    //Constructr por defecto
    public Nodo(){
        valor = null;
        siguiente = null;
    }
    //Regresa el valor
    public T getValor(){
        return valor;
    }
    //Modifica el valor
    public void setValor(T valor){
        this.valor = valor;
    }
    //Devuelve el atributo siguiente
    public Nodo<T> getSiguiente(){
        return siguiente;
    }
    //Modifica el atributo siguiente
    public void setSiguiente(Nodo<T> siguiente){
        this.siguiente = siguiente;
    }
    //PILA UNA LISTA LIGADA
}