
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LecturaDatos {
    private List<Municipio> municipios;

    public LecturaDatos() {
        municipios = new ArrayList<>();
        cargarMunicipiosDesdeArchivo();
    }

    private void cargarMunicipiosDesdeArchivo() {
        try (Scanner scanner = new Scanner(new File("municipios.csv"))) {
            while (scanner.hasNextLine()) {
                String[] datosMunicipio = scanner.nextLine().split(",");
                Municipio municipio = new Municipio(datosMunicipio[0], Integer.parseInt(datosMunicipio[1]), datosMunicipio[2], Double.parseDouble(datosMunicipio[3]), datosMunicipio[4]);
                municipios.add(municipio);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo de municipios: " + e.getMessage());
        }
    }

}
