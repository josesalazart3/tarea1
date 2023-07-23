/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package umg.tarea1;

/**
 *
 * @author josesalazar
 */
import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) {
            
            System.out.println("1. Calcular velocidad promedio");
            System.out.println("2. Ingresar datos de otro vehículo");
            System.out.println("3. Salir");
            System.out.print("Ingresa una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    VelocidadProm();
                    break;
                case 2:
                    ingresarDatosVehiculo();
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo nuevamente.");
            }
        }

        scanner.close();
    }
    public static void VelocidadProm() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa el número de vueltas recorridas: ");
    int vueltas = scanner.nextInt();

    System.out.print("Ingresa el tiempo total transcurrido (en segundos): ");
    double tiempoTotal = scanner.nextDouble();

    double velocidadProm = vueltas / (tiempoTotal / 3600.0); // Convertir segundos a horas

    System.out.println("La velocidad promedio del vehículo fue: " + velocidadProm + " km/h");
}

    
public static void ingresarDatosVehiculo() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa el nombre del vehículo: ");
    String nombreVehiculo = scanner.nextLine();

    int vueltas = 0;
    double tiempoTotal = 0;

    System.out.println("Ingresa los tiempos de cada vuelta (en segundos).");
    int vueltaActual = 1;

    while (true) {
        System.out.print("Tiempo de vuelta " + vueltaActual + " (o -1 para terminar): ");
        double tiempoVuelta = scanner.nextDouble();

        if (tiempoVuelta == -1) {
            break;
        }

        vueltas++;
        tiempoTotal += tiempoVuelta;
        vueltaActual++;
    }

    double velocidadPromedio = vueltas / (tiempoTotal / 3600.0); // Convertir segundos a horas

    System.out.println("La velocidad promedio del vehículo " + nombreVehiculo + " fue: " + velocidadPromedio + " km/h");
}

}
