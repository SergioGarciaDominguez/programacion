/**
* Capítulo 6 - Ejercicio 3
*
* Muestra una carta de la baraja francesa.
* 
* @author Sergio García Domínguez
*/

public class Ejercicio03 {
  public static void main (String[] args) {
    
    String carta = String.valueOf((int)(Math.random() * 10 + 1));
    String palo =  String.valueOf((int)(Math.random() * 4));

    switch (carta) {
      case "8":
        carta = "sota";
        break;
      case "9":
        carta = "caballo";
        break;
      case "10":
        carta = "rey";
        break;
      case "1":
        carta = "as";
        break;
    }
    
    switch (palo) {
      case "0":
        palo = "oros";
        break;
      case "1":
        palo = "copas";
        break;
      case "2":
        palo = "espadas";
        break;
      case "3":
        palo = "bastos";
        break;
    }
    
    System.out.println("La carta es: " + carta + " de " + palo);
  }
}
