/**
* Capítulo 6 - Ejercicio 16
*
* Realiza un simulador de máquina tragaperras simplificada que cumple los siguientes requisitos:
*   a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5 figuras posibles:
*   corazón, diamante, herradura, campana y limón.
*   b) Si las tres figuras son diferentes el jugador pierde.
*   c) Si hay dos figuras iguales y una diferente el jugador recupera su moneda.
*   d) Si las tres figuras son iguales el jugador gana 10 monedas.
* 
* @author Sergio García Domínguez
*/

public class Ejercicio16 {
  public static void main (String[] args) {
    String figura;
    String primeraFigura = "";
    String segundaFigura = "";
    String terceraFigura = "";
    int tiradasRestantes = 1;
    
    do {
      for (int i = 1; i <= 3; i++) {
        figura =  String.valueOf((int)(Math.random() * 5 + 1));
          
        switch (figura) {
          case "1":
            figura = "corazón";
            break;
          case "2":
            figura = "diamante";
            break;
          case "3":
            figura = "herradura";
            break;
          case "4":
            figura = "campana";
            break;
          case "5":
            figura = "limón";
            break;
        }
        
        switch (i) {
          case 1:
            primeraFigura = figura;
            break;
          case 2:
            segundaFigura = figura;
            break;
          case 3:
            terceraFigura = figura;
            break;
        }
      }
      
      System.out.printf("\nTirada: |%9s|%9s|%9s|  . ", primeraFigura, segundaFigura, 
          terceraFigura);
      
      tiradasRestantes--;
      
      if (primeraFigura == segundaFigura && primeraFigura == terceraFigura) {
        tiradasRestantes += 10;
        System.out.println("Ha ganado 10 monedas.");
        
      } else if ((primeraFigura == segundaFigura) || (primeraFigura == terceraFigura)
          || (segundaFigura == terceraFigura)) {
            
        tiradasRestantes += 1;
        System.out.println("Ha recuperado su moneda.");
        
      } else {
        System.out.print("Ha gastado una moneda. ");
        if (tiradasRestantes <= 0) {
          System.out.print("Ya no le quedan monedas.");
        }
        System.out.print("\n");
      }
      
    } while (tiradasRestantes > 0);
  }
}
