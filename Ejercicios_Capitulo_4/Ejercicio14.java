<<<<<<< HEAD
/**
* Capítulo 4 - Ejercicio 14
*
* Pide un número y te dice si es par y/o si es divisible entre 5.
*
* @author Sergio García Domínguez
*/

public class Ejercicio14 {
  public static void main (String[] args) {
    System.out.print("Introduzca un número entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    if ((numero % 2) == 0) {
      System.out.print("El número introducido es par");
    } else {
      System.out.print("El número introducido es impar");
    }
    
    if ((numero % 5) == 0) {
      System.out.println(" y divisible entre 5.");
    } else {
      System.out.println(" y no es divisible entre 5.");
    }
  }
}
=======
/**
* Capítulo 4 - Ejercicio 14
*
* Pide un número y te dice si es par y/o si es divisible entre 5.
*
* @author Sergio García Domínguez
*/

public class Ejercicio14 {
  public static void main (String[] args) {
    System.out.print("Introduzca un número entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    if ((numero % 2) == 0) {
      System.out.print("El número introducido es par");
    } else {
      System.out.print("El número introducido es impar");
    }
    
    if ((numero % 5) == 0) {
      System.out.println(" y divisible entre 5.");
    } else {
      System.out.println(" y no es divisible entre 5.");
    }
  }
}
>>>>>>> 530340828eb844188b0723543c83a26973aa8d3f
