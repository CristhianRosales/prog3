import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Metodos {

    private final List<Vehiculo> listaCarros = new ArrayList<>();

    public static void main(String[] args) {
        new Lab0302().setVisible(true);
    }

    public void ingresocarro(String placa, String tipo, String IngresoP) {
        Vehiculo carro1 = new Vehiculo(placa, tipo, IngresoP);
        listaCarros.add(carro1);
    }

    public void salircarro(String vehiculosalir) {
        Iterator<Vehiculo> iter = listaCarros.iterator();
        while (iter.hasNext()) {
            Vehiculo carro1 = iter.next();
            if (carro1.getPlaca().equals(vehiculosalir)) {
                iter.remove();
            }
        }
    }

    public String buscarvehiculo(String placabuscar) {
        for (Vehiculo carro1 : listaCarros) {
            if (carro1.getPlaca().equals(placabuscar)) {
                return carro1.toString();
            }

        }
        return "Vehiculo no encontrado en el registro.";
    }

    public List<Vehiculo> vehiculoxhoras(String inicio, String fin) {
        List<Vehiculo> carroe = new ArrayList<>();
        SimpleDateFormat horaf = new SimpleDateFormat("HH:mm:ss");
        try {
            Date horaInicioDate = horaf.parse(inicio);
            Date horaFinDate = horaf.parse(fin);
            for (Vehiculo carro1 : listaCarros) {
                Date horaIngresoDate = horaf.parse(carro1.getingresoP());

                if (horaIngresoDate.after(horaInicioDate) && horaIngresoDate.before(horaFinDate)) {
                    carroe.add(carro1);
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return carroe;
    }

    public double Pago() {
        double a_pagar = 0.0;

        for (Vehiculo carro1 : listaCarros) {
            a_pagar = a_pagar + carro1.calcular();
        }
        return a_pagar;
    }

    public int catidadcarros() {
        return listaCarros.size();
    }

}
