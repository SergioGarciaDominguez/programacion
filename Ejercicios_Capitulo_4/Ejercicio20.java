<<<<<<< HEAD
/**
* Capítulo 4 - Ejercicio 20
*
* Pide un número entero positivo (máximo 5 cifras) y nos dice si es capicúa.
*
* @author Sergio García Domínguez
*/

public class Ejercicio20 {
  public static void main (String[] args) {
    System.out.print("Introduzca un número entero positivo (máximo 5 cifras)");
    String numero = System.console().readLine();
    
    if ((numero.length() <= 5) && (Integer.parseInt(numero) >= 0)) {
      boolean capicua = false;
      
      if (numero.length() == 1) {
        capicua = true;
      } else if (numero.length() == 2) {
        if (numero.charAt(0) == numero.charAt(1)) {
          capicua = true;
        }
      } else if (numero.length() == 3 ){
        if (numero.charAt(0) == numero.charAt(2)) {
          capicua = true;
        }
      } else if (numero.length() == 4) {
        if (numero.charAt(0) == numero.charAt(3) && numero.charAt(1) == numero.charAt(2)) {
          capicua = true;
        }
      } else {
        if (numero.charAt(0) == numero.charAt(4) && numero.charAt(1) == numero.charAt(3)) {
          capicua = true;
        }
      }
      
      if (capicua == true) {
        System.out.print("El número " + numero + " es capicúa.");
      
      } else {
        System.out.print("El número " + numero + " no es capicúa.");
      }
      
    } else {
      System.out.println("Número introducido incorrecto."
          + " Ha de ser un número entero positivo (máximo 5 cifras)");
    }
  }
}
=======
/**
* Capítulo 4 - Ejercicio 20
*
* Pide un número entero positivo (máximo 5 cifras) y nos dice si es capicúa.
*
* @author Sergio García Domínguez
*/

public class Ejercicio20 {
  public static void main (String[] args) {
    System.out.print("Introduzca un número entero positivo (máximo 5 cifras)");
    String numero = System.console().readLine();
    
    if ((numero.length() <= 5) && (Integer.parseInt(numero) >= 0)) {
      boolean capicua = false;
      
      if (numero.length() == 1) {
        capicua = true;
      } else if (numero.length() == 2) {
        if (numero.charAt(0) == numero.charAt(1)) {
          capicua = true;
        }
      } else if (numero.length() == 3 ){
        if (numero.charAt(0) == numero.charAt(2)) {
          capicua = true;
        }
      } else if (numero.length() == 4) {
        if (numero.charAt(0) == numero.charAt(3) && numero.charAt(1) == numero.charAt(2)) {
          capicua = true;
        }
      } else {
        if (numero.charAt(0) == numero.charAt(4) && numero.charAt(1) == numero.charAt(3)) {
          capicua = true;
        }
      }
      
      if (capicua == true) {
        System.out.print("El número " + numero + " es capicúa.");
      
      } else {
        System.out.print("El número " + numero + " no es capicúa.");
      }
      
    } else {
      System.out.println("Número introducido incorrecto."
          + " Ha de ser un número entero positivo (máximo 5 cifras)");
    }
  }
}
>>>>>>> 530340828eb844188b0723543c83a26973aa8d3f
