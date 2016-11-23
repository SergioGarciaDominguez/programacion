/**
* Capítulo 5 - Ejercicio 36
*
* El programa dibuja una X con asteriscos, para ello pide la altura (mínimo 3).
* 
* @author Sergio García Domínguez
*/

public class Ejercicio36 {
  public static void main (String[] args) {
    
    System.out.print("Por favor, introduzca un número: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    int totalDigitos = 0;
    for (int i = 20; i >= 1; i--) {
      if (numero > - Math.pow(10, i) && numero < Math.pow(10, i)) {
        totalDigitos = i;
      }
    }
    int numeroAlReves = 0;
    for (int posicion = 1; posicion <= totalDigitos; posicion++) {
      
      numeroAlReves += (int)((numero % Math.pow(10, posicion)) / Math.pow(10, posicion - 1));

    }
    
    
  }
}
