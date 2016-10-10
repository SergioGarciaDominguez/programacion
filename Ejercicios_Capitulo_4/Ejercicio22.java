/**
* Capítulo 4 - Ejercicio 22
*
* Pide el día de la semana, la hora y los minutos y calcula cuántos minutos quedan para el fin de
* semana.
*
* @author Sergio García Domínguez
*/

public class Ejercicio22 {
  public static void main(String[] args) {
    System.out.print("Introduzca el día de la semana con letras (lunes a viernes): ");
    String diaSemana = System.console().readLine();
    int numDia;
    
    switch (diaSemana) {
      case "lunes":
        numDia = 1;
        break;
      case "martes":
        numDia = 2;
        break;
      case "miércoles":
      case "miercoles":
        numDia = 3;
        break;
      case "jueves":
        numDia = 4;
        break;
      case "viernes":
        numDia = 5;
        break;
      default:
        numDia = 0;
        break;
    }
    
    if (numDia != 0) {
      System.out.print("Introduzca la hora: ");
      int horas = Integer.parseInt(System.console().readLine());
      
      System.out.print("Introduzca los minutos: ");
      int minutos = Integer.parseInt(System.console().readLine());
      
      System.out.println("Faltan "
          + ((4 * 24 + 15 ) * 60 - (((numDia - 1) * 24 + horas) * 60 + minutos))
          + " minutos para el fin de semana.");
    }
  }
}
