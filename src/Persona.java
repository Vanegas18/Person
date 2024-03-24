import java.util.Scanner;

public class Persona {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la persona:");
        String nombrePersona = scanner.nextLine();

        System.out.println("Ingrese la edad de la persona:");
        int edadPersona = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese la dirección de la persona:");
        String direcciónPersona = scanner.nextLine();

        System.out.println("Ingrese el salario del empleado:");
        double salarioEmpleado = Double.parseDouble(scanner.nextLine());

        System.out.println("Ingrese el cargo del empleado:");
        String cargoEmpleado = scanner.nextLine();

        subclassTrabajo empleado1 = new subclassTrabajo(nombrePersona, edadPersona, direcciónPersona, salarioEmpleado, cargoEmpleado);

        System.out.println("Detalles del empleado:");
        empleado1.imprimirDetalles();

        scanner.close();
    }
}
