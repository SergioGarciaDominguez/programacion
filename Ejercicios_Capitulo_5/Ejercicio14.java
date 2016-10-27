/**
* Capítulo 5 - Ejercicio 14
*
* Pide una base y un exponente y calcula la potencia
* 
* @author Sergio García Domínguez
*/

public class Ejercicio14 {
  public static void main (String[] args) {
    System.out.println("Vamos a calcular una potencia\n");
    
    System.out.print("Introduzca la base: ");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca el exponente (entero positivo): ");
    int exponente = Integer.parseInt(System.console().readLine());
    double multiplicacion = base;
    double resultado = 0;
    
    for (int i = 1; i <= exponente; i++) {
      resultado = multiplicacion;
      multiplicacion *= base;
    }
    System.out.println(resultado);
  }
}
