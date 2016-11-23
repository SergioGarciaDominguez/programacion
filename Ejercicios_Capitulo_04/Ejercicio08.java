/**
* Capítulo 4 - Ejercicio 08
*
* Calcula la media de tres notas y te da el resultado del boletín (insuficiente, suficiente, bien,
* notable o sobresaliente).
*
* @author Sergio García Domínguez
*/
 
public class Ejercicio08 {
  public static void main (String[] args) {
    System.out.print(""
        + "Vamos a calcular la media de tres notas:\n"
        + "Introduzca la primera nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    if (!(nota1 >= 0 && nota1 <= 10)) {
      System.out.print("Introduzca las notas de 0 a 10 en números reales.");
    } else {
      System.out.print("Introduzca la segunda nota: ");
      double nota2 = Double.parseDouble(System.console().readLine());
      
      if (!(nota2 >= 0 && nota2 <= 10)) {
        System.out.print("Introduzca las notas de 0 a 10 en números reales.");
      } else {
        System.out.print("Introduzca la tercera nota: ");
        double nota3 = Double.parseDouble(System.console().readLine());
        
        if (!(nota3 >= 0 && nota3 <= 10)) {
          System.out.print("Introduzca las notas de 0 a 10 en números reales.");
        } else {
          double notaMedia = (nota1 + nota2 + nota3) / 3;
          
          System.out.printf("La media de las tres notas es %.2f\n", notaMedia);
          
          if (notaMedia >= 0 && notaMedia < 5) {
            System.out.println("El resultado del boletín es: insuficiente.");
          } else if (notaMedia >= 5.0 && notaMedia < 6.25) {
            System.out.println("El resultado del boletín es: suficiente.");
          } else if (notaMedia >= 6.25 && notaMedia < 7.5) {
            System.out.println("El resultado del boletín es: bien.");
          } else if (notaMedia >= 7.5 && notaMedia < 8.75) {
            System.out.println("El resultado del boletín es: notable.");
          } else {
            System.out.println("El resultado del boletín es: sobresaliente.");
          }
        }
      }
    }
  }
}
