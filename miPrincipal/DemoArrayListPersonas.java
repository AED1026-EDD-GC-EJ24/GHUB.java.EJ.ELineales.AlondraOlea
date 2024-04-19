package miPrincipal;
import java.util.*; //List y ArrayList y Random y Iterator
import personas.Persona;
public class DemoArrayListPersonas {
/*
  *El codigo crea un arraylist lp que es nuestro objeto lista de personas, procedemos con una carga de 
  1000 objetos de clases persona
  una vez cargadas hemos hecho un recorrido sobre esta y calculamos finalmente la media de altura
  que se genero aleatoireamente de 100 a 200 cm 
  */
    public static void menu() {
            System.out.println("========================");
            System.out.println("       ArrayList        ");
            System.out.println("       Personas         ");
            System.out.println("========================");
            System.out.println();
            try{
                List<Persona> lp = new ArrayList<Persona>();
                Random r = new Random();
                Persona temp = null;
                int sumaaltura=0;
                for(int i=0;i<1000;i++){
                    lp.add(new Persona(i,"Persona"+i,r.nextInt(100)+100));
                }
                Iterator<Persona> it = lp.iterator();
                while(it.hasNext()){
                    temp = it.next();
                    System.out.println(temp);
                    sumaaltura+=temp.getAltura();
                }
                System.out.println("La media de altura del conjunto de Personas es:"+
                       sumaaltura/lp.size());
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
