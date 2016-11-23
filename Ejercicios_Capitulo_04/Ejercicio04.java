/**
* Capítulo 4 - Ejercicio 04
*
* Calcula el salario semanal de un trabajador: las horas ordinarias cobra 12€ la hora y las extras
* 16€ la hora.
*
* @author Sergio García Domínguez
*/
 
public class Ejercicio04 {
  public static void main (String[] args) {
    System.out.print("Introduzca el número de horas trabajadas: ");
    int horas = Integer.parseInt(System.console().readLine());
    
    if (horas < 41) {
      System.out.printf("Salario semanal: %.2f€\n", (double)(horas * 12));
      
    } else {
      int horasExtra = horas - 40;
      int horasOrdinarias = 40;
      
      System.out.println(""
          + "Horas ordinarias: " + horasOrdinarias + " horas.\n"
          + "Horas extra: " + horasExtra + " horas.");
      System.out.printf("Salario semanal: %.2f€\n",
          (double)(horasOrdinarias * 12 + horasExtra * 16));
    }
  }
}
