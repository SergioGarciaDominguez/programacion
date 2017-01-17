/**
 * Capítulo 8 - Ejercicio 19
 * 
 * @author Sergio García Domínguez
 */

import java.util.Scanner;
import static funciones.Ejercicio01A14.digitos;

public class Ejercicio19 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Vamos a cambiar un número de base\n");
    System.out.print("Introduzca el número a cambiar: ");
    String numero = s.nextLine();
    System.out.println("\nSeleccione la base de partida (introduzca el número del menú):");
    System.out.println("2. Binario");
    System.out.println("8. Octal");
    System.out.println("10. Decimal");
    System.out.println("16. Hexadecimal");
    int basePartida = Integer.parseInt(s.nextLine());
    System.out.println("\nSeleccione la base a la que cambiar (introduzca el número del menú):");
    System.out.println("2. Binario");
    System.out.println("8. Octal");
    System.out.println("10. Decimal");
    System.out.println("16. Hexadecimal");
    int baseDeseada = Integer.parseInt(s.nextLine());
    System.out.print("\nEl número en base " + baseDeseada + " es el ");
    
    if (basePartida != baseDeseada) {
      long numeroDecimal;
      
      switch (basePartida) {
        case 2:
        case 8:
          numeroDecimal = cambiarADecimal(Long.parseLong(numero), basePartida);  
          break;
        case 16:
          numeroDecimal = hexadecimalADecimal(numero);
          break;
        default:
          numeroDecimal = Integer.parseInt(numero);
          break;
      }

      switch (baseDeseada) {
        case 2:
        case 8:
          System.out.println(decimalABase(numeroDecimal, baseDeseada));
          break;
        case 10:
          System.out.println(numeroDecimal);
          break;
        case 16:
          System.out.println(decimalAHexadecimal(numeroDecimal));
          break;
      }
    
    } else {
      System.out.println(Integer.parseInt(numero));
    }
    
  }
  
  public static long decimalABase(long n, int b) {
    long numeroCambiado = 0;
    long num = n;
    
    for (int i = 1; i <= (int)(Math.log(n) / Math.log(b)) + 1; i++) {
      numeroCambiado += ((int)(Math.pow(10, i - 1) * (num % b)));
      num /= b;
    }
    
    return numeroCambiado;
  }
  
  public static long cambiarADecimal(long n, int b) {
    long numeroCambiado = 0;
    
    for (int i = 1; i <= digitos((int)n); i++) {
      numeroCambiado += (int)Math.pow(b, i - 1)
          * (int)((n % Math.pow(10, i)) / Math.pow(10, i - 1));
    }
  
    return numeroCambiado;
  }
  
  public static String decimalAHexadecimal(long n) {
    String numeroCambiado = "";
    String[] digitos = new String[(int)(Math.log(n) / Math.log(16)) + 1];
    
    for (int i = digitos.length - 1; i >= 0; i--) {
      
      switch ((int)(n % 16)) {
        case 10:
          digitos[i] = "A";
          break;
        case 11:
          digitos[i] = "B";
          break;
        case 12:
          digitos[i] = "C";
          break;
        case 13:
          digitos[i] = "D";
          break;
        case 14:
          digitos[i] = "E";
          break;
        case 15:
          digitos[i] = "F";
          break;
        default:
          digitos[i] = String.valueOf(n % 16);
          break;
      }
      
      n /= 16;
    }
    
    for (String digito : digitos) {
      numeroCambiado += digito;
    }
    
    return numeroCambiado;
  }
  
  public static long hexadecimalADecimal(String n) {
    long numeroCambiado = 0;
    
    for (int i = n.length() - 1; i >= 0; i--) {

      switch (n.charAt(n.length() - i - 1)) {
        case 'a':
        case 'A':
          numeroCambiado += ((int)Math.pow(16, i) * 10);
          break;
        case 'b':
        case 'B':
          numeroCambiado += ((int)Math.pow(16, i) * 11);
          break;
        case 'c':
        case 'C':
          numeroCambiado += ((int)Math.pow(16, i) * 12);
          break;
        case 'd':
        case 'D':
          numeroCambiado += ((int)Math.pow(16, i) * 13);
          break;
        case 'e':
        case 'E':
          numeroCambiado += ((int)Math.pow(16, i) * 14);
          break;
        case 'f':
        case 'F':
          numeroCambiado += ((int)Math.pow(16, i) * 15);
          break;
        default:
          numeroCambiado += (int)Math.pow(16, i)
              * Integer.parseInt(String.valueOf(n.charAt(n.length() - i - 1)));
          break;
      }
      
    }
  
    return numeroCambiado;
  }

}
