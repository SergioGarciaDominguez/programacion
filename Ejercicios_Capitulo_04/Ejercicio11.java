/**
* Capítulo 4 - Ejercicio 11
*
* Pide una hora (horas y minutos) y calcula los segundos que faltan para llegar a medianoche.
*
* @author Sergio García Domínguez
*/

public class Ejercicio11 {
  public static void main (String[] args) {
    System.out.print("Introduzca la hora: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    if (hora >= 0 && hora <= 23){
    
      System.out.print("Introduzca los minutos: ");
      int minutos = Integer.parseInt(System.console().readLine());
      
        if (minutos >= 0 && minutos <= 59){
          int segundos;
          segundos = 24 * 3600 - (hora * 3600 + minutos * 60);
          
          System.out.println("\nFaltan " + segundos + " segundos para llegar a la medianoche.");
          
        } else {
          System.out.println("\n Los minutos son incorrectos. "
              + "Deben estar comprendidos entre 0 y 59.");
        }
    } else {
      System.out.println("\n La hora es incorrecta. Debe estar comprendida entre 0 y 23.");
    }
  }
}
