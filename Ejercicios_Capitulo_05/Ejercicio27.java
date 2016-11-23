/**
* Capítulo 5 - Ejercicio 27
*
* Pide un número y muestra todos los múltiplos de 3 entre 1 y ese número.
* 
* @author Sergio García Domínguez
*/

public class Ejercicio27 {
  public static void main (String[] args) {
    System.out.println("Vamos a mostrar todos los múltiplos de 3 entre 1 y un número introducido"
        + " por el teclado\n");
  
    System.out.print("Introduzca el número entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    if (numero >= 1) {
      
      for (int i = 1; i <= numero; i++) {
        if (i % 3 == 0) {
          if (i <= numero - 3) {
            System.out.print(i + ", ");
          } else {
            System.out.print(i + ".");
          }
        }
      }
      
    } else {
      
      for (int i = 1; i >= numero; i--) {
        if (i % 3 == 0) {
          if (i >= numero + 3) {
            System.out.print(i + ", ");
          } else {
            System.out.print(i + ".");
          }
        }
      }
      
    }
  }
}
