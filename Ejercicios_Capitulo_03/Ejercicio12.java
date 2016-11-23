/**
* Capítulo 3 - Ejercicio 12
*
* Calcula la nota necesaria en un segundo examen para obtener la media deseada
*
* @author Sergio García Domínguez
*/

public class Ejercicio12 {
  public static void main(String[] args) {
    System.out.print("Introduce la nota del primer examen: ");
    double notaExamen1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("¿Qué nota quieres sacar en el trimestre? ");
    double notaDeseada = Double.parseDouble(System.console().readLine());
    
    System.out.print("Para tener un " + notaDeseada + " en el trimestre");
    System.out.printf(" necesitas sacar un %.2f en el segundo examen.\n",
        ((notaDeseada - 0.4 * notaExamen1) / 0.6));
  }
}
