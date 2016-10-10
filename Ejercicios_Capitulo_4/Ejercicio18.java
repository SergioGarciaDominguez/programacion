/**
* Capítulo 4 - Ejercicio 18
*
* Pide un número entero (máximo 5 cifras) y nos dice cuál es la primera cifra.
*
* @author Sergio García Domínguez
*/

public class Ejercicio18 {
  public static void main (String[] args) {
    System.out.print("Introduzca un número entero (máximo 5 cifras): ");
    String texto = System.console().readLine();
    int numero = Integer.parseInt(texto);
    
    if ((texto.length() <= 5) && (numero >= 0)) {
      System.out.println("La primera cifra del número introducido es: " + texto.charAt(0));
      
    } else if ((texto.length() <= 6) && (numero < 0)) {
      System.out.println("La primera cifra del número introducido es: " + texto.charAt(1));
      
    } else {
      System.out.println("El número introducido ha de tener 5 cifras como máximo.");
    }
  }
}
