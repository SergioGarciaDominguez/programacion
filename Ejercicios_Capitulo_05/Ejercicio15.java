/**
* Capítulo 5 - Ejercicio 15
*
* Dada la base y un número n, devuelve todas las potencias de esa base hasta ese número n.
* 
* @author Sergio García Domínguez
*/

public class Ejercicio15 {
  public static void main (String[] args) {
    System.out.println("Vamos a calcular varias potencias\n");
    
    System.out.print("Introduzca la base: ");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca el numero de potencias: ");
    int numeroPotencias = Integer.parseInt(System.console().readLine());
    
    for (int i = 1; i <= numeroPotencias; i++) {
      double exponente = i;
      double multiplicacion = base;
      double resultado = 0;
  
      for (int j = 1; j <= exponente; j++) {
        resultado = multiplicacion;
        multiplicacion *= base;
      }
      
      System.out.printf("%.0f\n", resultado);
    }
    
  }
}
