/**
* Capítulo 6 - Ejercicio 14
*
* El programa intentará adivinar el número que estás pensando - un número entre 0y 100 - teniendo
* para ello 5 oportunidades. En cada intento fallido, el programa debe preguntar si el número que
* estás pensando es mayor o menor que el que te acaba de decir.
*
* @author Sergio García Domínguez
*/

public class Ejercicio14 {
  public static void main (String[] args) {

    System.out.println("Voy a adivinar el número que estás pensando (de 0 a 100)");

    int numeroIntento = (int)(Math.random() * 101);
    String respuesta = "";
    boolean esCorrecto = false;
    int contador = 0;
    int minimoIntento = 100;
    int maximoIntento = 0;

    do {
      contador++;
      System.out.println("\nEl número que has pensado es el " + numeroIntento);
      System.out.print("Dime si es (c)orrecto, mayor (>) o menor (<): ");
      respuesta = System.console().readLine().toLowerCase();

      if (minimoIntento > numeroIntento) {
        minimoIntento = numeroIntento;
      }

      if (maximoIntento < numeroIntento) {
        maximoIntento = numeroIntento;
      }

      switch (respuesta) {
        case "c":
        case "correcto":
          esCorrecto = true;
          break;
        case ">":
        case "mayor":
          if (maximoIntento == numeroIntento) {
            numeroIntento = (int)(Math.random() * (100 - numeroIntento) + numeroIntento + 1);
          } else {
            numeroIntento =
                (int)(Math.random() * (maximoIntento - minimoIntento) + minimoIntento + 1);
          }
          break;
        case "<":
        case "menor":
          if (minimoIntento == numeroIntento) {
            numeroIntento = (int)(Math.random() * numeroIntento);
          } else {
            numeroIntento =
                (int)(Math.random() * (numeroIntento - minimoIntento) + minimoIntento + 1);
          }
          break;
      }
    } while (!esCorrecto && contador < 5);

    if (esCorrecto) {
      System.out.println("\nLo he adivinado, no subestimes mi poder.");
    } else {
      System.out.println("\nAgoté mis 5 intentos, otra vez será :( .");
    }
  }
}
