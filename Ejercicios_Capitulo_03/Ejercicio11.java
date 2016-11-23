/**
* Capítulo 3 - Ejercicio 11
*
* Conversor de Kb a Mb
*
* @author Sergio García Domínguez
*/

public class Ejercicio11 {
  public static void main(String[] args) {
    System.out.print("Introduzca la cantidad de Kb: ");
    double cantidadKb = Double.parseDouble(System.console().readLine());
    
    System.out.println("Cantidad de Mb: " + (cantidadKb / 1024) + " Mb");
  }
}
