/**
* Capítulo 5 - Ejercicio 17
*
* Pide un número entero positivo y calcula la suma de los 100 siguientes
* 
* @author Sergio García Domínguez
*/

public class Ejercicio17 {
  public static void main (String[] args) {
    System.out.println("Vamos a calcular la suma de los 100 números enteros siguientes a un número "
        + "entero positivo dado.\n");
  
    System.out.print("Introduzca un número entero positivo: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    
    if (numero > 0) {
      int suma = 0;
      
      for (int i = 1; i <= 100; i++) {
        numero++;
        suma = suma + numero;
      }
    
      System.out.println("\nEl resultado de la suma es: " + suma);
      
    } else {
      System.out.println("\nDebe introducir un número entero positivo.");
    }
  }
}
