/**
* Capítulo 5 - Ejercicio 22
*
* Muestra todos los primos entre 2 y 100 inclusive.
* 
* @author Sergio García Domínguez
*/

public class Ejercicio22 {
  public static void main (String[] args) {
    System.out.println("Muestra todos los primos entre 2 y 100 inclusive.\n");
    
    boolean esPrimo;
    
    for (int numeroAComprobar = 2; numeroAComprobar <= 100; numeroAComprobar++) {
      esPrimo = true;
      
      for (int i = (int)Math.sqrt(numeroAComprobar); i >= 2; i--) {
        
        if (numeroAComprobar % i == 0) {
          esPrimo = false;
        }
      }
      
      if (esPrimo) {
          System.out.print(numeroAComprobar + ", ");
      }
    }
  }
}
