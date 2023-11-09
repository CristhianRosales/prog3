
import java.awt.Image;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Timer;

public class Main extends javax.swing.JFrame {

    ImageIcon imageIcon1 = new ImageIcon(new ImageIcon("carro1.png").getImage().getScaledInstance(173, 62, Image.SCALE_DEFAULT));
    ImageIcon imageIcon2 = new ImageIcon(new ImageIcon("carro2.png").getImage().getScaledInstance(173, 62, Image.SCALE_DEFAULT));
    ImageIcon imageIcon3 = new ImageIcon(new ImageIcon("carro3.png").getImage().getScaledInstance(173, 62, Image.SCALE_DEFAULT));
    ImageIcon imageIcon4 = new ImageIcon(new ImageIcon("carro4.png").getImage().getScaledInstance(173, 62, Image.SCALE_DEFAULT));
    ImageIcon imageIcon5 = new ImageIcon(new ImageIcon("carro5.png").getImage().getScaledInstance(173, 62, Image.SCALE_DEFAULT));
    ImageIcon imageIcon6 = new ImageIcon(new ImageIcon("carro6.png").getImage().getScaledInstance(173, 62, Image.SCALE_DEFAULT));
    ImageIcon imageIcon7 = new ImageIcon(new ImageIcon("carro7.png").getImage().getScaledInstance(173, 62, Image.SCALE_DEFAULT));
    ImageIcon imageIcon8 = new ImageIcon(new ImageIcon("carro8.png").getImage().getScaledInstance(173, 62, Image.SCALE_DEFAULT));
    ImageIcon imageIcon9 = new ImageIcon(new ImageIcon("carro9.png").getImage().getScaledInstance(173, 62, Image.SCALE_DEFAULT));
    
    boolean gano=false;
    boolean corriendo=false;
    
    public Main() {
        initComponents();
    }
    
    public void avanzarCarro1(javax.swing.JLabel jLabel, String color){
        int x = jLabel.getLocation().x;
        int y = jLabel.getY();
        int a = (int) (Math.random() * 10) + 1;
        a += x;
        while (x<a){
            if(x<1120){
                x++;
                jLabel.setLocation(x, y); 
            }
            else {
                JFrame ganador = new JFrame();
                gano=true;
                JOptionPane.showMessageDialog(ganador, "El carro "+color+" ha ganado");
                break;
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 815));
        setResizable(false);

        jLabel1.setIcon(imageIcon1);

        jLabel2.setIcon(imageIcon2);

        jLabel3.setIcon(imageIcon3);

        jLabel4.setIcon(imageIcon4);

        jLabel5.setIcon(imageIcon5);

        jLabel6.setIcon(imageIcon6);

        jLabel7.setIcon(imageIcon7);

        jLabel8.setIcon(imageIcon8);

        jLabel9.setIcon(imageIcon9);

        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void llamado(){
        Thread t1 = new Thread() {
            @Override
            public void run() {
                avanzarCarro1(jLabel1, "azul");
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                avanzarCarro1(jLabel2, "rojo");
            }
        };
        Thread t3 = new Thread() {
            @Override
            public void run() {
                avanzarCarro1(jLabel3, "naranja");
            }
        };
        Thread t4 = new Thread() {
            @Override
            public void run() {
                avanzarCarro1(jLabel4, "verde");
            }
        };
        Thread t5 = new Thread() {
            @Override
            public void run() {
                avanzarCarro1(jLabel5, "amarillo");
            }
        };
        Thread t6 = new Thread() {
            @Override
            public void run() {
                avanzarCarro1(jLabel6, "aguamarina");
            }
        };
        Thread t7 = new Thread() {
            @Override
            public void run() {
                avanzarCarro1(jLabel7, "fucsia");
            }
        };
        Thread t8 = new Thread() {
            @Override
            public void run() {
                avanzarCarro1(jLabel8, "gris");
            }
        };
        Thread t9 = new Thread() {
            @Override
            public void run() {
                avanzarCarro1(jLabel9, "salmon");
            }
        };
        if(!gano){
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();
            t6.start();
            t7.start();
            t8.start();
            t9.start();
        }
    }
    
    public void reiniciar(javax.swing.JLabel jLabel){
        int y=jLabel.getY();
        jLabel.setLocation(51, y);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setText("Iniciar");
        TimerTask timertask = new TimerTask() {
            @Override
            public void run() {
                llamado();
                System.out.println("llamado");
            }
        };
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(timertask, 0, 30);
        if(gano){
            timer.cancel();
        }
        if(corriendo){
            System.out.println("reinicia");
            jButton1.setText("Reiniciar");
            timer.cancel();
            reiniciar(jLabel1);
            reiniciar(jLabel2);
            reiniciar(jLabel3);
            reiniciar(jLabel4);
            reiniciar(jLabel5);
            reiniciar(jLabel6);
            reiniciar(jLabel7);
            reiniciar(jLabel8);
            reiniciar(jLabel9);
            corriendo = false;
            gano = false;
        }
        else {
            corriendo=true;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
