
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
    
    public int[] municipiosPorRegion(){
        int mpr[] = new int [6];
        int i=0;
        while (i<municipios.size()){
            Municipio temp = municipios.get(i);
            switch (temp.region){
                case "Llano":   mpr[0]+=1;
                                break;
                case "Pacifico":    mpr[1]+=1;
                                    break;
                case "Eje Cafetero - Antioquia":    mpr[2]+=1;
                                                    break;
                case "Centro Oriente":  mpr[3]+=1;
                                        break;
                case "Centro Sur":  mpr[4]+=1;
                                    break;
                case "Caribe":  mpr[5]+=1;
                                break;
                default:    System.out.println("Error: La region "+temp.region+" no esta dentro de las posibles.");
                            break;
            }
            i++;
        }
        return mpr;
    }
    
}
