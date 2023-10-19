public class Lab0301 {
    public static void main(String[] args) {
        String currentDirectory = System.getProperty("user.dir");
        System.out.println("Directorio actual: " + currentDirectory);
        Registro registro = new Registro();
        Estudiante estudiante = Entrada.ingresarEstudiante();
        registro.registrarAsignaturas(estudiante);
    }
}
