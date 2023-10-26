
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LecturaDatos {
    private List<Municipio> municipios;
    List<String> regiones = new ArrayList<>();

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
        int mpr[] = new int [regiones.size()];
        int i=0;
        while (i<municipios.size()){
            Municipio temp = municipios.get(i);
            
            switch (temp.region){
                case "Eje Cafetero - Antioquia":    mpr[0]+=1;
                                                    break;
                case "Centro Oriente":  mpr[1]+=1;
                                        break;
                case "Caribe":  mpr[2]+=1;
                                break;
                case "Pacifico":    mpr[3]+=1;
                                    break;
                case "Llano":   mpr[4]+=1;
                                break;
                case "Centro Sur":  mpr[5]+=1;
                                    break;
                default:    System.out.println("Error: La region "+temp.region+" no esta dentro de las posibles.");
                            break;
            }
            i++;
        }
        return mpr;
    }
    
    public List<String> regiones(){
        
        int i=0;
        
        while (i<municipios.size()){
            Municipio temp = municipios.get(i);
            boolean regionregistrada = false;
            int j=0;
            while (j < regiones.size()) {
                if(temp.region.equals(regiones.get(j))){
                    regionregistrada = true; 
                }
                j++;
            }
            if (!regionregistrada) {
                regiones.add(temp.region);
            }
            i++;
        }
        
        return regiones;
    }
    
}
