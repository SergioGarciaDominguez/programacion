/**
* Capítulo 5 - Ejercicio 33
*
* Pinta una U, para ello pide la altura de la U.
* 
* @author Sergio García Domínguez
*/

public class Ejercicio33 {
  public static void main (String[] args) {
    
    System.out.print("Introduzca la altura de la U: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("\n");
    
    for (int i = 1; i < altura; i++) {
      System.out.print("*");
      
      for (int j = 1; j <= altura - 2; j++) {
        System.out.print(" ");
      }
      
      System.out.println("*");
    }
    
    System.out.print(" ");
    
    for (int i = 1; i <= altura - 2; i++) {
      System.out.print("*");
    }
    
    System.out.println(" ");    
  }
}
