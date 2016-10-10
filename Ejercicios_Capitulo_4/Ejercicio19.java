<<<<<<< HEAD
/**
* Capítulo 4 - Ejercicio 19
*
* Pide un número entero (máximo 5 dígitos) y nos dice cuántos dígitos tiene.
*
* @author Sergio García Domínguez
*/

public class Ejercicio19 {
  public static void main (String[] args) {
    System.out.print("Introduzca un número entero (máximo 5 dígitos): ");
    String texto = System.console().readLine();
    int numero = Integer.parseInt(texto);
    
    if ((texto.length() <= 5) && (numero >= 0)) {
      System.out.println("El número introducido tiene " + texto.length() + " cifras.");
      
    } else if ((texto.length() <= 6) && (numero < 0)) {
      System.out.println("El número introducido tiene " + (texto.length() - 1) + " cifras.");
      
    } else {
      System.out.println("El número introducido ha de tener 5 cifras como máximo.");
    }
  }
}
=======
/**
* Capítulo 4 - Ejercicio 19
*
* Pide un número entero (máximo 5 dígitos) y nos dice cuántos dígitos tiene.
*
* @author Sergio García Domínguez
*/

public class Ejercicio19 {
  public static void main (String[] args) {
    System.out.print("Introduzca un número entero (máximo 5 dígitos): ");
    String texto = System.console().readLine();
    int numero = Integer.parseInt(texto);
    
    if ((texto.length() <= 5) && (numero >= 0)) {
      System.out.println("El número introducido tiene " + texto.length() + " cifras.");
      
    } else if ((texto.length() <= 6) && (numero < 0)) {
      System.out.println("El número introducido tiene " + (texto.length() - 1) + " cifras.");
      
    } else {
      System.out.println("El número introducido ha de tener 5 cifras como máximo.");
    }
  }
}
>>>>>>> 530340828eb844188b0723543c83a26973aa8d3f
