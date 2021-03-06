/**
* Capítulo 5 - Ejercicio 21
*
* Pide números y calcula cuántos números se han insertado, la media de los números impares y el
* mayor de los pares
* 
* @author Sergio García Domínguez
*/

public class Ejercicio21 {
  public static void main (String[] args) {
    System.out.println("Vamos a introducir varios números mayores o iguales a 0 (para detenerlo se" 
        + "introduce un número negativo\n");
        
    int numero;
    int numerosIntroducidos = 0;
    int sumaImpares = 0;
    int cantidadImpares = 0;
    int mayorPares = 0;
    
    do {
      System.out.print("Introduzca un número: ");
      numero = Integer.parseInt(System.console().readLine());
      
      numerosIntroducidos++;
      
      if (numero % 2 == 1) {
        cantidadImpares++;
        sumaImpares += numero;
      } else {
        if (numero > mayorPares) {
          mayorPares = numero;
        }
      }
    } while (numero >= 0);
    
    double mediaImpares;
    
    System.out.println("\nNúmeros introducidos: " + (numerosIntroducidos - 1));
    System.out.println("Media de los impares: " + ((double)sumaImpares / (double)cantidadImpares));
    System.out.println("Número par mayor: " + mayorPares);
  }
}
