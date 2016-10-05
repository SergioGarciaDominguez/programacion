/**
* Capítulo 2 - Ejercicio 05
*
* Conversor de pesetas a euros
*
* @author Sergio García Domínguez
*/

public class Ejercicio05 {
  public static void main(String[] args) {
    int pesetas = 500;
    
    System.out.printf("Precio en pesetas: %d pesetas \nPrecio en euros: %.2f€\n", pesetas, ((double)pesetas / 166.386));
  }
}
