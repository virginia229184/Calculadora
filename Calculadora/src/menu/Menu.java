package menu;
import java.util.Scanner;
/**
 * esta clase se encarga de presentar las opciones disponibles al usuario
 */


public class Menu {
	
	
	
	
    private static Scanner teclado = new Scanner(System.in);
    
	/**
	 * metodo para pedir  dos numeros enteros  al usuario
	 * 
	
	 * @return numero: devuelve los 2 numeros enteros guardados en el array
	 */
    public int[] pedirNumeros(){
        int[] ret = new int[2];
        System.out.print ("Operando 1: ");
        ret [0] = teclado.nextInt();
        System.out.print ("Operando 2: ");
        ret [1] = teclado.nextInt();
        return ret;
    }
    
  
  
    
    /**
     * metodo para mostrar un menú de opciones para realizar operaciones (+,-,*,/,%)
     * 
	 * 
	
	 * @return numero: devuelve la opcion elegida por el usuaruio
	 */
    
    public String menuOpciones() {
        String ret = "";
        do {
            System.out.print ("Operaciones [+, -, *, /, %]: ");
            ret = teclado.next();
        } while (!((ret.equalsIgnoreCase("+")) || (ret.equalsIgnoreCase("-")) ||
                (ret.equalsIgnoreCase("*")) || (ret.equalsIgnoreCase("/")) ||
                (ret.equalsIgnoreCase("%"))
                ));
                return ret;
    }
    
    /**
     * Pregunta al usuario si desea continuar utilizando la calculadora.
     *  
     *         
     * 
     * @return Un valor booleano que indica si el usuario quiere continuar
     */
    
    public boolean repetir(){
        boolean ret = false;
        String respuesta;
        do {
            System.out.print ("�Desea continuar trabajando con la calculadora? [s / n]");
            respuesta = teclado.next();
        } while (!((respuesta.equalsIgnoreCase("s")) || (respuesta.equalsIgnoreCase("n"))
                    ));
                    
        if (respuesta.equalsIgnoreCase("s")){
            ret = true;
        }
        return ret;
    }
}