import java.util.Scanner;

public class Entrada {
    private static Scanner scanner = new Scanner(System.in);

    public static Estudiante ingresarEstudiante() {
        System.out.print("Ingrese su código: ");
        String codigo = scanner.next();
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.next();
        System.out.print("Ingrese su correo electrónico: ");
        String correo = scanner.next();
        System.out.print("Ingrese el semestre que desea cursar: ");
        int semestre = scanner.nextInt();

        return new Estudiante(codigo, nombre, correo, semestre);
    }

    public static String ingresarCodigoAsignatura() {
        System.out.print("Ingrese el código de la asignatura que desea tomar (o '0' para salir): ");
        return scanner.next();
    }
}
