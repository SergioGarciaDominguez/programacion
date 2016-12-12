/**
* Capítulo 6 - Ejercicio 13
*
* Simule la tirada de dos dados. Continuar tirando los dados una y otra vez hasta que en alguna
* tirada los dos dados tengan el mismo valor.
* 
* @author Sergio García Domínguez
*/

public class Ejercicio13 {
  public static void main (String[] args) {
    
    System.out.println("Vamos a simular las tiradas de dos dados hasta que en una tirada tengan el"
        + " mismo valor.");
    
    int primerDado;
    int segundoDado;
    int tirada = 1;
    
    do {
      
      primerDado = (int)(Math.random() * 6 + 1);
      segundoDado = (int)(Math.random() * 6 + 1);
      
      System.out.println("\nTIRADA " + tirada + ": ");
      System.out.println("Primer dado: " + primerDado);
      System.out.println("Segundo dado: " + segundoDado);
      
      tirada++;
      
    } while (primerDado != segundoDado);
      
    
  }
}
