/**
* Capítulo 4 - Ejercicio 03
*
* Pide un número del 1 a 7 y escribe el correspondiente día de la semana.
*
* @author Sergio García Domínguez
*/
 
public class Ejercicio03 {
  public static void main (String[] args) {
    System.out.print("Introduzca el día de la semana en números (del 1 al 7): ");
    int dia = Integer.parseInt(System.console().readLine());
    String diaSemana;
    
    switch (dia) {
      case 1:
        diaSemana = "lunes";
        break;
      case 2:
        diaSemana = "martes";
        break;
      case 3:
        diaSemana = "miércoles";
        break;
      case 4:
        diaSemana = "jueves";
        break;
      case 5:
        diaSemana = "viernes";
        break;
      case 6:
        diaSemana = "sábado";
        break;
      case 7:
        diaSemana = "domingo";
        break;
      default:
        diaSemana = "incorrecto";
        break;
    }
    
    if (diaSemana.equals("incorrecto")) {
      System.out.println("Número incorrecto. Ha de ser un número del 1 al 7");
      
    } else {
      System.out.print("El día número " + dia + " de la semana es el " + diaSemana);
    }
  }
}
