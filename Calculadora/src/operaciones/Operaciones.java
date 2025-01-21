package operaciones;
public class Operaciones{
	
	
	/**metodo para sumar dos numeros enteros
	 *  
	 * @param valor1
	 * @param valor2
	 * @return numero: es la suma de los dos anteriores 
	 */
    public int sumar (int valor1, int valor2){
        int numero;
        numero = valor1 + valor2;
        return numero;
    }
    
    
    
    
    
	/**
	 * metodo para restar dos numeros enteros 
	 * @param valor1
	 * @param valor2
	 * @return numero:  resta de los valores anteriores
	 */
    
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
    }
    
    /**
     * metodo para multiplicar dos numeros enteros 
	 * @param valor1
	 * @param valor2
	 * @return numero: multiplicacion de los valores anteriores
	 */
    
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
    
    /**
     * metodo para dividir dos numeros enteros 
   	 * @param valor1
   	 * @param valor2
   	 * @return numero: division de los valores anteriores
   	 */
       
    public int dividir (int valor1, int valor2){
        int numero;
        numero = valor1 / valor2;
        return numero;
    }
    
    
   
 
    /**
     * metodo para calcular el resto 
     * @param valor1
     * @param valor2
     * @return el resto de la division
     */
    public int resto (int valor1, int valor2){
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
}