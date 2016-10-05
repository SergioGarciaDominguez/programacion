/**
* Capítulo 3 - Ejercicio 05
*
* Pide la base y la altura de un rectángulo y calcula su área
*
* @author Sergio García Domínguez
*/

public class Ejercicio05 {
  public static void main(String[] args) {
    System.out.print("Introduzca la base del rectángulo en metros: ");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca la altura del rectángulo en metros: ");
    double altura = Double.parseDouble(System.console().readLine());
    
    System.out.println("\nÁrea del rectángulo: " + (base * altura) + " m²");
  }
}
