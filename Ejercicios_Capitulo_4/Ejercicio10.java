<<<<<<< HEAD
/**
* Capítulo 4 - Ejercicio 10
*
* Pide el día y el mes de nacimiento y te dice el horóscopo correspondiente
*
* @author Sergio García Domínguez
*/
 
public class Ejercicio10 {
  public static void main (String[] args) {
    System.out.print("Introduzca su día de nacimiento: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca su mes de nacimiento (con letras): ");
    String mes = (System.console().readLine()).toLowerCase();

    String horoscopo = "desconocido";
    
    switch (mes){
      case "enero":
        if (dia >= 1 && dia <= 20) {
          horoscopo = "Capricornio";
        } else if (dia > 20 && dia <= 31) {
          horoscopo = "Acuario";
        }
        break;
      case "febrero":
        if (dia >= 1 && dia <= 19) {
          horoscopo = "Acuario";
        } else if (dia >= 20 && dia <= 29) {
          horoscopo = "Piscis";
        }
        break;
      case "marzo":
        if (dia >= 1 && dia <= 20) {
          horoscopo = "Piscis";
        } else if (dia >= 21 && dia <= 31) {
          horoscopo = "Aries";
        }
        break;
      case "abril":
        if (dia >= 1 && dia <= 20) {
          horoscopo = "Aries";
        } else if (dia >= 21 && dia <= 30) {
          horoscopo = "Tauro";
        }
        break;
      case "mayo":
        if (dia >= 1 && dia <= 21) {
          horoscopo = "Tauro";
        } else if (dia >= 22 && dia <= 31) {
          horoscopo = "Géminis";
        }
        break;
      case "junio":
        if (dia >= 1 && dia <= 21) {
          horoscopo = "Géminis";
        } else if (dia >= 22 && dia <= 30) {
          horoscopo = "Cáncer";
        }
        break;
      case "julio":
        if (dia >= 1 && dia <= 22) {
          horoscopo = "Cáncer";
        } else if (dia >= 23 && dia <= 31) {
          horoscopo = "Leo";
        }
        break;
      case "agosto":
        if (dia >= 1 && dia <= 23) {
          horoscopo = "Leo";
        } else if (dia >= 24 && dia <= 31) {
          horoscopo = "Virgo";
        }
        break;
      case "septiembre":
        if (dia >= 1 && dia <= 23) {
          horoscopo = "Virgo";
        } else if (dia >= 24 && dia <= 30) {
          horoscopo = "Libra";
        }
        break;
      case "octubre":
        if (dia >= 1 && dia <= 23) {
          horoscopo = "Libra";
        } else if (dia >= 24 && dia <= 31) {
          horoscopo = "Escorpio";
        }
        break;
      case "noviembre":
        if (dia >= 1 && dia <= 22) {
          horoscopo = "Escorpio";
        } else if (dia >= 23 && dia <= 30) {
          horoscopo = "Sagitario";
        }
        break;
      case "diciembre":
        if (dia >= 1 && dia <= 22) {
          horoscopo = "Sagitario";
        } else if (dia >= 23 && dia <= 31) {
          horoscopo = "Capricornio";
        }
        break;
      default:
        mes = "incorrecto";
        break;
    }
    
    if (mes != "incorrecto" && horoscopo != "desconocido") {
      System.out.println("Su fecha de nacimiento es el " + dia + " de " + mes + ".\n"
          + "Su horóscopo es: " + horoscopo);
      
    } else {
      System.out.println("Ha introducido una fecha incorrecta.");
    }
  }
}
=======
/**
* Capítulo 4 - Ejercicio 10
*
* Pide el día y el mes de nacimiento y te dice el horóscopo correspondiente
*
* @author Sergio García Domínguez
*/
 
public class Ejercicio10 {
  public static void main (String[] args) {
    System.out.print("Introduzca su día de nacimiento: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca su mes de nacimiento (con letras): ");
    String mes = (System.console().readLine()).toLowerCase();

    String horoscopo = "desconocido";
    
    switch (mes){
      case "enero":
        if (dia >= 1 && dia <= 20) {
          horoscopo = "Capricornio";
        } else if (dia > 20 && dia <= 31) {
          horoscopo = "Acuario";
        }
        break;
      case "febrero":
        if (dia >= 1 && dia <= 19) {
          horoscopo = "Acuario";
        } else if (dia >= 20 && dia <= 29) {
          horoscopo = "Piscis";
        }
        break;
      case "marzo":
        if (dia >= 1 && dia <= 20) {
          horoscopo = "Piscis";
        } else if (dia >= 21 && dia <= 31) {
          horoscopo = "Aries";
        }
        break;
      case "abril":
        if (dia >= 1 && dia <= 20) {
          horoscopo = "Aries";
        } else if (dia >= 21 && dia <= 30) {
          horoscopo = "Tauro";
        }
        break;
      case "mayo":
        if (dia >= 1 && dia <= 21) {
          horoscopo = "Tauro";
        } else if (dia >= 22 && dia <= 31) {
          horoscopo = "Géminis";
        }
        break;
      case "junio":
        if (dia >= 1 && dia <= 21) {
          horoscopo = "Géminis";
        } else if (dia >= 22 && dia <= 30) {
          horoscopo = "Cáncer";
        }
        break;
      case "julio":
        if (dia >= 1 && dia <= 22) {
          horoscopo = "Cáncer";
        } else if (dia >= 23 && dia <= 31) {
          horoscopo = "Leo";
        }
        break;
      case "agosto":
        if (dia >= 1 && dia <= 23) {
          horoscopo = "Leo";
        } else if (dia >= 24 && dia <= 31) {
          horoscopo = "Virgo";
        }
        break;
      case "septiembre":
        if (dia >= 1 && dia <= 23) {
          horoscopo = "Virgo";
        } else if (dia >= 24 && dia <= 30) {
          horoscopo = "Libra";
        }
        break;
      case "octubre":
        if (dia >= 1 && dia <= 23) {
          horoscopo = "Libra";
        } else if (dia >= 24 && dia <= 31) {
          horoscopo = "Escorpio";
        }
        break;
      case "noviembre":
        if (dia >= 1 && dia <= 22) {
          horoscopo = "Escorpio";
        } else if (dia >= 23 && dia <= 30) {
          horoscopo = "Sagitario";
        }
        break;
      case "diciembre":
        if (dia >= 1 && dia <= 22) {
          horoscopo = "Sagitario";
        } else if (dia >= 23 && dia <= 31) {
          horoscopo = "Capricornio";
        }
        break;
      default:
        mes = "incorrecto";
        break;
    }
    
    if (mes != "incorrecto" && horoscopo != "desconocido") {
      System.out.println("Su fecha de nacimiento es el " + dia + " de " + mes + ".\n"
          + "Su horóscopo es: " + horoscopo);
      
    } else {
      System.out.println("Ha introducido una fecha incorrecta.");
    }
  }
}
>>>>>>> 530340828eb844188b0723543c83a26973aa8d3f
