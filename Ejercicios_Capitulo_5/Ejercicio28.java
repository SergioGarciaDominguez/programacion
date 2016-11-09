/**
* Capítulo 5 - Ejercicio 28
*
* Pide un número entero y calcula su factorial.
* 
* @author Sergio García Domínguez
*/

public class Ejercicio28 {
  public static void main (String[] args) {
    System.out.println("Vamos a calcular el factorial de un número entero positivo\n");
  
    System.out.print("Por favor, introduzca un número entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    int factorial = 1;
    
    for (int i = 1; i <= numero; i++) {
      factorial *= i;
    }
    
    System.out.println(numero + "! = " + factorial);
  }
}
