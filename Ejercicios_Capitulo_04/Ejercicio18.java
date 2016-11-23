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
    int numero = Integer.parseInt(System.console().readLine());
    int primeraCifra = numero;
    
    if (numero > -10 && numero < 10) {
      
    } else if (numero > -100 && numero < 100) {
      primeraCifra = (numero / 10);
    } else if (numero > -1000 && numero < 1000) {
      primeraCifra = (numero / 100);
    } else if (numero > -10000 && numero < 10000) {
      primeraCifra = (numero / 1000);
    } else if (numero > -100000 && numero < 100000) {
      primeraCifra = (numero / 10000);
    }
    
    System.out.println("\nLa primera cifra es: " + primeraCifra);
  }
}
