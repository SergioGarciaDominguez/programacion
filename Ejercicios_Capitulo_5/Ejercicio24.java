/**
* Capítulo 5 - Ejercicio 24
*
* Dibuja una pirámide de números, estos han de estar en orden.
* 
* @author Sergio García Domínguez
*/

public class Ejercicio24 {
  public static void main (String[] args) {
    System.out.println("Vamos a dibujar una pirámide\n");
  
    System.out.print("Introduzca la altura de la pirámide: ");
    int alturaTotal = Integer.parseInt(System.console().readLine());
    
    System.out.print("\n");
    
    for (int nivelActual = 1; nivelActual <= alturaTotal; nivelActual++) {
      
      for (int espacios = 1; espacios <= alturaTotal - nivelActual; espacios++) {
        System.out.print(" ");
      }
      
      for (int i = 1; i <= nivelActual; i++) {
        System.out.print(i);
      }
      
      for (int i = 1; i <= nivelActual - 1; i++) {
        System.out.print(i);
      }
      
      System.out.print("\n");
    }
  }
}

