/**
* Capítulo 3 - Ejercicio 04
*
* Pide dos números y muestra por pantalla dos números, su suma, su resta, su división y su 
* multiplicación
*
* @author Sergio García Domínguez
*/

public class Ejercicio04 {
  public static void main(String[] args) {
    System.out.print("Introduzca un número: ");
    double primerNumero = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca otro número: ");
    double segundoNumero = Double.parseDouble(System.console().readLine());
    
    System.out.println("\n"
        + "La suma es " + (primerNumero + segundoNumero) + "\n" 
        + "La resta es " + (primerNumero - segundoNumero) + "\n"
        + "La división es " + ((double)primerNumero / (double)segundoNumero) + "\n"
        + "La multiplicación es " + (primerNumero * segundoNumero));
  }
}
