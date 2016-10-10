/**
* Capítulo 4 - Ejercicio 21
*
* Pide dos notas y calcula la media de la asignatura. 
* Si la media es negativa pide el resultado de la recuperación.
*
* @author Sergio García Domínguez
*/

public class Ejercicio21 {
  public static void main(String[] args) {
    System.out.print("Nota del primer control: ");
    double nota1 = Double.parseDouble(System.console().readLine());

    System.out.print("Nota del segundo control: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    double media = (nota1 + nota2) / 2.0;
    
    if (media < 5) {
      System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
      String recuperacion = System.console().readLine();
      if (recuperacion.equals("apto")) {
        media = 5;
      }
    }
    
    System.out.println("Tu nota de Programación es " + media);
  }
}
