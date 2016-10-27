/**
* Capítulo 5 - Ejercicio 08
*
* Muestra la tabla de multiplicar de un número introducido por teclado.
*
* @author Sergio García Domínguez
*/

public class Ejercicio08 {
  public static void main (String[] args) {
    System.out.print("Introduzca un número entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    System.out.println("\nLa tabla de multiplicar de " + numero + " es:\n");
    
    for (int i = 0; i <= 10; i++) {
      System.out.printf(numero + " x %-2d = %2d\n", i, numero * i);
    }
  }
}
