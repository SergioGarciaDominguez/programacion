/**
* Capítulo 5 - Ejercicio 31
*
* Dibuja una L con asteriscos, para ello pide la altura de la L.
* 
* @author Sergio García Domínguez
*/

public class Ejercicio31 {
  public static void main (String[] args) {
    System.out.println("Vamos a dibujar una L con asteriscos.\n");
  
    System.out.print("Introduzca la altura de la L: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("\n");
    
    for (int i = 1; i < altura; i++) {
      System.out.println("*");
    }
    
    for (int i = 1; i <= (int)(altura / 2) + 1; i++) {
      System.out.print("*");
    }
  }
}
