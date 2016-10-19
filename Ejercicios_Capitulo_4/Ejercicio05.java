/**
* Capítulo 4 - Ejercicio 05
*
* Resuelve una ecuación de primer grado.
*
* @author Sergio García Domínguez
*/
 
public class Ejercicio05 {
  public static void main (String[] args) {
    System.out.println("Vamos a resolver una ecuación de primer grado (ax + b = 0):\n");
    
    System.out.print("Introduzca el valor de 'a': ");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca el valor de 'b': ");
    double b = Double.parseDouble(System.console().readLine());
    
    if (a != 0) {
      System.out.printf("\nLa solución de la ecuación " + a + "x + " + b + " = 0 es: x = %.2f\n",
          (- b) / a);
        
    } else {
      if (b == 0) {
        System.out.println("\nLa ecuación tiene infinitas soluciones (ecuación identidad).");
      } else {
        System.out.println("\nLa ecuación es inconsistente y no tiene solución.");
      }
    }
  }
}
