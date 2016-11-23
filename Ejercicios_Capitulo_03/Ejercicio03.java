/**
* Capítulo 3 - Ejercicio 03
*
* Conversor de pesetas a euros
*
* @author Sergio García Domínguez
*/

public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.print("Introduzca la cantidad en pesetas: ");
    int pesetas = Integer.parseInt(System.console().readLine());
    
    System.out.printf("Precio en euros: %.2f€\n", ((double)pesetas / 166.386));
  }
}
