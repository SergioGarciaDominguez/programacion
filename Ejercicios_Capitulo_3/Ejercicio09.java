/**
* Capítulo 3 - Ejercicio 09
*
* Pide el radio de la base y la altura de un cono y calcula su volumen
*
* @author Sergio García Domínguez
*/

public class Ejercicio09 {
  static final double PI = 3.141592;
  
  public static void main(String[] args) {
    System.out.print("Introduzca el radio de la base del cono en metros: ");
    double radioBase = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca la altura del cono en metros: ");
    double altura = Double.parseDouble(System.console().readLine());
    
    System.out.println("\nVolumen del cono: "
        + ((1.0 / 3.0) * PI * radioBase * radioBase * altura) + " m³");
  }
}
