package funciones;

/**
 * Capítulo 8 - Biblioteca de funciones (Ejercicios del 20 al 28)
 *  1. generaArrayInt
 *  2. minimoArrayInt
 *  3. maximoArrayInt
 *  4. mediaArrayInt
 *  5. estaEnArrayInt
 *  6. posicionEnArray
 *  7. volteaArrayInt
 *  8. rotaDerechaArrayInt
 *  9. rotaIzquierdaArrayInt
 * 
 * @author Sergio García Domínguez
 */
public class Ejercicios20A28 {
  /**
   * Convierte un número en base decimal a otra base menor de diez
   *
   * @param t tamaño del Array
   * @param a valor mínimo de los elementos
   * @param z valor máximo de los elementos
   * @return array con números aleatorios del tamaño deseado
   */
  public static int[] generaArrayInt(int t, int a, int z) {
    int[] array = new int[t];
    
    for (int i = 0; i < array.length; i++) {
      array[i] = (int)(Math.random() * (z - a) + a);
    }
    
    return array;
  }
  
  /**
   * Obtiene el valor mínimo que contiene un array
   *
   * @param a array del que vamos a sacar el mínimo
   * @return mínimo valor del array
   */
  public static int minimoArrayInt(int[] a) {
    int minimo = Integer.MAX_VALUE;
    
    for (int valor : a) {
      
      if (valor < minimo) {
        minimo = valor;
      }
      
    }
    
    return minimo;
  }
  
  /**
   * Obtiene el valor máximo que contiene un array
   *
   * @param a array del que vamos a sacar el máximo
   * @return máximo valor del array
   */
  public static int maximoArrayInt(int[] a) {
    int maximo = Integer.MIN_VALUE;
    
    for (int valor : a) {
      
      if (valor < maximo) {
        maximo = valor;
      }
      
    }
    
    return maximo;
  }
  
  /**
   * Obtiene la media de los valores de un array
   *
   * @param a array del que vamos a calcular la media
   * @return media de los valores del array
   */
  public static double mediaArrayInt(int[] a) {
    int suma = 0;
    
    for (int valor : a) {
      suma += valor;
    }
    
    return (double)(suma / a.length);
  }
  
  /**
   * Comprueba si un número se encuentra en un array.
   *
   * @param a array en el que vamos a comprobar si está el número
   * @param n número que vamos a comprobar si está en el array
   * @return true o false si el número está o no en el array
   */
  public static boolean estaEnArrayInt(int[] a, int n) {
    boolean estaEnArray = false;
    
    for (int valor : a) {
      
      if (valor == n) {
        estaEnArray = true;
      }
      
    }
    
    return estaEnArray;
  }
  
  /**
   * Busca un número en un array y devuelve su posición.
   *
   * @param a array en el que vamos a comprobar si está el número.
   * @param n número del que vamos a obtener su posición.
   * @return true o false si el número está o no en el array.
   */
  public static int posicionEnArrayInt(int[] a, int n) {
    int posicion = -1;
    
    for (int i = a.length; i > 0; i--) {
      
      if (a[i - 1] == n) {
        posicion = a[i-1];
      }
      
    }
    
    return posicion;
  }
  
  /**
   * Cambiar el orden de un array a la inversa.
   *
   * @param a array al que vamos a cambiarle el orden
   * @return array al revés
   */
  public static int[] volteaArrayInt(int[] a) {
    int[] arrayAlReves = new int[a.length];
    
    for (int i = 0; i < a.length; i++) {
      arrayAlReves[a.length - i - 1] = a[i];
    }
    
    return arrayAlReves;
  }
  
  /**
   * Rota los valores de un array a la derecha.
   *
   * @param a array al que vamos a cambiarle el orden
   * @return array con los valores rotados a la derecha.
   */
  public static int[] rotaDerechaArrayInt(int[] a) {
    int[] arrayRotado = new int[a.length];
    
    for (int i = 0; i < a.length; i++) {
      arrayRotado[0] = a[a.length - 1];
      
      if (i != a.length - 1) {
        arrayRotado[i + 1] = a[i];
      }
      
    }
    
    return arrayRotado;
  }
  
  /**
   * Rota los valores de un array a la izquierda.
   *
   * @param a array al que vamos a cambiarle el orden
   * @return array con los valores rotados a la derecha.
   */
  public static int[] rotaIzquierdaArrayInt(int[] a) {
    int[] arrayRotado = new int[a.length];
    
    for (int i = 0; i < a.length; i++) {
      arrayRotado[a.length - 1] = a[0];
      
      if (i != 0) {
        arrayRotado[i - 1] = a[i];
      }
      
    }
    
    return arrayRotado;
  }
  
  
}
