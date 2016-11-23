/**
* Capítulo 6 - Ejercicio 8
*
* Muestra tres apuestas de la quiniela en tres columnas para los 14 partidos y el pleno al quince.
* La probabilidad de que salga un 1 es de 1/2, la probabilidad de que salga x es de 1/3 y la
* probabilidad de que salga 2 es de 1/6.
* 
* @author Sergio García Domínguez
*/

public class Ejercicio08 {
  public static void main (String[] args) {
    double probabilidad;
    String resultado;
    
    for (int i = 1 ; i<= 15; i++) {
      
      System.out.printf("%2d.  ", i);
      
      for (int j = 1; j <= 3; j++) {
        
        probabilidad = Math.random();
        
        if (probabilidad < (1.0 / 2.0)) {
          resultado = "1";
        } else if (probabilidad < (1.0 / 2.0 + 1.0 / 3.0)) {
          resultado = "X";
        } else {
          resultado = "2";
        }
        
        System.out.print(resultado + " ");
      }
      
      System.out.print("\n");
    }
  }
}
