<<<<<<< HEAD
/**
* Capítulo 4 - Ejercicio 15
*
* Pide un carácter y rellena una pirámide con él. El usuario elige hacia dónde apunta el vértice.
*
* @author Sergio García Domínguez
*/

public class Ejercicio15 {
  public static void main (String[] args) {
    System.out.print("Introduzca un carácter: ");
    char c = (System.console().readLine()).charAt(0);
    
    System.out.println("¿Hacia qué dirección quiere que apunte el vértice de la pirámide?\n"
        + "1. Arriba\n2. Abajo\n3. Derecha\n4. Izquierda");
    int direccion = Integer.parseInt(System.console().readLine());
    
    switch (direccion) {
      case 1:
        System.out.println("\n  " + c + "  \n"
            + " " + c + c + c + " \n"
            + "" + c + c + c + c + c);
        break;
      case 2:
        System.out.println("\n"
            + c + c + c + c + c + "\n"
            + " " + c + c + c + " \n"
            + "  " + c + "  ");
        break;
      case 3:
        System.out.println("\n"
            + c + "\n"
            + c + c + "\n"
            + c + c + c + "\n"
            + c + c + "\n"
            + c);
        break;
      case 4:
        System.out.println("\n"
            + "  " + c + "\n"
            + " " + c + c + "\n"
            + c + c + c + "\n"
            + " " + c + c + "\n"
            + "  " + c);
        break;
      default:
        System.out.print("Dirección elegida errónea.");
        break;
    }
  }
}
=======
/**
* Capítulo 4 - Ejercicio 15
*
* Pide un carácter y rellena una pirámide con él. El usuario elige hacia dónde apunta el vértice.
*
* @author Sergio García Domínguez
*/

public class Ejercicio15 {
  public static void main (String[] args) {
    System.out.print("Introduzca un carácter: ");
    char c = (System.console().readLine()).charAt(0);
    
    System.out.println("¿Hacia qué dirección quiere que apunte el vértice de la pirámide?\n"
        + "1. Arriba\n2. Abajo\n3. Derecha\n4. Izquierda");
    int direccion = Integer.parseInt(System.console().readLine());
    
    switch (direccion) {
      case 1:
        System.out.println("\n  " + c + "  \n"
            + " " + c + c + c + " \n"
            + "" + c + c + c + c + c);
        break;
      case 2:
        System.out.println("\n"
            + c + c + c + c + c + "\n"
            + " " + c + c + c + " \n"
            + "  " + c + "  ");
        break;
      case 3:
        System.out.println("\n"
            + c + "\n"
            + c + c + "\n"
            + c + c + c + "\n"
            + c + c + "\n"
            + c);
        break;
      case 4:
        System.out.println("\n"
            + "  " + c + "\n"
            + " " + c + c + "\n"
            + c + c + c + "\n"
            + " " + c + c + "\n"
            + "  " + c);
        break;
      default:
        System.out.print("Dirección elegida errónea.");
        break;
    }
  }
}
>>>>>>> 530340828eb844188b0723543c83a26973aa8d3f
