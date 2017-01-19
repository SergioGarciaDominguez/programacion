import static funciones.Ejercicios01A14.esCapicua;

/**
 * Capítulo 8 - Ejercicio 16
 * 
 * Muestra los números capicúa que hay entre 1 y 99999.
 * 
 * @author Sergio García Domínguez
 */
public class Ejercicio16 {
  public static void main(String[] args) {
    
    for (int i = 1; i <= 99999; i++) {
      
      if (esCapicua(i)) {
        System.out.print(i + " ");
      }
      
    }
    
  }
  
}
