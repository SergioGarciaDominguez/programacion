/**
* Capítulo 5 - Ejercicio 35
*
* El programa dibuja una X con asteriscos, para ello pide la altura (mínimo 3).
* 
* @author Sergio García Domínguez
*/

public class Ejercicio35 {
  public static void main (String[] args) {
    
    System.out.print("Por favor, introduzca un número: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    int alturaMitad = (int)((altura - 1) / 2);
    
    System.out.print("\n");
    
    if (altura >= 3 && altura % 2 == 1) {
      for (int i = alturaMitad; i > 1; i--) {
        for (int j = alturaMitad; j > i; j--) {
          System.out.print(" ");
        }
        System.out.print("*");
        for (int j = 1; j <= 2 * i - 3; j++) {
          System.out.print(" ");
        }
        System.out.println("*");
      }
      for (int i = 1; i < alturaMitad; i++) {
        System.out.print(" ");
      }
      System.out.println("*");
      for (int i = 2; i <= alturaMitad; i++) {
        for (int j = (int)((altura - 1) / 2); j > i; j--) {
          System.out.print(" ");
        }
        System.out.print("*");
        for (int j = 1; j < 2 * i - 2; j++) {
          System.out.print(" ");
        }
        System.out.println("*");
      }
    } else {
      System.out.print("Debe introducir un número entero impar mayor o igual a 3");
    }
  }
}
