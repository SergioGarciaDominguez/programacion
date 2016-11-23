/**
* Capítulo 6 - Ejercicio 6
*
* Hay que adivinar un numero entre 0 y 100. Hay 5 oportunidades.
* 
* @author Sergio García Domínguez
*/

public class Ejercicio06 {
  public static void main (String[] args) {
    int numero = (int)(Math.random() * 101 + 0);
    int contador = 1;
    
    System.out.println(numero);
    
    System.out.print("Intente adivinar el número entero de 0 a 100 que he pensado: ");
    int numeroIntento = Integer.parseInt(System.console().readLine());
    
    while (numero != numeroIntento && contador < 5) {
      System.out.print("No lo ha adivinado, siga intentándolo, introduzca otro número: ");
      numeroIntento = Integer.parseInt(System.console().readLine());
      contador++;
    }
    
    if (contador >= 5) {
      System.out.print("\nNo lo ha adivinado, lo siento");
    } else {
      System.out.print("\n¡Correcto lo ha adivinado, usted está de suerte!");
    }
    
  }
}
