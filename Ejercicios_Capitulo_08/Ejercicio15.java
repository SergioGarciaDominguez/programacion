import static funciones.Ejercicios01A14.esPrimo;

/**
 * Capítulo 8 - Ejercicio 15
 * 
 * Muestra los números primos que hay entre 1 y 1000.
 * 
 * @author Sergio García Domínguez
 */
public class Ejercicio15 {
  public static void main(String[] args) {
    
    for (int i = 1; i <= 1000; i += 2) {
      
      if (esPrimo(i)) {
        System.out.print(i + " ");
      }
      
    }
    
  }
  
}
