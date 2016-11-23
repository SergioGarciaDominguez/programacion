/**
* Capítulo 6 - Ejercicio 11
*
* Muestre 20 notas generadas al azar (suspenso, suficiente, bien, notable o sobresaliente). También
* calcula el número de veces que ha salido cada una.
* 
* @author Sergio García Domínguez
*/

public class Ejercicio11 {
  public static void main (String[] args) {
    String nota;
    int cuentaSuspensos = 0;
    int cuentaSuficientes = 0;
    int cuentaBienes = 0;
    int cuentaNotables = 0;
    int cuentaSobresalientes = 0;
    
    for (int i = 1; i <= 20; i++) {
      nota = String.valueOf((int)(Math.random() * 5 + 1));
      
      switch (nota) {

        case "1":
          nota = "Suspenso";
          cuentaSuspensos++;
          break;
        case "2":
          nota = "Suficiente";
          cuentaSuficientes++;
          break;
        case "3":
          nota = "Bien";
          cuentaBienes++;
          break;
        case "4":
          nota = "Notable";
          cuentaNotables++;
          break;
        case "5":
          nota = "Sobresaliente";
          cuentaSobresalientes++;
          break;
      }
      
      System.out.println(nota);
    }
    
    System.out.println("\nNúmero de suspensos: " + cuentaSuspensos);
    System.out.println("Número de suficientes: " + cuentaSuficientes);
    System.out.println("Número de bienes: " + cuentaBienes);
    System.out.println("Número de notables: " + cuentaNotables);
    System.out.println("Número de sobresalientes: " + cuentaSobresalientes);
  }
}
