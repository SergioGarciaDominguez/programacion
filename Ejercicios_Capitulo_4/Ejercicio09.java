/**
* Capítulo 4 - Ejercicio 09
*
* Resuelve una ecuación de segundo grado.
*
* @author Sergio García Domínguez
*/
 
public class Ejercicio09 {
  public static void main (String[] args) {
    System.out.println("Vamos a resolver una ecuación de segundo grado (ax² + b + c = 0):\n");
    
    System.out.print("Introduzca el valor de 'a': ");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca el valor de 'b': ");
    double b = Double.parseDouble(System.console().readLine());
      
    System.out.print("Introduzca el valor de 'c': ");
    double c = Double.parseDouble(System.console().readLine());
    
    if (a != 0) {
      if (Math.pow(b, 2) - 4 * a * c > 0) { // El interior de la raíz es positivo
        System.out.printf(""
            + "La ecuación " + a + "x² + " + b + "x + " + c + " = 0 tiene dos soluciones reales:\n"
            + "1ª solución: x = %.2f\n"
            + "2ª solución: x = %.2f\n",
            - b + Math.sqrt(Math.pow(b, 2) - 4 * a * c),
            - b - Math.sqrt(Math.pow(b, 2) - 4 * a * c));
            
      } else if (Math.pow(b, 2) - 4 * a * c < 0) { // El interior de la raíz es negativo
        System.out.println(""
            + "La ecuación " + a + "x² + " + b + "x + " + c + " = 0"
            + " no tiene solución real (raíz negativa).");
         
      } else { // El interior de la raíz es igual a 0
        System.out.printf(""
            + "La ecuación " + a + "x² + " + b + "x + " + c + " = 0 tiene una solución real:\n"
            + "Solución: x = %.2f\n",
            (- b) / (2 * a));
      }
        
    } else { // Es una ecuación de primer grado
      System.out.println("\nEs una ecuación de primer grado");
      if (b != 0) {
      System.out.printf("\nLa solución de la ecuación " + a + "x + " + b + " = 0 es: x = %.2f\n",
          (- b) / a);
        
      } else {
        if (c == 0) {
          System.out.println("\nLa ecuación tiene infinitas soluciones (ecuación identidad).");
        } else {
          System.out.println("\nLa ecuación es inconsistente y no tiene solución.");
        }
      }
    }
  }
}
