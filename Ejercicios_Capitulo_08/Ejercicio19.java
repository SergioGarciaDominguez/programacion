import java.util.Scanner;
import funciones.CambiosDeBase;

/**
 * Capítulo 8 - Ejercicio 19
 * 
 * Permite cambiar un número entre las siguientes bases: decimal, binario, hexadecimal y octal.
 * 
 * @author Sergio García Domínguez
 */
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
          numeroDecimal = CambiosDeBase.cambiarADecimal(Long.parseLong(numero), basePartida);  
          break;
        case 16:
          numeroDecimal = CambiosDeBase.hexadecimalADecimal(numero);
          break;
        default:
          numeroDecimal = Long.parseLong(numero);
          break;
      }

      switch (baseDeseada) {
        case 2:
        case 8:
          System.out.println(CambiosDeBase.decimalABase(numeroDecimal, baseDeseada));
          break;
        case 10:
          System.out.println(numeroDecimal);
          break;
        case 16:
          System.out.println(CambiosDeBase.decimalAHexadecimal(numeroDecimal));
          break;
      }
    
    } else {
      System.out.println(numero);
    }
    
  }
  
}
