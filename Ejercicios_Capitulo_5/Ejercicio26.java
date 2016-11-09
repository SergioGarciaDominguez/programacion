/**
* Capítulo 5 - Ejercicio 26
*
* Pide un número y un dígito, y a continuación te dice en que posiciones está ese dígito.
* 
* @author Sergio García Domínguez
*/

public class Ejercicio26 {
  public static void main (String[] args) {
    System.out.println("Vamos a mostrar un número entero al revés\n");
  
    System.out.print("Introduzca el número entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el dígito a comprobar: ");
    int digito = Integer.parseInt(System.console().readLine());
    
    System.out.print("\n");
    
    int totalDigitos = 0;
    for (int i = 20; i >= 1; i--) {
      if (numero > - Math.pow(10, i) && numero < Math.pow(10, i)) {
        totalDigitos = i;
      }
    }
    
    System.out.println("Se encuentra en las posiciones: ");
    
    for (int posicion = totalDigitos; posicion >= 1; posicion--) {

      if (posicion != 1) {
        if (digito == ((int)((numero % Math.pow(10, posicion)) / Math.pow(10, posicion - 1)))) {
          System.out.print((totalDigitos - posicion + 1) + ", ");
        }
      } else {
        if (digito == ((int)((numero % Math.pow(10, posicion))))) {
          System.out.println(totalDigitos - posicion + 1);
        }
      }
    }
    
    System.out.print("\n");
  }
}
