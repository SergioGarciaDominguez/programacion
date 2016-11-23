/**
* Capítulo 5 - Ejercicio 34
*
* Pide dos números y devuelve un número formado por los digitos pares de uno y otro con los impares.
* 
* @author Sergio García Domínguez
*/

public class Ejercicio34 {
  public static void main (String[] args) {
    
    System.out.print("Por favor, introduzca un número: ");
    long primerNumero = Long.parseLong(System.console().readLine());
    int digitosPrimerNumero = 0;
    
    System.out.print("Introduzca otro número: ");
    long segundoNumero = Long.parseLong(System.console().readLine());
    int digitosSegundoNumero = 0;
    
    for (int i = 20; i >= 1; i--) {
      if (primerNumero > - Math.pow(10, i) && primerNumero < Math.pow(10, i)) {
        digitosPrimerNumero = i;
      }
      if (segundoNumero > - Math.pow(10, i) && segundoNumero < Math.pow(10, i)) {
        digitosSegundoNumero = i;
      }
    }
    
    System.out.print("El número formado por los dígitos pares es ");
    
    for (int i = 20; i >= 1; i--) {
        int digitoActualPrimerNumero;
        int digitoActualSegundoNumero;
        
      if (digitosPrimerNumero >= i) {
        digitoActualPrimerNumero = (int)((primerNumero % Math.pow(10, i)) / Math.pow(10, i - 1));
        
        if (digitoActualPrimerNumero % 2 == 0) {
          System.out.print(digitoActualPrimerNumero);
        }
      }

      if (digitosSegundoNumero >= i) {
        digitoActualSegundoNumero = (int)((segundoNumero % Math.pow(10, i)) / Math.pow(10, i - 1));
        
        if (digitoActualSegundoNumero % 2 == 0) {
          System.out.print(digitoActualSegundoNumero);
        }
      }
    }

    System.out.print("\nEl número formado por los dígitos impares es ");
    
    for (int i = 20; i >= 1; i--) {
        int digitoActualPrimerNumero;
        int digitoActualSegundoNumero;
        
      if (digitosPrimerNumero >= i) {
        digitoActualPrimerNumero = (int)((primerNumero % Math.pow(10, i)) / Math.pow(10, i - 1));
        
        if (digitoActualPrimerNumero % 2 == 1) {
          System.out.print(digitoActualPrimerNumero);
        }
      }

      if (digitosSegundoNumero >= i) {
        digitoActualSegundoNumero = (int)((segundoNumero % Math.pow(10, i)) / Math.pow(10, i - 1));
        
        if (digitoActualSegundoNumero % 2 == 1) {
          System.out.print(digitoActualSegundoNumero);
        }
      }
    }
    
    System.out.print("\n");
  }
}
