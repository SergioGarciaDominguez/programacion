/**
* Capítulo 4 - Ejercicio 24
*
* Pide el cargo, los días de viaje visitando clientes y el estado civil de un empleado; y genera la 
* nómina correspondiente.
*
* @author Sergio García Domínguez
*/

public class Ejercicio24 {
  public static void main (String[] args) {
    System.out.println("¿Cuál es el cargo del empleado? (escriba el número):\n"
        + "1. Prog. junior\n"
        + "2. Prog. senior\n"
        + "3. Jefe de proyecto");
    int cargo = Integer.parseInt(System.console().readLine());
    String cargoTexto = "";
    double sueldoBase = 0;
    
    switch (cargo) {
      case 1:
        cargoTexto = "Prog. junior";
        sueldoBase = 950;
        break;
      case 2:
        cargoTexto = "Prog. senior";
        sueldoBase = 1200;
        break;
      case 3:
        cargoTexto = "Jefe de proyecto";
        sueldoBase = 1600;
        break;
    }
    
    System.out.println("\n¿Cuántos días ha estado de viaje visitando clientes durante el mes?");
    int diasViaje = Integer.parseInt(System.console().readLine());
    double sueldoNeto;
    
    sueldoNeto = sueldoBase + 30 * diasViaje;
    
    System.out.println("\n¿Cuál es su estado civil? (escriba el número):\n"
        + "1. Soltero\n"
        + "2. Casado\n");
    int estadoCivil = Integer.parseInt(System.console().readLine());
    double nomina = 0;
    double irpf = 0;
    if (estadoCivil == 1) {
      irpf = 0.25;
      nomina = sueldoNeto * (1 - 0.25);
    } else if (estadoCivil == 2) {
      irpf = 0.2;
      nomina = sueldoNeto * (1 - 0.2);
    }
    
    System.out.printf("\n"
        + "Salario base %-16s  %.2f€\n"
        + "Viajes (%d días)                  %.2f€\n"
        + "Salario neto                      %.2f€\n"
        + "Descuento por IRPF (%2.0f%1s)        %.2f€\n"
        + "Salario nómina                   %.2f€\n",
        "(" + cargoTexto + ")", sueldoBase,
        diasViaje, (double)(30 * diasViaje),
        sueldoNeto, 
        irpf * 100, "%", - irpf * sueldoNeto,
        nomina);
  }
}
