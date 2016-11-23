/**
* Capítulo 4 - Ejercicio 13
*
* Pide tres números y los ordena de menor a mayor
*
* @author Sergio García Domínguez
*/

public class Ejercicio13 {
  public static void main (String[] args) {
    System.out.println("Vamos a ordenar tres números de menor a mayor:\n");
    
    System.out.print("Introduzca el primer número: ");
    int num1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el segundo número: ");
    int num2 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el tercer número: ");
    int num3 = Integer.parseInt(System.console().readLine());
    
    System.out.print("\nNúmeros introducidos ordenados: ");
        
    if (num1 < num2) {
      if (num3 > num2) {
        System.out.println(num1 + ", " + num2 + ", " + num3);
        
      } else if (num3 < num1) {
        System.out.println(num3 + ", " + num1 + ", " + num2);
        
      } else {
        System.out.println(num1 + ", " + num3 + ", " + num2);
      }
    } else {
      if (num3 > num1) {
        System.out.println(num2 + ", " + num1 + ", " + num3);
        
      } else if (num3 < num2) {
        System.out.println(num3 + ", " + num2 + ", " + num1);
        
      } else {
        System.out.println(num2 + ", " + num3 + ", " + num1);
      }
    }
  }
}
