/**
* Capítulo 5 - Ejercicio 10
*
* Calcula la media de varios números positivos, al introducir un número negativo el porgrama se
* detiene
*
* @author Sergio García Domínguez
*/

public class Ejercicio10 {
  public static void main (String[] args) {
    
    System.out.println(""
        + "Vamos a calcular la media de varios números positivos, cuando ya haya introducido los "
        + "números para calcular la media, introduzca un número negativo para proceder al cálculo"
        +"\n");
        
    int numeroActual = 0;
    int cantidadNumeros = 0;
    int suma = 0;
    
    while (numeroActual >= 0) {
      System.out.print("Introduzca un número entero positivo"
          + " (introduzca negativo para finalizar):");
      
      numeroActual = Integer.parseInt(System.console().readLine());
      cantidadNumeros ++;
      suma += numeroActual;
      
    }
    System.out.println("La media de los números es: "
        + ((double)(suma - numeroActual) / (double)(cantidadNumeros - 1)));
  }
}
