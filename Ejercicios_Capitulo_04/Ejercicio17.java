/**
* Capítulo 4 - Ejercicio 17
*
* Pide un número entero y nos dice cuál es la última cifra.
*
* @author Sergio García Domínguez
*/

public class Ejercicio17 {
  public static void main (String[] args) {
    System.out.print("Introduzca un número entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println("La última cifra del número introducido es: " + Math.abs(numero % 10));
  }
}
