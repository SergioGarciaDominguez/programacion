package funciones;

/**
 * Capítulo 8 - Biblioteca de funciones (Ejercicios del 1 al 14)
 *   1. esCapicua
 *   2. esPrimo
 *   3. siguientePrimo
 *   4. potencia
 *   5. digitos
 *   6. voltea
 *   7. digitoN
 *   8. posicionDeDigito
 *   9. quitaPorDetras
 *  10. quitaPorDelante
 *  11. pegaPorDetras
 *  12. pegaPorDelante
 *  13. trozoDeNumero
 *  14. juntaNumeros
 * 
 * @author Sergio García Domínguez
 */
public class Ejercicios01A14 {
  
  /**
   * Comprueba si un número es capicúa.
   *
   * @param n número que vamos a comprobar si es capicúa
   * @return <code>true</code> si el número es capicúa o <code>false</code> si no es capicúa
   */
  public static boolean esCapicua(long n) { 
    return (n == voltea(n));
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
  public static boolean esPrimo(long n) { 
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
  public static long siguientePrimo(long n) {
    
    do {
      n++;
    } while (!esPrimo(n));
    
    return n;
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
  public static int digitos(long n) {
    int totalDigitos = 0;
    
    for (int i = 20; i > 0; i--) {
      
      if (n > - Math.pow(10, i) && n < Math.pow(10, i)) {
        totalDigitos = i;
      }
      
    }
    
    return totalDigitos;
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
  public static long voltea(long n) {
    long numeroAlReves = 0;
    
    for (int i = 1; i <= digitos(n); i++) {
      numeroAlReves += (int)Math.pow(10, digitos(n) - i)
          * (int)((n % Math.pow(10, i)) / Math.pow(10, i - 1));
    }
    
    return numeroAlReves;
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
   * Obtiene el dígito de un número que esté en la posición dada.
   *
   * @param n número del cual vamos a obtener el dígito
   * @param p posición del dígito
   * @return dígito que vamos a obtener
   */
  public static int digitoN(long n, int p) { 
    return (int)((n % Math.pow(10, p)) / Math.pow(10, p - 1));   
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
   * Obtiene la primera posición en la que aparece un dígito en un número.
   *
   * @param n número en el que vamos a buscar el dígito
   * @param d dígito del cual vamos a obtener la posición
   * @return posición del dígito
   */
  public static int posicionDeDigito(long n, int d) {
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
  public static long quitaPorDetras(long n, int d) {
    return (long)(n / Math.pow(10, d));
  }
  
  /**
   * Quita una cantidad dada de dígitos del final de un número.
   *
   * @param n número al que vamos a quitarle dígitos
   * @param d cantidad de dígitos que vamos a quitarle al número
   * @return número con los dígitos ya quitados
   */
  public static int quitaPorDetras(int n, int d) {
    return (int)(n / Math.pow(10, d));
  }
  
  /**
   * Quita una cantidad dada de dígitos del principio de un número.
   *
   * @param n número al que vamos a quitarle dígitos
   * @param d cantidad de dígitos que vamos a quitarle al número
   * @return número con los dígitos ya quitados
   */
  public static long quitaPorDelante(long n, int d) {
    return voltea(quitaPorDetras(voltea(n), d));
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
   * Añade un dígito por delante a un número.
   *
   * @param n número al que le vamos a añadir el dígito
   * @param d dígito que vamos a añadir
   * @return número con el dígito añadido
   */
  public static long pegaPorDelante(long n, int d) {
    return (Long.parseLong(d + String.valueOf(n)));
  }
  
  /**
   * Añade un dígito por delante a un número.
   *
   * @param n número al que le vamos a añadir el dígito
   * @param d dígito que vamos a añadir
   * @return número con el dígito añadido
   */
  public static long pegaPorDelante(int n, int d) {
    return (Long.parseLong(d + String.valueOf(n)));
  }
  
  /**
   * Añade un dígito por detrás a un número.
   *
   * @param n número al que le vamos a añadir el dígito
   * @param d dígito que vamos a añadir
   * @return número con el dígito añadido
   */
  public static long pegaPorDetras(long n, int d) {
    return (Long.parseLong(String.valueOf(n) + d));
  }
  
  /**
   * Añade un dígito por detrás a un número.
   *
   * @param n número al que le vamos a añadir el dígito
   * @param d dígito que vamos a añadir
   * @return número con el dígito añadido
   */
  public static long pegaPorDetras(int n, int d) {
    return (Long.parseLong(String.valueOf(n) + d));
  }
  
  /**
   * Obtiene una parte de un número a partir de la posición del dígito de inicio y de fin
   * 
   * @param n número del que vamos a extraer un trozo
   * @param i posicion de inicio del trozo
   * @param f posicion final del trozo
   * @return trozo que extraemos al número
   */
  public static String trozoDeNumero(long n, int i, int f) {
    String trozo = "";
    
    for (int j = digitos(n) - i + 1; j > digitos(n) - f; j--) {
      trozo += String.valueOf((int)((n % Math.pow(10, j)) / Math.pow(10, j - 1)));
    }
    
    return trozo;
  }
  
  /**
   * Obtiene una parte de un número a partir de la posición del dígito de inicio y de fin
   * 
   * @param n número del que vamos a extraer un trozo
   * @param i posicion de inicio del trozo
   * @param f posicion final del trozo
   * @return trozo que extraemos al número
   */
  public static String trozoDeNumero(int n, int i, int f) {
    String trozo = "";
    
    for (int j = digitos(n) - i + 1; j > digitos(n) - f; j--) {
      trozo += String.valueOf((int)((n % Math.pow(10, j)) / Math.pow(10, j - 1)));
    }
    
    return trozo;
  }
  
  /**
   * Junta dos números para convertirlos en uno.
   * 
   * @param a número que vamos a juntar por delante
   * @param b número que vamos a juntar por detrás
   * @return trozo que extraemos al número
   */
  public static long juntaNumeros(int a, int b) {
    long numeroJunto = Long.parseLong(a + String.valueOf(b));
    
    return numeroJunto;
  }
  
   /**
   * Junta dos números para convertirlos en uno.
   * 
   * @param a número que vamos a juntar por delante
   * @param b número que vamos a juntar por detrás
   * @return trozo que extraemos al número
   */
  public static long juntaNumeros(long a, long b) {
    long numeroJunto = Long.parseLong(a + String.valueOf(b));
    
    return numeroJunto;
  }

}