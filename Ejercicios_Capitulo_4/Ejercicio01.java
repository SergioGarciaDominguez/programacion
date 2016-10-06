/**
* Capítulo 4 - Ejercicio 01
*
* Pide un día de la semana y te dice qué asignatura toca a primera hora ese día.
*
* @author Sergio García Domínguez
*/
 
public class Ejercicio01 {
  public static void main (String[] args) {
    System.out.print("Introduzca el día de la semana: ");
    String dia = (System.console().readLine()).toLowerCase();
    String asignatura;

    switch (dia) {
      case "lunes":
        asignatura = "Sistemas Informáticos";
        break;
      case "martes":
        asignatura = "Programación";
        break;
      case "miercoles":
        asignatura = "Programación";
        break;
      // También miércoles acentuado por si el usuario lo introduce con tilde
      case "miércoles":
        asignatura = "Programación";
      break;
      case "jueves":
        asignatura = "Bases de datos";
        break;
      case "viernes":
        asignatura = "Lenguajes de marcas";
        break;
      default:
        asignatura = "El día es incorrecto. Ha de introducir un día de lunes a viernes.";
        dia = "incorrecto";
    }
    if (dia.equals("incorrecto")) {
      System.out.println(asignatura);
    } else {
      System.out.println("El " + dia + " a primera hora hay la asignatura de " + asignatura + ".");
    }
  }
}
