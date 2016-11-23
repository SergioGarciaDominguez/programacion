/**
* Capítulo 1 - Ejercicio 05
*
* Muestra por pantalla el horario de clase con colores
*
* @author Sergio García Domínguez
*/

public class Ejercicio05 {
  public static void main (String[] args){
    // Código de colores
    String rojo = "\033[31m";
    String verde = "\033[32m"; 
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
    
    System.out.printf(blanco
        + "    HORA        LUNES     MARTES    MIÉRCOLES   JUEVES     VIERNES\n"
        + "===================================================================\n"
        + " 08:15-09:15   %-8s S.INF     %-8s PROG      %-8s PROG       %-8s BD        %-8s LM\n"
        + blanco
        + " 09:15-10:15   %-8s S.INF     %-8s PROG      %-8s PROG       %-8s BD        %-8s LM\n"
        + blanco
        + " 10:15-11:15   %-8s S.INF     %-8s PROG       %-8s LM        %-8s BD        %-8s ED\n"
        + blanco
        + " 11:15-11:45   ---------------------------------------------------\n"
        + " 11:45-12:45    %-8s FOL       %-8s BD        %-8s ED       %-8s PROG      %-8s S.INF\n"
        + blanco
        + " 12:45-13:45    %-8s FOL       %-8s BD        %-8s ED       %-8s PROG      %-8s S.INF\n"
        + blanco
        + " 13:45-14:45    %-8s FOL       %-8s BD        %-8s ED       %-8s PROG      %-8s S.INF"
        + "\u001B[0m\n", // Reseteo del color
        
        // Colores de la salida formateada
        naranja, verde, verde, azul, morado,
        naranja, verde, verde, azul, morado,
        naranja, verde, morado, azul, blanco,
        rojo, azul, blanco, verde, naranja,
        rojo, azul, blanco, verde, naranja,
        rojo, azul, blanco, verde, naranja);
  }
}
