/**
* Capítulo 4 - Ejercicio 19
*
* Pide un número entero (máximo 5 dígitos) y nos dice cuántos dígitos tiene.
*
* @author Sergio García Domínguez
*/

public class Ejercicio19 {
  public static void main (String[] args) {
    System.out.print("Introduzca un número entero (máximo 5 cifras): ");
    int numero = Integer.parseInt(System.console().readLine());
    int digitos = 0;
    
    if (numero > -10 && numero < 10) {
      digitos = 1;
    } else if (numero > -100 && numero < 100) {
      digitos = 2;
    } else if (numero > -1000 && numero < 1000) {
      digitos = 3;
    } else if (numero > -10000 && numero < 10000) {
      digitos = 4;
    } else if (numero > -100000 && numero < 100000) {
      digitos = 5;
    }
    
    if (digitos != 0) {
      if (digitos == 1) {
        System.out.println("\nEl número tiene " + digitos + " dígito.");
      } else {
      System.out.println("\nEl número tiene " + digitos + " dígitos.");
      }
    } else {
      System.out.println("\nEl número introducido ha de tener 5 cifras como máximo.");
    }
  }
}
