/**
* Capítulo 6 - Ejercicio 9
*
* Genera números aleatorios pares entre 0 y 100 y no termina de generar números hasta que no saca el
* 24. También cuenta cuántos numeros se han generado.
* 
* @author Sergio García Domínguez
*/

public class Ejercicio09 {
  public static void main (String[] args) {
    int numero;
    int cuentaNumeros = 0;
    
    do {
      numero = (int)(Math.random() * 101 + 0);
      
      if (numero % 2 == 0) {
        System.out.print(numero + " ");
        cuentaNumeros++;
      }
      
    } while (numero != 24);
    
    System.out.println("\n\nSe han generado " + cuentaNumeros + " números.");
  }
}
