/**
* Capítulo 5 - Ejercicio 12
*
* Muestra los n primeros términos de la serie de Fibonacci.
* 
* @author Sergio García Domínguez
*/

public class Ejercicio12 {
  public static void main (String[] args) {
    
    System.out.println("Vamos a mostrar los n primeros términos de la serie de Fibonacci\n");
    
    System.out.print("Introduzca el número de términos: ");
    int numeroTerminos = Integer.parseInt(System.console().readLine());
    
    int penultimoNumero = 0;
    int ultimoNumero = 1;
    
    if (numeroTerminos == 1) {
      
      System.out.println("\n0");
      
    } else if (numeroTerminos == 2) {
      
      System.out.println("\n0, 1");
      
    } else if (numeroTerminos > 2) {
      
      System.out.print("\n0, 1");
      
      for (int i = 3; i <= numeroTerminos; i++) {
        int suma = penultimoNumero + ultimoNumero;
        
        System.out.print(", " + (suma));
        
        penultimoNumero = ultimoNumero;
        ultimoNumero = suma;
      }
    }
  }
}
