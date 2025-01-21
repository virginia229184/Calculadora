
package principal;
import menu.Menu;
import operaciones.Operaciones;

/**
 * interfaz que proporciona operaciones
 */
public class Calculadora{
	
	
	/** Método principal que inicia la ejecución de la aplicación.
	 * 
	 * @param args Array de cadenas que contiene los argumentos de la línea de comandos. 
	 * Estos argumentos pueden ser utilizados para configurar el comportamiento
	 * inicial de la aplicación.
	 */
    public static void main(String[] args) {   
    	
    	
        int resultado = 0;
        String operacion = "";
        int[] operandos = new int [2];
       
        
        Menu menu = new Menu();
        Operaciones operaciones = new Operaciones();
       
        
        do{
        	
            operandos = menu.pedirNumeros();
            operacion = menu.menuOpciones();
            
           
            if (operacion.equalsIgnoreCase("+")){
                resultado = operaciones.sumar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("-")){
                resultado = operaciones.restar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("*")){
                resultado = operaciones.multiplicar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("/")){
                resultado = operaciones.dividir(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("%")){
                resultado = operaciones.resto(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else {
                System.out.println ("Operaci�n no v�lida");
            }
        }   while (menu.repetir());
    }
}