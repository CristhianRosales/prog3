
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


public class Cambios {
    public static void semaforoRojo(javax.swing.JLabel jLabel, ImageIcon rojo) {
        jLabel.setIcon(rojo);
    }

    public static void semaforoAmarillo(javax.swing.JLabel jLabel, ImageIcon amarillo) {
        jLabel.setIcon(amarillo);
    }

    public static void semaforoVerde(javax.swing.JLabel jLabel, ImageIcon verde) {
        jLabel.setIcon(verde);
    }
}
