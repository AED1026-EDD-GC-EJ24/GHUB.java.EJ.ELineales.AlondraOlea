package miPrincipal;

public class Delimitadores {
    public boolean evaluacionDelimitadores(String cadena){
        Pila<String> pilaCaracteres = new Pila<String>();
        int i = 0;
        boolean masElementosPorLeer = true;
        while(i < cadena.length() && masElementosPorLeer){
            char car = cadena.charAt(i);
            String s = charToString(car);
            i++;
            switch(car){
                //En caso de apilar
            case '(':
                pilaCaracteres.apilar(charToString(')'));
                break;
            case '[':
                pilaCaracteres.apilar(charToString(']'));
                break;
            case '{':
                pilaCaracteres.apilar(charToString('}'));
                break;
            case '/':
                if(siguienteEsAsterisco(cadena, i)){
                    pilaCaracteres.apilar(charToString('/'));
                i++;
                }
                break;

            //PARA DESAPILAR
            case')':
            case']':
            case '}':
            {

            //comparar que corresponde
            String aux = pilaCaracteres.cima();
            if(aux != null){
                if(s.compareTo(aux) == 0){

                    //Hay correspondencia por lo cual son iguales y elimino
                    pilaCaracteres.retirar();
                }else{
                    masElementosPorLeer = false;
                }
            }
            break;
        }
            case '*':
            {
                if(siguienteEsDiagonal(cadena, i)){
                    pilaCaracteres.retirar();
                    i++;
                }
            }
            default:
                break;
               }
        }//TERMINA EL WHILE
        if(pilaCaracteres.esVacio() && masElementosPorLeer)
            return true;
        else
            return false;

    }
    //convierte un char a un objeto tipo String
    private static String charToString(char ch) {
        return String.valueOf(ch);
    }
    private static boolean siguienteEsAsterisco(String cadena, int posicion){
        char car = cadena.charAt(posicion);
        if(car == '*')
            return true;
        else
            return false;
    }
    private static boolean siguienteEsDiagonal(String cadena, int posicion){
        char car = cadena.charAt(posicion);
        if(car == '/')
            return true;
        else
            return false;
    }

}
