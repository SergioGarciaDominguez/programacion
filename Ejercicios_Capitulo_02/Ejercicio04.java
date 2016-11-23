/**
* Capítulo 2 - Ejercicio 04
*
* Conversor de euros a pesetas
*
* @author Sergio García Domínguez
*/

public class Ejercicio04 {
  public static void main(String[] args) {
    double euros = 1;
    
    System.out.printf("Precio en euros: %.2f€ \nPrecio en pesetas: %d pesetas\n", euros, (int) (166.386 * euros));
  }
}
