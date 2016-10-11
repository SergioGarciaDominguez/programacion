/**
* Capítulo 4 - Ejercicio 20
*
* Pide un número entero positivo (máximo 5 cifras) y nos dice si es capicúa.
*
* @author Sergio García Domínguez
*/

public class Ejercicio20 {
  public static void main (String[] args) {
    System.out.print("Introduzca un número entero (máximo 5 cifras): ");
    int numero = Integer.parseInt(System.console().readLine());
    boolean capicua = false;
    
    if (numero > -10 && numero < 10) {
      capicua = true;
    } else if (numero > -100 && numero < 100) {
      if (numero / 10 == numero % 10) {
        capicua = true;
      }
    } else if (numero > -1000 && numero < 1000) {
      if (numero / 100 == numero % 10) {
        capicua = true;
      }
    } else if (numero > -10000 && numero < 10000) {
      if ((numero / 1000 == numero % 10) && ((numero / 100) % 10 == (numero / 10) % 10)) {
        capicua = true;
      }
    } else if (numero > -100000 && numero < 100000) {
      if ((numero / 10000 == numero % 10) && ((numero / 1000) % 10 == (numero / 10) % 10)) {
        capicua = true;
      }
    }
    
    if (capicua == true) {
      System.out.println("\n El número " + numero + " es capicúa.");
    } else {
      System.out.println("\n El número " + numero + " no es capicúa.");
    }
    
  }
}
