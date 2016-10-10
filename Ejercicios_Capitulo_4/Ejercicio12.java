/**
* Capítulo 4 - Ejercicio 12
*
* Minicuestionario de 10 preguntas sobre las asignaturas del curso.
*
* @author Sergio García Domínguez
*/

public class Ejercicio12 {
  public static void main (String[] args) {
    System.out.println("Minicuestionario sobre las asignaturas del curso:");

    String respuesta;
    int puntos = 0;

    System.out.print("\n1. ¿Cuántas asignaturas tenemos? ");
    respuesta = (System.console().readLine()).toLowerCase();

    if (respuesta.equals("6") || respuesta.equals("seis")) {
      puntos++;
    }

    System.out.print("\n2. ¿Luis nos enseña comandos de Linux? ");
    respuesta = (System.console().readLine()).toLowerCase();

    if (respuesta.equals("si") || respuesta.equals("sí")) {
      puntos++;
    }

    System.out.print("\n3. ¿Jesús nos da Sistemas informáticos? ");
    respuesta = (System.console().readLine()).toLowerCase();

    if (respuesta.equals("no")) {
      puntos++;
    }

    System.out.print("\n4. ¿Usaremos scratch en Entornos de Desarrollo? ");;
    respuesta = (System.console().readLine()).toLowerCase();

    if (respuesta.equals("si") || respuesta.equals("sí")) {
      puntos++;
    }

    System.out.print("\n5. ¿Daremos CSS en Lenguajes de Marcas? ");
    respuesta = (System.console().readLine()).toLowerCase();

    if (respuesta.equals("si") || respuesta.equals("sí")) {
      puntos++;
    }

    System.out.print("\n6. ¿En Sistemas Informáticos se hará algún trabajo el primer trimestre? ");
    respuesta = (System.console().readLine()).toLowerCase();

     if (respuesta.equals("si") || respuesta.equals("sí")) {
      puntos++;
    }

    System.out.print("\n7. ¿El lunes a primera hora tenemos Bases de Datos? ");
    respuesta = (System.console().readLine()).toLowerCase();

    if (respuesta.equals("no")) {
      puntos++;
    }

    System.out.print("\n8. ¿En programación empezamos con el lenguaje C++? ");
    respuesta = (System.console().readLine()).toLowerCase();

    if (respuesta.equals("no")) {
      puntos++;
    }

    System.out.print("\n9. ¿Luis nos recomienda usar el estándar de Google en Java? ");
    respuesta = (System.console().readLine()).toLowerCase();

    if (respuesta.equals("si") || respuesta.equals("sí")) {
      puntos++;
    }

    System.out.println("\n10. ¿Jesús es el sustituto de Eva? ");
    respuesta = (System.console().readLine()).toLowerCase();

    if (respuesta.equals("si") || respuesta.equals("sí")) {
      puntos++;
    }

    System.out.println("Has obtenido " + puntos + " puntos de 10.");
  }
}
