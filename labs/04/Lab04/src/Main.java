import java.awt.Image;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;


public class Main extends javax.swing.JFrame {
    ImageIcon rojo = new ImageIcon(new ImageIcon("src/semaforo/rojo.png").getImage().getScaledInstance(111, 181, Image.SCALE_DEFAULT));
    ImageIcon amarillo = new ImageIcon(new ImageIcon("src/semaforo/amarillo.png").getImage().getScaledInstance(111, 181, Image.SCALE_DEFAULT));
    ImageIcon verde = new ImageIcon(new ImageIcon("src/semaforo/verde.png").getImage().getScaledInstance(111, 181, Image.SCALE_DEFAULT));
    Timer timer = new Timer();
    int cambios=3;
    int trojo = 25000;
    
    ImageIcon img0 = new ImageIcon(new ImageIcon("src/persona/0.png").getImage().getScaledInstance(111, 219, Image.SCALE_DEFAULT));
    ImageIcon img1 = new ImageIcon(new ImageIcon("src/persona/1.png").getImage().getScaledInstance(111, 219, Image.SCALE_DEFAULT));
    ImageIcon img2 = new ImageIcon(new ImageIcon("src/persona/2.png").getImage().getScaledInstance(111, 219, Image.SCALE_DEFAULT));
    ImageIcon img3 = new ImageIcon(new ImageIcon("src/persona/3.png").getImage().getScaledInstance(111, 219, Image.SCALE_DEFAULT));
    ImageIcon img4 = new ImageIcon(new ImageIcon("src/persona/4.png").getImage().getScaledInstance(111, 219, Image.SCALE_DEFAULT));
    ImageIcon img5 = new ImageIcon(new ImageIcon("src/persona/5.png").getImage().getScaledInstance(111, 219, Image.SCALE_DEFAULT));
    ImageIcon img6 = new ImageIcon(new ImageIcon("src/persona/6.png").getImage().getScaledInstance(111, 219, Image.SCALE_DEFAULT));
    ImageIcon img7 = new ImageIcon(new ImageIcon("src/persona/7.png").getImage().getScaledInstance(111, 219, Image.SCALE_DEFAULT));
    ImageIcon[] imgs = {img0, img1, img2, img3, img4, img5, img6, img7};
    
    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jSlider2 = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setText("Trafico");

        jSlider2.setPaintLabels(true);
        jSlider2.setPaintTicks(true);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setText("Tiempo añadido: 0 segundos");

        jButton1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton1.setText("Prioridad Peatonal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\NetBeansProjects\\Lab04\\src\\semaforo\\rojo.png")); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\NetBeansProjects\\Lab04\\src\\persona\\0.png")); // NOI18N

        jButton2.setText("Iniciar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(281, 281, 281)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(29, 29, 29)
                                            .addComponent(jButton1))))))
                        .addContainerGap(80, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(70, 70, 70)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public float[] trafico (){
        float trafico = jSlider2.getValue();
        float mr, mv;
        mr = ((100 - trafico) * 2) / 100;
        mv = ((trafico) * 2) / 100;
        float[] m = {mr, mv};
        return m;
    }
    
    class Cambio extends TimerTask {
        ImageIcon color;
        Cambio(ImageIcon color){
            this.color=color;
            
        }
        public void run() {
            jLabel4.setIcon(color);
            cambios++;
        }
    }
    
    class CambioImg extends TimerTask {
        ImageIcon img;
        CambioImg(ImageIcon img){
            this.img=img;
            
        }
        public void run() {
            jLabel5.setIcon(img);
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        trojo=30000;
        jLabel2.setText("Tiempo añadido: 5 segundos");
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Thread t = new Thread() {
            @Override
            public void run() {
                int temp = 0;
                float[] mc=new float[2];
                while (true) {
                    mc=trafico();
                    if ((cambios % 3) == 0 & cambios != temp) {
                        int j=0;
                        int d=125;
                        int[] delaystemp = {trojo, 3000, 25000};
                        delaystemp[0]=Math.round(delaystemp[0]*mc[0]);
                        delaystemp[2]=Math.round(delaystemp[2]*mc[1]);
                        int[] delays = {delaystemp[0], delaystemp[0]+3000, delaystemp[0]+3000+delaystemp[2]};
                        int m=delays[0]/125;
                        for(int i=0;i<m;i++){
                            timer.schedule(new CambioImg(imgs[j]), d);
                            j++;
                            d+=125;
                            if(j>7){
                                j=0;
                            }
                            if(d>delays[0]){
                                d=125;
                            }
                        }
                        timer.schedule(new Cambio(amarillo), delays[0]);
                        if(trojo==30000){
                            trojo=25000;
                            jLabel2.setText("Tiempo añadido: 0 segundos");
                        }
                        timer.schedule(new Cambio(verde), delays[1]);
                        timer.schedule(new Cambio(rojo), delays[2]);
                        temp = cambios;
                    }
                    System.out.println(temp);
                }
            }
        };
        t.start();
        jButton2.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    // End of variables declaration//GEN-END:variables
}
