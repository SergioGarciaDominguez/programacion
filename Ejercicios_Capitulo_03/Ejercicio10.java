/**
* Capítulo 3 - Ejercicio 10
*
* Conversor de Mb a Kb
*
* @author Sergio García Domínguez
*/

public class Ejercicio10 {
  public static void main(String[] args) {
    System.out.print("Introduzca la cantidad de Mb: ");
    double cantidadMb = Double.parseDouble(System.console().readLine());
    
    System.out.println("Cantidad de Kb: " + (cantidadMb * 1024) + " Kb");
  }
}
