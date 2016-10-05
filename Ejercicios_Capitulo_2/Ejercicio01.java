/**
* Capítulo 2 - Ejercicio 01
*
* Muestra por pantalla dos números, su suma, su resta, su división y su multiplicación
*
* @author Sergio García Domínguez
*/

public class Ejercicio01 {
  public static void main(String[] args) {
    int x = 144;
    int y = 999;
    
    System.out.println(""
        + x + "\n"
        + y + "\n"
        + "La suma es " + (x + y) + "\n" 
        + "La resta es " + (x - y) + "\n"
        + "La división es " + ((double)x / (double)y) + "\n"
        + "La multiplicación es " + (x * y));
  }
}
