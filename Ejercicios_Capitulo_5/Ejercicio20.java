/**
* Capítulo 5 - Ejercicio 20
*
* Dibuja una pirámide hueca, pide la altura y el carácter que usa para dibujarla.
* 
* @author Sergio García Domínguez
*/

public class Ejercicio20 {
  public static void main (String[] args) {
    System.out.println("Vamos a dibujar una pirámide\n");
  
    System.out.print("Introduzca la altura de la pirámide: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el carácter que se va a usar para dibujarla: ");
    char caracter = (System.console().readLine()).charAt(0);
    
    System.out.print("\n");
    
    for (int i = 1; i <= (altura - 1); i++) {
      System.out.print(" ");
    }
    System.out.println(caracter);
    
    for (int i = 1; i <= altura - 1; i++) {
      for (int j = 1; j <= altura - i - 1; j++) {
        System.out.print(" ");
      }
      System.out.print(caracter);
      
      for (int j = 1; j <= 2 * i - 1; j++) {
        if (i != altura - 1) {
          System.out.print(" ");
        } else {
          System.out.print(caracter);
        }
      }   
       
      System.out.println(caracter);
    }
  }
}
