package operaciones;
/**
 * esta clase contiene metododos para realizar operaciones basicas
 */
public class Operaciones{
	
	
	/**metodo para sumar dos numeros enteros
	 *  
	 * @param valor1 : Es el primer numero
	 * @param valor2 : es el segundo numero
	 * @return numero: es la suma de los dos anteriores 
	 */
    public int sumar (int valor1, int valor2){
        int numero;
        numero = valor1 + valor2;
        return numero;
    }
    
    
    
    
    
	/**
	 * metodo para restar dos numeros enteros 
	 * @param valor1 : Es el primer numero
	 * @param valor2 : es el segundo numero
	 * @return numero:  resta de los valores anteriores
	 */
    
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
    }
    
    /**
     * metodo para multiplicar dos numeros enteros 
	 * @param valor1 : Es el primer numero
	 * @param valor2 : es el segundo numero
	 * @return numero: multiplicacion de los valores anteriores
	 */
    
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
    
    /**
     * metodo para dividir dos numeros enteros 
   	 * @param valor1 : Es el primer numero
	 * @param valor2 : es el segundo numero
   	 * @return numero: division de los valores anteriores
   	 */
       
    public int dividir (int valor1, int valor2){
        int numero;
        numero = valor1 / valor2;
        return numero;
    }
    
    
   
 
    /**
     * metodo para calcular el resto 
     * @param valor1 : Es el primer numero
	 * @param valor2 : es el segundo numero
     * @return el resto de la division
     */
    public int resto (int valor1, int valor2){
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
}