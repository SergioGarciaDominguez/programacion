/**
* Capítulo 6 - Ejercicio 7
*
* Muestra tres apuestas de la quiniela en tres columnas para los 14 partidos y el pleno al quince.
* 
* @author Sergio García Domínguez
*/

public class Ejercicio07 {
  public static void main (String[] args) {
    String resultado;
    for (int i = 1 ; i<= 15; i++) {
      System.out.printf("%2d.  ", i);
      for (int j = 1; j <= 3; j++) {
        resultado = String.valueOf((int)(Math.random() * 3 + 0));
        
        if (resultado.equals("0")) {
          resultado = "X";
        }
        
        System.out.print(resultado + " ");
      }
      System.out.print("\n");
    }
  }
}
