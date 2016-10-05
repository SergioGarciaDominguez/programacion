/**
* Capítulo 3 - Ejercicio 06
*
* Pide la base y la altura de un triángulo y calcula su área
*
* @author Sergio García Domínguez
*/

public class Ejercicio06 {
  public static void main(String[] args) {
    System.out.print("Introduzca la base del triángulo en metros: ");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca la altura del triángulo en metros: ");
    double altura = Double.parseDouble(System.console().readLine());
    
    System.out.println("\nÁrea del triángulo: " + ((base * altura) / 2) + " m²");
  }
}
