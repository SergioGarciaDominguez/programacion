/**
* Capítulo 4 - Ejercicio 16
*
* Realiza un test al usuario para saber si su pareja le es infiel. Por cada respuesta positiva suma
* 3 puntos.
*
* @author Sergio García Domínguez
*/

public class Ejercicio16 {
  public static void main(String[] args) {
    
    System.out.println("Test de fidelidad (10 preguntas):\n");

    System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo"
        + "aparente.\nVerdadero o falso (V o F): ");
    String respuesta = (System.console().readLine()).toLowerCase();
    int puntos = 0;
    
    if (respuesta.equals("v")) {
      puntos += 3;
    }

    System.out.print("\n2. Ha aumentado sus gastos de vestuario.\nVerdadero o falso (V o F): ");
    respuesta = (System.console().readLine()).toLowerCase();
    
    if (respuesta.equals("v")) {
      puntos += 3;
    }
    
    System.out.print("\n3. Ha perdido el interés que mostraba anteriormente por ti.\n"
        + "Verdadero o falso (V o F): ");
    respuesta = (System.console().readLine()).toLowerCase();
    
    if (respuesta.equals("v")) {
      puntos += 3;
    }

    System.out.print("\n4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se"
        + " arregla el pelo y se asea con más frecuencia (si es mujer).\n"
        + "Verdadero o falso (V o F): ");
    respuesta = (System.console().readLine()).toLowerCase();
    
    if (respuesta.equals("v")) {
      puntos += 3;
    }
    
    System.out.print("\n5. No te deja que mires la agenda de su teléfono móvil.\n"
        + "Verdadero o falso (V o F): ");
    respuesta = (System.console().readLine()).toLowerCase();
    
    if (respuesta.equals("v")) {
      puntos += 3;
    }
    
    System.out.print("\n6. A veces tiene llamadas que dice no querer contestar cuando estás tú"
        + " delante.\nVerdadero o falso (V o F): ");
    respuesta = (System.console().readLine()).toLowerCase();
    
    if (respuesta.equals("v")) {
      puntos += 3;
    }
        
    System.out.print("\n7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.\n"
        + "Verdadero o falso (V o F): ");
    respuesta = (System.console().readLine()).toLowerCase();
    
    if (respuesta.equals("v")) {
      puntos += 3;
    }
    
    System.out.print("\n8. Muchos días viene tarde después de trabajar porque dice tener mucho más"
        + " trabajo.\nVerdadero o falso (V o F): ");
    respuesta = (System.console().readLine()).toLowerCase();
    
    if (respuesta.equals("v")) {
      puntos += 3;
    }
    
    System.out.print("\n9. Has notado que últimamente se perfuma más.\n"
        + "Verdadero o falso (V o F): ");
    respuesta = (System.console().readLine()).toLowerCase();
    
    if (respuesta.equals("v")) {
      puntos += 3;
    }
    
    System.out.print("\n10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo."
        + "\nVerdadero o falso (V o F): ");
    respuesta = (System.console().readLine()).toLowerCase();
    
    if (respuesta.equals("v")) {
      puntos += 3;
    }
    
    if (puntos <= 10) {
      System.out.print("\nResultado:\n¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    }
    
    if ((puntos > 11 ) && (puntos <= 22)) {
      System.out.print("\nResultado:\nQuizás exista el peligro de otra persona en su vida o en su"
          + " mente, aunque seguramente será algo sin importancia. No bajes la guardia.");    
    }
    
    if (puntos >= 22) {
      System.out.print("\nResultado:\nTu pareja tiene todos los ingredientes para estar viviendo un"
          + " romance con otra persona. Te aconsejamos que indagues un poco más y averigües qué es"
          + " lo que está pasando por su cabeza.");
    }
  }
}
