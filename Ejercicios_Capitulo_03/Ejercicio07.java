/**
* Capítulo 3 - Ejercicio 07
*
* Pide la base imponible y calcula el total con un IVA del 21%
*
* @author Sergio García Domínguez
*/

public class Ejercicio07 {
  public static void main(String[] args) {
    System.out.print("Introduzca la base imponible en euros: ");
    double baseImponible = Double.parseDouble(System.console().readLine());
    double tipoIva = 0.21;
    
    System.out.printf("Tipo de IVA: %d%-1s \nTotal de la factura: %.2f€\n",
        (int)(tipoIva * 100), "%", baseImponible * (1 + tipoIva));
  }
}
