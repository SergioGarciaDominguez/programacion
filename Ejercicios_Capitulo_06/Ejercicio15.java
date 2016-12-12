/**
* Capítulo 6 - Ejercicio 15
*
* Genera melodías con 1 a 7 compases de 4 notas separados por "|", la primera y última nota han de
* ser la misma y al final cierra con "||".
* 
* @author Sergio García Domínguez
*/

public class Ejercicio15 {
  public static void main (String[] args) {
    
    String nota;
    String primeraNota = "";
    int numeroCompases = (int)(Math.random() * 7 + 1);
    
    for (int i = 0; i < numeroCompases; i++) {
      for (int j = 0; j < 4; j++) {
        nota = String.valueOf((int)(Math.random() * 7 + 1));
        
        switch (nota) {
          case "1":
            nota = "do";
            break;
          case "2":
            nota = "re";
            break;
          case "3":
            nota = "mi";
            break;
          case "4":
            nota = "fa";
            break;
          case "5":
            nota = "sol";
            break;
          case "6":
            nota = "la";
            break;
          case "7":
            nota = "si";
            break;
        }
        
        if (i == 0 && j == 0) {
          primeraNota = nota;
        }
        
        if (i == (numeroCompases - 1) && j == 3) {
          nota = primeraNota;
        }
        
        System.out.print(" " + nota);
      }
      System.out.print(" |");
    }
    System.out.println("|");
  }
}
