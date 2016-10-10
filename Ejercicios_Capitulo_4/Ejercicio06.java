/**
* Capítulo 4 - Ejercicio 06
*
* Calcule el tiempo que tardará en caer un objeto desde una altura h.
*
* @author Sergio García Domínguez
*/
 
public class Ejercicio06 {
  public static void main (String[] args) {
    System.out.print(""
    + "Vamos a calcular el tiempo que tardará en caer un objeto"
    + " desde una altura h.");
    
    System.out.print("Introduzca la altura en metros: ");
    double h = Double.parseDouble(System.console().readLine());
    
    if (h >= 0) {
      System.out.print("El tiempo que tarda en caer un objeto desde " + h + " metros es: ");
      System.out.printf("%.2f segundos\n", Math.sqrt((2.0 * h) / 9.81));
    } else {
      System.out.print("Altura incorrecta. Ha de introducir un número mayor o igual a cero.");
    }
  }
}
