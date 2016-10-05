/**
* Capítulo 3 - Ejercicio 08
*
* Calcula el salario semanal en base a las horas trabajadas, a razón de 12€ la hora
*
* @author Sergio García Domínguez
*/

public class Ejercicio08 {
  public static void main(String[] args) {
    System.out.print("Introduzca las horas semanales trabajadas: ");
    double horasTrabajadas = Double.parseDouble(System.console().readLine());
    
    System.out.printf("Salario por hora: 12€\nSalario semanal: %.2f€\n", (horasTrabajadas * 12));
  }
}
