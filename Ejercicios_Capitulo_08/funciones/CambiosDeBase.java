package funciones;
import static funciones.Ejercicios01A14.digitos;

/**
 * Capítulo 8 - Biblioteca de funciones (cambios de base)
 *  1. decimalABase
 *  2. cambiarADecimal
 *  3. decimalAHexadecimal
 *  4. hexadecimalADecimal
 * 
 * @author Sergio García Domínguez
 */
public class CambiosDeBase {
  
  /**
   * Convierte un número en base decimal a otra base menor de diez
   *
   * @param n número en base decimal
   * @param b base a la que vamos a cambiar el número (b < 10)
   * @return número cambiado a la base deseada
   */
  public static long decimalABase(long n, int b) {
    long numeroCambiado = 0;
    int posicionDigito = 0;
    
    while(n != 0) {      
      numeroCambiado += (int)(n % b) * (long)Math.pow(10, posicionDigito);  
      posicionDigito++;
      n /= b;
    }
    
    return numeroCambiado;
  }
  
  /**
   * Convierte un número en base decimal a otra base menor de diez
   *
   * @param n número en base decimal
   * @param b base a la que vamos a cambiar el número (b < 10)
   * @return número cambiado a la base deseada
   */
  public static long decimalABase(int n, int b) {
    long numeroCambiado = 0;
    int posicionDigito = 0;
    
    while(n != 0) {      
      numeroCambiado += (int)(n % b) * (long)Math.pow(10, posicionDigito);  
      posicionDigito++;
      n /= b;
    }
    
    return numeroCambiado;
  }
  
  /**
   * Convierte un número en una base dada (menor de diez) a base decimal.
   *
   * @param n número que vamos a cambiar de base
   * @param b base del número que vamos a cambiar de base
   * @return número en base decimal
   */
  public static long cambiarADecimal(long n, int b) {
    long numeroCambiado = 0;
    
    for (int i = 1; i <= digitos(n); i++) {
      numeroCambiado += Math.pow(b, i - 1) * (int)((n % Math.pow(10, i)) / Math.pow(10, i - 1));
    }
  
    return numeroCambiado;
  }
  
  /**
   * Convierte un número en una base dada (menor de diez) a base decimal.
   *
   * @param n número que vamos a cambiar de base
   * @param b base del número que vamos a cambiar de base
   * @return número en base decimal
   */
  public static int cambiarADecimal(int n, int b) {
    int numeroCambiado = 0;
    
    for (int i = 1; i <= digitos((int)n); i++) {
      numeroCambiado += Math.pow(b, i - 1) * (int)((n % Math.pow(10, i)) / Math.pow(10, i - 1));
    }
  
    return numeroCambiado;
  }
  
  /**
   * Convierte un número en base decimal a base hexadecimal
   *
   * @param n número en base decimal
   * @return número en base hexadecimal
   */
  public static String decimalAHexadecimal(long n) {
    String numeroCambiado = "";
    char[] digito = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E'};
    
    while (n != 0) {
      numeroCambiado = String.valueOf(digito[(int)n % 16]) + numeroCambiado;
      n /= 16;
    }
    
    return numeroCambiado;
  }
  
  /**
   * Convierte un número en base decimal a base hexadecimal
   *
   * @param n número en base decimal
   * @return número en base hexadecimal
   */
  public static String decimalAHexadecimal(int n) {
    String numeroCambiado = "";
    char[] digito = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E'};
    
    while (n != 0) {
      numeroCambiado = String.valueOf(digito[(int)n % 16]) + numeroCambiado;
      n /= 16;
    }
    
    return numeroCambiado;
  }
  
  /**
   * Convierte un número en base hexadecimal a base decimal.
   *
   * @param n número en base hexadecimal
   * @return número en base decimal
   */
  public static long hexadecimalADecimal(String n) {
    long numeroCambiado = 0;
    char[] digito = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E'};
    
    for (int i = n.length() - 1; i >= 0; i--) {
      
      for (int j = 0; j < digito.length; j++) {
        
        if (digito[j] == n.charAt(n.length() - i - 1)) {
          numeroCambiado += Math.pow(16, i) * j;
        }
        
      }
      
    }
    
    return numeroCambiado;  
  }

}
