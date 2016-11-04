/**
* Capítulo 5 - Ejercicio 16
*
* Pide un número entero y te devuelve si es primo
* 
* @author Sergio García Domínguez
*/

public class Ejercicio16 {
  public static void main (String[] args) {
    System.out.print("Introduzca un número entero y delvolverá si es primo: ");
    int numero = Integer.parseInt(System.console().readLine());
    boolean primo = true;
    
    if (numero > 2) {
      
      for (int i = (Math.abs(numero) - 1); i > 1; i--) {
        
        if (numero % i == 0) {
          primo = false;
        }
      }
    
    } else if (numero == 0) {
      primo = false;
    }
    
    if (primo) {
      System.out.println("\nEl número " + numero + " es primo.");
    } else {
      System.out.println("\nEl número " + numero + " no es primo.");
    }
  }
}
