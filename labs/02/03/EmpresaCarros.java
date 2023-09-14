import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Estudiante
 */
public class EmpresaCarros extends javax.swing.JFrame {
    int i=0;
    DefaultTableModel modelotabla;
   
    public class Carros{
        String marca;
        int modelo;
        String color;
        int kilometraje;

        public Carros(String marca, int modelo, String color, int kilometraje){
            this.marca=marca;
            this.modelo=modelo;
            this.color=color;
            this.kilometraje=kilometraje;
        }
        
        public int getModelo() {
            return modelo;
        }
        public int getKilometraje() {
            return kilometraje;
        }
        public String getMarca() {
            return marca;
        }
        public String getColor() {
            return color;
        }
    }
    
    Carros[] carritos = new Carros[100];
    
    public EmpresaCarros() {
        initComponents();
        modelotabla= new DefaultTableModel();
        modelotabla.addColumn("Marca");
        modelotabla.addColumn("Modelo");
        modelotabla.addColumn("Color");
        modelotabla.addColumn("Kilometraje");
        this.tabla.setModel(modelotabla);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textomarca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textocolor = new javax.swing.JTextField();
        textokilometraje = new javax.swing.JTextField();
        textomodelo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        borrar = new javax.swing.JButton();
        borrartodo = new javax.swing.JButton();
        ordenarmodelo = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        ordenarkilometraje = new javax.swing.JButton();

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("MODELO:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(212, 241, 185));
        setBounds(new java.awt.Rectangle(100, 100, 2000, 2000));
        setName("Interfaz Venta de carros usados"); // NOI18N
        setPreferredSize(new java.awt.Dimension(580, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("VENTA DE CARROS USADOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 32, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("MARCA:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 113, -1, -1));

        textomarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textomarcaActionPerformed(evt);
            }
        });
        getContentPane().add(textomarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 113, 129, 32));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("COLOR:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 213, -1, -1));
        getContentPane().add(textocolor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 129, 32));

        textokilometraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textokilometrajeActionPerformed(evt);
            }
        });
        getContentPane().add(textokilometraje, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 129, 32));
        getContentPane().add(textomodelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 129, 32));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("KILOMETRAJE:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 263, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("MODELO:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 163, -1, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 395, -1, 353));

        borrar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        borrar.setText("BORRAR");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        getContentPane().add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 191, 137, 40));

        borrartodo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        borrartodo.setText("BORRAR TABLA");
        borrartodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrartodoActionPerformed(evt);
            }
        });
        getContentPane().add(borrartodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 243, -1, 40));

        ordenarmodelo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        ordenarmodelo.setText("ORDENAR POR \nMODELO");
        ordenarmodelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarmodeloActionPerformed(evt);
            }
        });
        getContentPane().add(ordenarmodelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 320, -1, 57));

        agregar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        agregar.setText("AGREGAR");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        getContentPane().add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 139, 137, 40));

        ordenarkilometraje.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        ordenarkilometraje.setText("ORDENAR POR KILOMETRAJE");
        ordenarkilometraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarkilometrajeActionPerformed(evt);
            }
        });
        getContentPane().add(ordenarkilometraje, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 320, -1, 57));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textokilometrajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textokilometrajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textokilometrajeActionPerformed

    private void textomarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textomarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textomarcaActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        String []info=new String[4];
        info[0]=textomarca.getText();
        info[1]=textomodelo.getText();
        info[2]=textocolor.getText();
        info[3]=textokilometraje.getText();
        modelotabla.addRow(info);
        
        carritos[i]=new Carros(textomarca.getText(), Integer.parseInt(textomodelo.getText()), textocolor.getText(), Integer.parseInt(textokilometraje.getText()));
        i++;
        
        textomarca.setText("");
        textomodelo.setText("");
        textocolor.setText("");
        textokilometraje.setText("");
    }//GEN-LAST:event_agregarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        textomarca.setText("");
        textomodelo.setText("");
        textocolor.setText("");
        textokilometraje.setText("");
    }//GEN-LAST:event_borrarActionPerformed

    private void borrartodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrartodoActionPerformed
        int fila=tabla.getRowCount();
        for(int x=fila-1;x>=0;x--){
            modelotabla.removeRow(x);
        }
    }//GEN-LAST:event_borrartodoActionPerformed

    private void ordenarmodeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarmodeloActionPerformed
        int fila=tabla.getRowCount();
        for (int x=fila-1; x>=0; x--){
            modelotabla.removeRow(x);
        }

        int[] modelos=new int[i];
        for (int x=0; x<modelos.length; x++){
            modelos[x]=carritos[x].getModelo();
        }

        for (int x=0; x<modelos.length-1; x++){
            for (int y=0; y<modelos.length-1-x; y++){
                if (modelos[y]>modelos[y+1]){
                    int temp=modelos[y];
                    modelos[y]=modelos[y+1];
                    modelos[y+1]=temp;
                }
            }
        }
        for (int x=0; x<modelos.length; x++){
            for (int y=0; y<modelos.length; y++){
                if (modelos[x]==carritos[y].getModelo()){
                    String[] info=new String[4];
                    info[0]=carritos[y].getMarca();
                    info[1]=String.valueOf(carritos[y].getModelo());
                    info[2]=carritos[y].getColor();
                    info[3]=String.valueOf(carritos[y].getKilometraje());
                    modelotabla.addRow(info);
                }
            }
        }
    }//GEN-LAST:event_ordenarmodeloActionPerformed

    private void ordenarkilometrajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarkilometrajeActionPerformed
        int fila = tabla.getRowCount();
        for (int x=fila-1; x>=0; x--){
            modelotabla.removeRow(x);
        }

        int[] kilometrajes = new int[i];
        for (int x=0; x<kilometrajes.length; x++){
            kilometrajes[x]=carritos[x].getKilometraje();
        }

        for (int x=0; x<kilometrajes.length-1; x++){
            for (int y=0; y<kilometrajes.length-1-x; y++){
                if (kilometrajes[y]>kilometrajes[y+1]){
                    int temp=kilometrajes[y];
                    kilometrajes[y]=kilometrajes[y + 1];
                    kilometrajes[y+1]=temp;
                }
            }
        }
        for (int x=0; x<kilometrajes.length; x++){
            for (int y=0; y<kilometrajes.length; y++){
                if (kilometrajes[x]==carritos[y].getKilometraje()){
                    String[] info=new String[4];
                    info[0]=carritos[y].getMarca();
                    info[1]=String.valueOf(carritos[y].getModelo());
                    info[2]=carritos[y].getColor();
                    info[3]=String.valueOf(carritos[y].getKilometraje());
                    modelotabla.addRow(info);
                }
            }
        }
    }//GEN-LAST:event_ordenarkilometrajeActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpresaCarros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton borrar;
    private javax.swing.JButton borrartodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton ordenarkilometraje;
    private javax.swing.JButton ordenarmodelo;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField textocolor;
    private javax.swing.JTextField textokilometraje;
    private javax.swing.JTextField textomarca;
    private javax.swing.JTextField textomodelo;
    // End of variables declaration//GEN-END:variables
}
