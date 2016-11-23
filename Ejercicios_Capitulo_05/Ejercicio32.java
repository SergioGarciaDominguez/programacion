/**
* Capítulo 5 - Ejercicio 32
*
* Pide un número entero y dice cuáles son y cuanto suman los dígitos pares. Los dígitos pares se 
* muestran en orden, de izquierda a derecha.
* 
* @author Sergio García Domínguez
*/

public class Ejercicio32 {
  public static void main (String[] args) {
    
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numero = Long.parseLong(System.console().readLine());
    
    int totalDigitos = 0;
    for (int i = 20; i >= 1; i--) {
      if (numero > - Math.pow(10, i) && numero < Math.pow(10, i)) {
        totalDigitos = i;
      }
    }
    
    System.out.print("Dígitos pares:");
    int sumaPares = 0;
    
    for (int i = totalDigitos; i >= 1; i--) {
      int digitoActual = (int)((numero % Math.pow(10, i)) / Math.pow(10, i - 1));
        
      if (digitoActual % 2 == 0) {
        sumaPares += digitoActual;
        System.out.print(" " + digitoActual);
      }
    }
    
    System.out.println("\nSuma de los dígitos pares: " + sumaPares);
  }
}
