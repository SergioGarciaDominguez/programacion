/**
* Capítulo 4 - Ejercicio 23
*
* Pide la base imponible y calcula el precio final en base al iva (general, reducido o
* superreducido) y el código de promoción.
*
* @author Sergio García Domínguez
*/

public class Ejercicio23 {
  public static void main (String[] args) {
    System.out.print("Introduzca la base imponible: ");
    double baseImponible = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
    String tipoIvaLetras = System.console().readLine();

    System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
    String codigoPromo = System.console().readLine();

    double tipoIva = 0;
    double calculaPromo = 0;

    switch (tipoIvaLetras) {
      case "general":
        tipoIva = 0.21;
        break;
      case "reducido":
        tipoIva = 0.1;
        break;
      case "superreducido":
        tipoIva = 0.04;
        break;
    }

    double precioConIva = baseImponible * (1 + tipoIva);

    switch (codigoPromo) {
      case "nopro":
        calculaPromo = 0;
        break;
      case "mitad":
        calculaPromo = - (precioConIva / 2.0);
        break;
      case "meno5":
        calculaPromo = - 5;
        break;
      case "5porc":
        calculaPromo = - precioConIva * 0.05;
        break;
    }

    System.out.printf(""
        + "Base imponible         %.2f\n"
        + "IVA (%2.0f%-1s)               %.2f\n"
        + "Precio con IVA         %.2f\n"
        + "Cód. promo. (%-5s): %.2f\n"
        + "TOTAL                  %.2f\n",
        baseImponible,
        tipoIva * 100, "%", baseImponible * tipoIva,
        precioConIva,
        codigoPromo, calculaPromo,
        precioConIva + calculaPromo);
  }
}
