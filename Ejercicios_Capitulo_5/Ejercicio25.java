/**
* Capítulo 5 - Ejercicio 25
*
* Pide un número y luego lo muestra al revés.
* 
* @author Sergio García Domínguez
*/

public class Ejercicio25 {
  public static void main (String[] args) {
    System.out.println("Vamos a mostrar un número entero al revés\n");
  
    System.out.print("Introduzca el número entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    System.out.print("\n");
    
    int totalDigitos = 0;
    for (int i = 20; i >= 1; i--) {
      if (numero > - Math.pow(10, i) && numero < Math.pow(10, i)) {
        totalDigitos = i;
      }
    }

    for (int posicion = 1; posicion <= totalDigitos; posicion++) {

        if (posicion != 1) {
          System.out.print((int)((numero % Math.pow(10, posicion)) / Math.pow(10, posicion - 1)));
        } else {
          System.out.print((int)(numero % Math.pow(10, posicion)));
        }
    }
    
    System.out.print("\n");
  }
}
