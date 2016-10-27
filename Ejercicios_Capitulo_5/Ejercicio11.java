/**
* Capítulo 5 - Ejercicio 11
*
* Pide un número y muestra en tres columnas, el cuadrado y el cubo de
* los 5 primeros números enteros a partir del número introducido.
*
* @author Sergio García Domínguez
*/

public class Ejercicio11 {
  public static void main (String[] args) {
    
    System.out.print("Vamos a calcular el cuadrado y el cubo de los 5 números enteros");
    System.out.println(" siguientes al que introduzca\n");
    
    System.out.print("Introduzca un número entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    System.out.printf("\n%10s%10s%10s\n", "Número", "Cuadrado", "Cubo");
    
    for (int i = 1; i <=5; i++) {
      System.out.printf("%10d%10.0f%10.0f\n", numero + i, Math.pow(numero + i, 2),
          Math.pow(numero + i, 3));
    }
  }
}
