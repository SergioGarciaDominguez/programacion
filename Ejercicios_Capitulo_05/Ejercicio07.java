/**
* Capítulo 5 - Ejercicio 07
*
* Pide la clave de una caja fuerte (4 cifras), hay 4 oportunidades para acertar el número.
*
* @author Sergio García Domínguez
*/

public class Ejercicio07 {
  public static void main (String[] args) {
    for (int i = 1; i <= 3; i++) {
      System.out.print("Introduzca la clave de la caja fuerte (4 cifras): ");
      int clave = Integer.parseInt(System.console().readLine());
      if (clave == 1234) {
        System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
        i = 4;
      } else {
        System.out.println("Lo siento, esa no es la combinación\n");
      }
    }
  }
}
