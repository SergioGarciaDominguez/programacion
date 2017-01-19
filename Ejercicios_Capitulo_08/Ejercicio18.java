import java.util.Scanner;
import static funciones.CambiosDeBase.decimalABase;

/**
 * Capítulo 8 - Ejercicio 18
 * 
 * Pasa un número de decimal a binario.
 * 
 * @author Sergio García Domínguez
 */
public class Ejercicio18 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Vamos a cambiar un número decimal a binario");
    System.out.print("Introduzca el número a cambiar: ");
    long numero = Long.parseLong(s.nextLine());
    
    System.out.println(decimalABase(numero, 2));
  }
  
}
