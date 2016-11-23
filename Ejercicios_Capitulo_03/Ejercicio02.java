/**
* Capítulo 3 - Ejercicio 02
*
* Conversor de euros a pesetas
*
* @author Sergio García Domínguez
*/

public class Ejercicio02 {
  public static void main(String[] args) {
    System.out.print("Introduzca la cantidad en euros: ");
    double euros = Double.parseDouble(System.console().readLine());
    
    System.out.printf("Precio en pesetas: %d pesetas\n", (int) (166.386 * euros));
  }
}
