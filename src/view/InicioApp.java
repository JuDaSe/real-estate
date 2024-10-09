
package view;

import Controllers.Images;

/**
 *
 * @author Juan
 */
public class InicioApp extends javax.swing.JFrame {

    /**
     * Creates new form InicioApp
     */
    public InicioApp() {
        initComponents();
         Images imagenInitApp = new Images(label_ImagenInicio, "/view/images/Logo.png", (label_ImagenInicio.getWidth()), label_ImagenInicio.getHeight());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label_ImagenInicio = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        configuration_btn = new javax.swing.JButton();
        analitic_btn = new javax.swing.JButton();
        message_btn = new javax.swing.JButton();
        propertySearch_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        menuBaR = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuAgregar = new javax.swing.JMenu();
        menuBuscar_Terreno = new javax.swing.JMenu();
        menuAgregar_Casa = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        menuAgregar_Apartamento = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.GreyInline"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_ImagenInicio.setText("Imagen_Inicio");
        jPanel1.add(label_ImagenInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 590, 290));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 840, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Bienvenido \"Nombre usuario\"");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 380, 30));

        configuration_btn.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        configuration_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/ajustes.png"))); // NOI18N
        configuration_btn.setText("Configuración");
        configuration_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(configuration_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        analitic_btn.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        analitic_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan\\Documents\\NetBeansProjects\\InmobiliariaN\\src\\view\\images\\grafico-histograma.png")); // NOI18N
        analitic_btn.setText("Analisis");
        analitic_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        analitic_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analitic_btnActionPerformed(evt);
            }
        });
        jPanel1.add(analitic_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        message_btn.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        message_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/sobre.png"))); // NOI18N
        message_btn.setText("Mensajes");
        message_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        message_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                message_btnActionPerformed(evt);
            }
        });
        jPanel1.add(message_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        propertySearch_btn.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        propertySearch_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/busqueda.png"))); // NOI18N
        propertySearch_btn.setText("Buscar Propiedad");
        propertySearch_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        propertySearch_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propertySearch_btnActionPerformed(evt);
            }
        });
        jPanel1.add(propertySearch_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Panel Admin");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jMenu1.setText("Inicio");

        menuAgregar.setText("Buscar");

        menuBuscar_Terreno.setText("Propiedad");
        menuBuscar_Terreno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuAgregar.add(menuBuscar_Terreno);
        menuBuscar_Terreno.getAccessibleContext().setAccessibleParent(this);

        jMenu1.add(menuAgregar);

        menuAgregar_Casa.setText("Agregar");

        jMenu4.setText("Terreno");
        menuAgregar_Casa.add(jMenu4);

        jMenu5.setText("Casa");
        menuAgregar_Casa.add(jMenu5);

        menuAgregar_Apartamento.setText("Apartamento");
        menuAgregar_Casa.add(menuAgregar_Apartamento);

        jMenu1.add(menuAgregar_Casa);

        menuBaR.add(jMenu1);

        setJMenuBar(menuBaR);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void message_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_message_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_message_btnActionPerformed

    private void propertySearch_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propertySearch_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_propertySearch_btnActionPerformed

    private void analitic_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analitic_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_analitic_btnActionPerformed

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
            java.util.logging.Logger.getLogger(InicioApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton analitic_btn;
    private javax.swing.JButton configuration_btn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_ImagenInicio;
    private javax.swing.JMenu menuAgregar;
    private javax.swing.JMenu menuAgregar_Apartamento;
    private javax.swing.JMenu menuAgregar_Casa;
    private javax.swing.JMenuBar menuBaR;
    private javax.swing.JMenu menuBuscar_Terreno;
    private javax.swing.JButton message_btn;
    private javax.swing.JButton propertySearch_btn;
    // End of variables declaration//GEN-END:variables
}