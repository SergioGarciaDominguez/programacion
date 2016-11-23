/**
* Capítulo 6 - Ejercicio 1
*
* Muestra la tirada de tres dados. También la suma total de los puntos de los tres dados.
* 
* @author Sergio García Domínguez
*/

public class Ejercicio01 {
  public static void main (String[] args) {
    
    int primeraTirada = (int)(Math.random() * 6 + 1);
    int segundaTirada = (int)(Math.random() * 6 + 1);
    int terceraTirada = (int)(Math.random() * 6 + 1);
    
    System.out.println("Primera tirada: " + primeraTirada);
    System.out.println("Segunda tirada: " + segundaTirada);
    System.out.println("Tercera tirada: " + terceraTirada);
    
    System.out.println("\nSuma de los puntos: " + (primeraTirada + segundaTirada + terceraTirada));
  }
}
