/**
* Capítulo 5 - Ejercicio 24
*
* Muestra todos los primos entre 2 y 100 inclusive.
* 
* @author Sergio García Domínguez
*/

public class Ejercicio24 {
  public static void main (String[] args) {
    System.out.println("Vamos a dibujar una pirámide\n");
  
    System.out.print("Introduzca la altura de la pirámide: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("\n");
    
    for (int nivelActual = 1; nivelActual <= alturaTotal; nivelActual++) {
      
      for (int espacios = 1; espacios <= alturaTotal - nivelActual; espacios++) {
        System.out.print(" ");
      }
      
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      
      for (int j = i - 1; j >= 1; j--) {
        System.out.print(j);
      }
      
      System.out.print("\n");
    }
  }
}

