/**
* Capítulo 5 - Ejercicio 29
*
* Pide un número y calcula todos los enteros positivos menores y que a su vez no sean divisibles por
* otro número dado.
* 
* @author Sergio García Domínguez
*/

public class Ejercicio29 {
  public static void main (String[] args) {
    System.out.println("Vamos a calcular todos los enteros positivos menores a un número y que a su"
        + " vez no sean divisibles por otro número dado\n");
  
    System.out.print("Introduzca un número entero positivo: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el otro número: ");
    int numeroADividir = Integer.parseInt(System.console().readLine());
    
    for (int i = 1; i < numero; i++) {
      
      if (i % numeroADividir != 0) {
        
        if (i != numero - 1) {
          System.out.print(i + ", ");
        } else {
          System.out.print(i + ".");
        }
        
      }
    }
    
    System.out.print("\n");
  }
}
