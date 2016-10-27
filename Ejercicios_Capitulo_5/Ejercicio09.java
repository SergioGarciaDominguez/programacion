/**
* Capítulo 5 - Ejercicio 09
*
* Pide un número entero y nos dice cuántos dígitos tiene.
*
* @author Sergio García Domínguez
*/

public class Ejercicio09 {
  public static void main (String[] args) {
    System.out.print("Introduzca un número entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    int digitos = 0;
    for (int i = 20; i >= 1; i--) {
      if (numero > - Math.pow(10, i) && numero < Math.pow(10, i)) {
        digitos = i;
      }
    }
    if (digitos == 1) {
      System.out.println("\nEl número tiene " + digitos + " dígito.");
    } else {
      System.out.println("\nEl número tiene " + digitos + " dígitos.");
    }
  }
}
