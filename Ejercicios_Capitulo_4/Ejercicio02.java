/**
* Capítulo 4 - Ejercicio 02
*
* Pide una hora por teclado y muestra buenos días, buenas tardes o buenas noches según la hora
*
* @author Sergio García Domínguez
*/
 
public class Ejercicio02 {
  public static void main (String[] args) {
    System.out.print("Introduzca la hora en formato 24h (solo la hora): ");
    int hora = Integer.parseInt(System.console().readLine());
    
    if (hora >= 6 && hora <= 12) {
      System.out.println("¡Buenos días!");
    } else if (hora >= 13 && hora <= 20) {
      System.out.println("¡Buenas tardes!");
    } else if ((hora > 21 && hora <= 24) || (hora >= 0 && hora <= 5)) {
      System.out.println("¡Buenas noches!");
    } else {
      System.out.println("Hora incorrecta.");
    }
  }
}
