/**
* Capítulo 4 - Ejercicio 07
*
* Calcula la media de tres notas
*
* @author Sergio García Domínguez
*/
 
public class Ejercicio07 {
  public static void main (String[] args) {
    System.out.print(""
        + "Vamos a calcular la media de tres notas:\n"
        + "Introduzca la primera nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca la segunda nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca la tercera nota: ");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    System.out.printf("La media de las tres notas es %.2f\n", (nota1 + nota2 + nota3) / 3);
  }
}
