import java.util.Scanner;

/**
 *
 * @author Sergio García Domínguez
 */
public class PruebaVehiculo {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("VEHÍCULOS");
    System.out.println("=========");
    System.out.println("1. Anda con la bicicleta");
    System.out.println("2. Haz el caballito con la bicicleta");
    System.out.println("3. Anda con el coche");
    System.out.println("4. Quema rueda con el coche");
    System.out.println("5. Ver kilometraje de la bicicleta");
    System.out.println("6. Ver kilometraje del coche");
    System.out.println("7. Ver kilometraje total");
    System.out.println("8. Salir");
    System.out.print("Elige una opción (1-8): ");
    int opcion = Integer.parseInt(s.nextLine());
    Bicicleta miBici = new Bicicleta();
    Coche miCoche = new Coche();
    
    switch (opcion) {
      case 1:
        miBici.andar();
        break;
      case 2:
        miBici.hacerElCaballito();
        break;
      case 3:
        miCoche.andar();
        break;
      case 4:
        miCoche.quemarRueda();
        break;
      case 5:
        System.out.print(miBici.obtieneKilometraje());
        break;
      case 6:
        System.out.print(miCoche.obtieneKilometraje());
        break;
      case 7:
        System.out.print(vehiculo.obtieneKilometraje());
        break;
      case 8:
        
        break; 
    }
    
  }
}
