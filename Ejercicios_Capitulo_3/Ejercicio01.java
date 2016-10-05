/**
* Capítulo 3 - Ejercicio 01
*
* Pide dos números y muestra el resultado de su multiplicación
*
* @author Sergio García Domínguez
*/

public class Ejercicio01 {
  public static void main(String[] args) {
    System.out.print("Introduzca un número: ");
    double primerNumero = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca otro número: ");
    double segundoNumero = Double.parseDouble(System.console().readLine());
    
    System.out.println("Resultado de la multiplicación: " + (primerNumero * segundoNumero));
  }
}
