import java.util.Scanner;
import static funciones.CambiosDeBase.cambiarADecimal;

/**
 * Capítulo 8 - Ejercicio 17
 * 
 * Pasa un número de binario a decimal.
 * 
 * @author Sergio García Domínguez
 */
public class Ejercicio17 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Vamos a cambiar un número binario a decimal\n");
    System.out.print("Introduzca el número a cambiar: ");
    long numero = Long.parseLong(s.nextLine());
  
    System.out.println(cambiarADecimal(numero, 2));
  }
  
}
