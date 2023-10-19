import java.io.*;
import java.util.*;

public class Registro {
    private List<Asignatura> asignaturas;

    public Registro() {
        asignaturas = new ArrayList<>();
        cargarAsignaturasDesdeArchivo();
    }

    private void cargarAsignaturasDesdeArchivo() {
        try (Scanner scanner = new Scanner(new File("asignaturas.txt"))) {
            while (scanner.hasNextLine()) {
                String[] datosAsignatura = scanner.nextLine().split(",");
                Asignatura asignatura = new Asignatura(datosAsignatura[0], datosAsignatura[1],
                        Integer.parseInt(datosAsignatura[2]), Integer.parseInt(datosAsignatura[3]),
                        datosAsignatura[4]);
                asignaturas.add(asignatura);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo de asignaturas: " + e.getMessage());
        }
    }

    public void mostrarAsignaturasDisponibles(int semestre) {
        System.out.println("Asignaturas disponibles para el semestre " + semestre + ":");
        for (Asignatura asignatura : asignaturas) {
            if (asignatura.getSemestre() == semestre) {
                System.out.println(asignatura.getCodigo() + " - " + asignatura.getNombre() +
                        " - Créditos: " + asignatura.getCreditos() + " - Horario: " + asignatura.getHorario());
            }
        }
    }

    public boolean registrarAsignatura(Estudiante estudiante, String codigoAsignatura, Set<String> horariosRegistrados) {
        Optional<Asignatura> optionalAsignatura = asignaturas.stream()
                .filter(a -> a.getCodigo().equals(codigoAsignatura) && a.getSemestre() == estudiante.getSemestre())
                .findFirst();

        if (optionalAsignatura.isPresent()) {
            Asignatura asignaturaSeleccionada = optionalAsignatura.get();
            if (!horariosRegistrados.contains(asignaturaSeleccionada.getHorario())) {
                horariosRegistrados.add(asignaturaSeleccionada.getHorario());
                return true;
            }
        }
        return false;
    }

    public void generarReporte(List<Asignatura> materiasRegistradas) {
        System.out.println("\nReporte de materias registradas:");
        for (Asignatura asignatura : materiasRegistradas) {
            System.out.println(asignatura.getCodigo() + " - " + asignatura.getNombre() +
                    " - Créditos: " + asignatura.getCreditos() + " - Horario: " + asignatura.getHorario());
        }

        try (PrintWriter writer = new PrintWriter("reporte.txt")) {
            for (Asignatura asignatura : materiasRegistradas) {
                writer.println(asignatura.getCodigo() + " - " + asignatura.getNombre() +
                        " - Créditos: " + asignatura.getCreditos() + " - Horario: " + asignatura.getHorario());
            }
            System.out.println("Reporte escrito exitosamente en el archivo 'reporte.txt'.");
        } catch (FileNotFoundException e) {
            System.out.println("Error al escribir el archivo de reporte: " + e.getMessage());
        }
    }

    public void registrarAsignaturas(Estudiante estudiante) {
        Set<String> horariosRegistrados = new HashSet<>();
        List<Asignatura> materiasRegistradas = new ArrayList<>();
        int[] creditosRegistrados = { 0 };  // Array de un solo elemento para almacenar los créditos registrados

        Scanner input = new Scanner(System.in);
        while (creditosRegistrados[0] < 16) {
            mostrarAsignaturasDisponibles(estudiante.getSemestre());
            System.out.print("Ingrese el código de la asignatura que desea tomar (o '0' para salir): ");
            String codigoAsignatura = input.next();

            if (codigoAsignatura.equals("0")) {
                break;
            }

            Optional<Asignatura> optionalAsignatura = asignaturas.stream()
                    .filter(a -> a.getCodigo().equals(codigoAsignatura) && a.getSemestre() == estudiante.getSemestre())
                    .findFirst();

            optionalAsignatura.ifPresent(asignatura -> {
                if (!horariosRegistrados.contains(asignatura.getHorario())) {
                    horariosRegistrados.add(asignatura.getHorario());
                    creditosRegistrados[0] += asignatura.getCreditos();
                    materiasRegistradas.add(asignatura);
                    System.out.println("Asignatura registrada exitosamente.");
                } else {
                    System.out.println("No se puede registrar la asignatura debido a conflictos de horario.");
                }
            });
        }

        generarReporte(materiasRegistradas);
    }
}
