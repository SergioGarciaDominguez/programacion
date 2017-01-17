/**
 * Biblioteca
 * @author Sergio García Domínguez
 */
public class Ejercicios1A14 {
  public static void main(String[] args) {
    
    System.out.println(volteaConCeros(10011100));
    System.out.println(decimalAHexadecimal(237));
    System.out.println(hexadecimalADecimal("ED"));
  }
  
  /**
   * Comprueba si un número es capicúa.
   *
   * @param n número que vamos a comprobar si es capicúa
   * @return <code>true</code> si el número es capicúa o <code>false</code> si no es capicúa
   */
  public static boolean esCapicua(int n) { 
    return (n == voltea(n));
  }
  
  /**
   * Comprueba si un número es primo.
   *
   * @param n número que vamos a comprobar si es primo
   * @return <code>true</code> si el número es primo o <code>false</code> si no es primo
   */
  public static boolean esPrimo(int n) { 
    boolean primo = true;
    
    if (n > 2) {
      
      for (int i = (int)Math.sqrt(n); i > 1; i--) {
        
        if (n % i == 0) {
          primo = false;
        }
      }
    
    } else if (n == 0) {
      primo = false;
    }
    
    return primo;
  }
  
  /**
   * Obtiene el número primo menor que sea mayor que un número dado.
   *
   * @param n número a partir del cual vamos a calcular el siguiente número primo
   * @return número primo siguiente
   */
  public static int siguientePrimo(int n) {
    
    do {
      n++;
    } while (!esPrimo(n));
    
    return n;
  }
  
  /**
   * Calcula una potencia con base y exponentes enteros, si el exponente es negativo, la base ha de
   * ser positiva.
   *
   * @param b base de la potencia
   * @param e exponente de la potencia
   * @return <code>true</code> si el número es primo o <code>false</code> si no es primo
   */
  public static double potencia(int b, int e) {
    int multiplicacion = b;
    double resultado = 1;
    
    if (e >= 0) {
      
      for (int i = 1; i <= e; i++) {
        resultado = multiplicacion;
        multiplicacion *= b;
      }
      
    } else {
      e = Math.abs(e);
      resultado = 1.0 / potencia(b, e);
    }

    return resultado;
  }
  
  /**
   * Calcula la cantidad de dígitos que tiene un número.
   *
   * @param n número que deseamos conocer la cantidad de dígitos
   * @return dígitos que tiene el número
   */
  public static int digitos(int n) {
    int totalDigitos = 0;
    
    for (int i = 20; i > 0; i--) {
      
      if (n > - Math.pow(10, i) && n < Math.pow(10, i)) {
        totalDigitos = i;
      }
      
    }
    
    return totalDigitos;
  }
  
  /**
   * Da la vuelta a un número.
   *
   * @param n número que vamos a poner del revés
   * @return número puesto del revés
   */
  public static int voltea(int n) {
    int numeroAlReves = 0;
    
    for (int i = 1; i <= digitos(n); i++) {
      numeroAlReves += (int)Math.pow(10, digitos(n) - i)
          * (int)((n % Math.pow(10, i)) / Math.pow(10, i - 1));
    }
    
    return numeroAlReves;
  }
  
  /**
   * Obtiene el dígito de un número que esté en la posición dada.
   *
   * @param n número del cual vamos a obtener el dígito
   * @param p posición del dígito
   * @return dígito que vamos a obtener
   */
  public static int digitoN(int n, int p) { 
    return ((int)((n % Math.pow(10, p)) / Math.pow(10, p - 1)));   
  }
  
  /**
   * Obtiene la primera posición en la que aparece un dígito en un número.
   *
   * @param n número en el que vamos a buscar el dígito
   * @param d dígito del cual vamos a obtener la posición
   * @return posición del dígito
   */
  public static int posicionDeDigito(int n, int d) {
    int posicionDigito = -1;
    
    for (int i = 0; i < digitos(n); i++) {
      
      if (d == ((int)(n % Math.pow(10, i + 1)) / Math.pow(10, i))) {
        posicionDigito = digitos(n) + 1;
      }
      
    }
    
    return posicionDigito;
  }
  
  /**
   * Quita una cantidad dada de dígitos del final de un número.
   *
   * @param n número al que vamos a quitarle dígitos
   * @param d cantidad de dígitos que vamos a quitarle al número
   * @return número con los dígitos ya quitados
   */
  public static int quitaPorDetras(int n, int d) {
    return (n / (int)Math.pow(10, d));
  }
  
  /**
   * Quita una cantidad dada de dígitos del principio de un número.
   *
   * @param n número al que vamos a quitarle dígitos
   * @param d cantidad de dígitos que vamos a quitarle al número
   * @return número con los dígitos ya quitados
   */
  public static int quitaPorDelante(int n, int d) {
    return voltea(quitaPorDetras(voltea(n), d));
  }
  
  /**
   * Quita una cantidad dada de dígitos del principio de un número.
   *
   * @param n número al que vamos a quitarle dígitos
   * @param d cantidad de dígitos que vamos a quitarle al número
   * @return número con los dígitos ya quitados
   */
  public static int pegaPorDelante(int n, int d) {
    return voltea(quitaPorDetras(voltea(n), d));
  }
  
  public static int binarioAdecimal(int n) {
    int numeroCambiado = 0;
    
    for (int i = 1; i <= digitos(n); i++) {
      numeroCambiado += (int)Math.pow(2, i - 1)
          * (int)((n % Math.pow(10, i)) / Math.pow(10, i - 1));
    }
  
    return numeroCambiado;
  }
  
  public static int decimalABinario(int n) {
    int numeroCambiado = 0;
    int num = n;
    
    for (int i = 1; i <= (int)(Math.log(n) / Math.log(2)) + 1; i++) {
      numeroCambiado += (int)Math.pow(10, i - 1) * (num % 2);
      num /= 2;
    }
    
    return numeroCambiado;
  }
  
  public static int decimalABase(int n, int b) {
    int numeroCambiado = 0;
    int num = n;
    
    for (int i = 1; i <= (int)(Math.log(n) / Math.log(b)) + 1; i++) {
      numeroCambiado += (int)Math.pow(10, i - 1) * (num % b);
      num /= b;
    }
    
    return numeroCambiado;
  }
  
  public static int cambiarADecimal(int n, int b) {
    int numeroCambiado = 0;
    
    for (int i = 1; i <= digitos(n); i++) {
      numeroCambiado += (int)Math.pow(b, i - 1)
          * (int)((n % Math.pow(10, i)) / Math.pow(10, i - 1));
    }
  
    return numeroCambiado;
  }
  
  public static String decimalAHexadecimal(int n) {
    String numeroCambiado = "";
    String[] digitos = new String[(int)(Math.log(n) / Math.log(16)) + 1];
    
    for (int i = digitos.length - 1; i >= 0; i--) {
      
      switch (n % 16) {
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
  
  public static int hexadecimalADecimal(String n) {
    int numeroCambiado = 0;
    
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

  public static String volteaConCeros(int n) {
    String numeroAlReves = "";
    
    for (int i = 1; i <= digitos(n); i++) {
      numeroAlReves += ((int)((n % Math.pow(10, i)) / Math.pow(10, i - 1)));
    }
    
    return numeroAlReves;
  }
}

