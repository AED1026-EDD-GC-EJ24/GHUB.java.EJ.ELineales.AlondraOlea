package miPrincipal;

public class DemoInfijaPrefija {
    public static void menu(){
        System.out.println("==============================================");
        System.out.println("    COVIERTE UNA EXPRESION INFIJA A PREFIJA   ");
        System.out.println("==============================================");
        System.out.println();
        String expresionInfija = "a + b * c";//expresión valida
		String expresionPrefijo;
		
		if (new Delimitadores().evaluacionDelimitadores(expresionInfija)) {
			expresionPrefijo = InfijaPrefija.convertirAPrefijo(expresionInfija);
			System.out.println("Expresión infija: " + expresionInfija);
	        System.out.println("Expresión prefijo: " + expresionPrefijo);
	       
	        System.out.println("Resultado ="+InfijaPrefija.evaluarPrefija(expresionPrefijo));
		}
		else{
			System.out.println("Expresión infija: " + expresionInfija);
			System.out.println("Expresión Infija no válida");
			
		}	
		
        
        expresionInfija = "(a + b) * c"; //expresión valida
        if (new Delimitadores().evaluacionDelimitadores(expresionInfija)) {
			expresionPrefijo = InfijaPrefija.convertirAPrefijo(expresionInfija);
			System.out.println("Expresión infija: " + expresionInfija);
	        System.out.println("Expresión prefijo: " + expresionPrefijo);
	        
	        System.out.println("Resultado ="+InfijaPrefija.evaluarPrefija(expresionPrefijo));
		}
		else{
			System.out.println("Expresión infija: " + expresionInfija);
			System.out.println("Expresión Infija no válida");
		}	
        
        expresionInfija = "(a + (e+z)+b) * c"; //expresión valida
        if (new Delimitadores().evaluacionDelimitadores(expresionInfija)) {
			expresionPrefijo = InfijaPrefija.convertirAPrefijo(expresionInfija);
			System.out.println("Expresión infija: " + expresionInfija);
	        System.out.println("Expresión prefijo: " + expresionPrefijo);
	        
	        System.out.println("Resultado ="+InfijaPrefija.evaluarPrefija(expresionPrefijo));
		}
		else{
			System.out.println("Expresión infija: " + expresionInfija);
			System.out.println("Expresión Infija no válida");
		}	
        expresionInfija = "(a + (e+z)/b) * c"; //expresión valida
        if (new Delimitadores().evaluacionDelimitadores(expresionInfija)) {
			expresionPrefijo = InfijaPrefija.convertirAPrefijo(expresionInfija);
			System.out.println("Expresión infija: " + expresionInfija);
	        System.out.println("Expresión prefijo: " + expresionPrefijo);
	        
	        System.out.println("Resultado ="+InfijaPrefija.evaluarPrefija(expresionPrefijo));
		}
		else{
			System.out.println("Expresión infija: " + expresionInfija);
			System.out.println("Expresión Infija no válida");
		}	
        
        
        expresionInfija = "(X + Z) * W / T ^ Y - V";//expresión valida
        if (new Delimitadores().evaluacionDelimitadores(expresionInfija)) {
			expresionPrefijo = InfijaPrefija.convertirAPrefijo(expresionInfija);
			System.out.println("Expresión infija: " + expresionInfija);
	        System.out.println("Expresión prefijo: " + expresionPrefijo);
	        
	        System.out.println("Resultado ="+InfijaPrefija.evaluarPrefija(expresionPrefijo));
		}
		else{
			System.out.println("Expresión infija: " + expresionInfija);
			System.out.println("Expresión Infija no válida");
		}	
        
        
        expresionInfija = "(X + Z) * W / [T ^ Y - V"; //expresión inválida
        if (new Delimitadores().evaluacionDelimitadores(expresionInfija)) {
			expresionPrefijo = InfijaPrefija.convertirAPrefijo(expresionInfija);
			System.out.println("Expresión infija: " + expresionInfija);
	        System.out.println("Expresión prefijo: " + expresionPrefijo);
	        
	        System.out.println("Resultado ="+InfijaPrefija.evaluarPrefija(expresionPrefijo));
		}
		else {
			System.out.println("Expresión infija: " + expresionInfija);
			System.out.println("Expresión Infija no válida");
		}	
        
        expresionInfija = "(X + Z)) * W / [T ^ Y - V"; //expresión inválida
        if (new Delimitadores().evaluacionDelimitadores(expresionInfija)) {
			expresionPrefijo = InfijaPrefija.convertirAPrefijo(expresionInfija);
			System.out.println("Expresión infija: " + expresionInfija);
	        System.out.println("Expresión prefijo: " + expresionPrefijo);
	        
	        System.out.println("Resultado ="+InfijaPrefija.evaluarPrefija(expresionPrefijo));
		}
		else {
			System.out.println("Expresión infija: " + expresionInfija);
			System.out.println("Expresión Infija no válida");
		}	
        		
    }
    
}
