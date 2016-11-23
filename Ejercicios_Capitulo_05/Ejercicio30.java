/**
* Capítulo 5 - Ejercicio 30
*
* Calcula las horas transcurridas entre dos horas de dos días de la semana.
* 
* @author Sergio García Domínguez
*/

public class Ejercicio30 {
  public static void main (String[] args) {
    System.out.println("Vamos a calcular las horas transcurridas entre dos horas de dos días de la"
        + " semana.\n");
  
    System.out.println("Por favor, introduzca la primera hora.");
    
    System.out.print("Día: ");
    String primerDia = System.console().readLine().toLowerCase();
    
    int numeroPrimerDia;
    
    switch (primerDia) {
      case "lunes":
        numeroPrimerDia = 1;
        break;
      case "martes":
        numeroPrimerDia = 2;
        break;
      case "miércoles":
      case "miercoles":
        numeroPrimerDia = 3;
        break;
      case "jueves":
        numeroPrimerDia = 4;
        break;
      case "viernes":
        numeroPrimerDia = 5;
        break;
      case "sábado":
      case "sabado":
        numeroPrimerDia = 6;
        break;
      case "domingo":
        numeroPrimerDia = 7;
        break;
      default:
        numeroPrimerDia = 0;
        break;
    }
    
    System.out.print("Hora: ");
    int primeraHora = Integer.parseInt(System.console().readLine());
  
    System.out.println("Por favor, introduzca la segunda hora.");
    
    System.out.print("Día: ");
    String segundoDia = System.console().readLine().toLowerCase();
    
    int numeroSegundoDia;
    
    switch (segundoDia) {
      case "lunes":
        numeroSegundoDia = 1;
        break;
      case "martes":
        numeroSegundoDia = 2;
        break;
      case "miércoles":
      case "miercoles":
        numeroSegundoDia = 3;
        break;
      case "jueves":
        numeroSegundoDia = 4;
        break;
      case "viernes":
        numeroSegundoDia = 5;
        break;
      case "sábado":
      case "sabado":
        numeroSegundoDia = 6;
        break;
      case "domingo":
        numeroSegundoDia = 7;
        break;
      default:
        numeroSegundoDia = 0;
        break;
    }
    
    System.out.print("Hora: ");
    int segundaHora = Integer.parseInt(System.console().readLine());
    
    if (numeroPrimerDia != 0 || (primeraHora >= 0 && primeraHora <= 23)
        || (primeraHora >= 0 && primeraHora <= 23)) {
          
      if (numeroPrimerDia < numeroSegundoDia 
          || (numeroPrimerDia == numeroSegundoDia && primeraHora < segundaHora)) {
        
        int horasTranscurridas;
        horasTranscurridas = (numeroSegundoDia - numeroPrimerDia) * 24
            + (segundaHora - primeraHora);
        
        System.out.println("\nHoras transcurridas: " + horasTranscurridas);
        
      } else {
        System.out.println("\nDebe introducir los días en orden.");
      }
      
    } else {
      System.out.println("\nDebe introducir los datos correctamente");
    }
  }
}
