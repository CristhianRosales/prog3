import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehiculo {

    private String placa;
    private String tipo;
    private String IngresoP;
    private String SalidaP;

    public Vehiculo(String placa, String tipo, String IngresoP) {
        this.placa = placa;
        this.tipo = tipo;
        this.IngresoP = IngresoP;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getingresoP() {
        return IngresoP;
    }

    public void setingresoP(String IngresoP) {
        this.IngresoP = IngresoP;
    }

    public String getsalidaP() {
        return SalidaP;
    }

    public void setsalidaP(String SalidaP) {
        this.SalidaP = SalidaP;
    }

    double calcular() {
        int time_m = mtdtime_m();
        switch (tipo) {
            case "opcion1":
                return time_m * 0.60;
            case "opcion 2":
                return time_m * 0.30;
            case "opcion 3":
                return time_m * 0.20;
            default:
                return 0.0;
        }

    }

    public int mtdtime_m() {
        try {
            SimpleDateFormat horaf = new SimpleDateFormat("HH:mm:ss");
            Date IngresoPDate = horaf.parse(IngresoP);
            Date SalidaPDate = horaf.parse(SalidaP);
            long diferenciamls = SalidaPDate.getTime() - IngresoPDate.getTime();
            return (int) (diferenciamls / (3 * 1000));
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
