/**
* Capítulo 2 - Ejercicio 06
*
* Calcula el total de una factura a partir de la base imponible
*
* @author Sergio García Domínguez
*/

public class Ejercicio06 {
  public static void main(String[] args) {
    double baseImponible = 100.00;
    double tipoIva = 0.21;
    
    System.out.printf("Base imponible: %.2f€\nTipo de IVA: %d%-1s \nTotal de la factura: %.2f€\n",
        baseImponible, (int)(tipoIva * 100), "%", baseImponible * (1 + tipoIva));
  }
}
