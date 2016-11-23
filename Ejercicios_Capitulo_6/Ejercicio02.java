/**
* Capítulo 6 - Ejercicio 2
*
* Muestra una carta de la baraja francesa.
* 
* @author Sergio García Domínguez
*/

public class Ejercicio02 {
  public static void main (String[] args) {
    
    String carta = String.valueOf((int)(Math.random() * 13 + 1));
    String palo =  String.valueOf((int)(Math.random() * 4));

    switch (carta) {
      case "11":
        carta = "J";
        break;
      case "12":
        carta = "Q";
        break;
      case "13":
        carta = "K";
        break;
      case "1":
        carta = "A";
        break;
    }
    
    switch (palo) {
      case "0":
        palo = "picas";
        break;
      case "1":
        palo = "corazones";
        break;
      case "2":
        palo = "diamantes";
        break;
      case "3":
        palo = "tréboles";
        break;
    }
    
    System.out.println("La carta es: " + carta + " de " + palo);

  }
}
