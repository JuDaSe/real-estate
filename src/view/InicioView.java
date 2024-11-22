
package view;

import Controllers.Images;

public class InicioView extends javax.swing.JFrame {

    public InicioView() {
        initComponents();
         Images imagenInitApp = new Images(photoLabelViewInicio, "/view/images/fototecho.png", (photoLabelViewInicio.getWidth()), photoLabelViewInicio.getHeight());
        
        
        
        
       /* 
        message_btn.setOpaque(false);
        message_btn.setBorderPainted(false);
        message_btn.setContentAreaFilled(false);
        
        propertySearch_btn.setOpaque(false);
        propertySearch_btn.setBorderPainted(false);
        propertySearch_btn.setContentAreaFilled(false);
        
        addProperty.setOpaque(false);
        addProperty.setBorderPainted(false);
        addProperty.setContentAreaFilled(false);
        
        analitic_btn.setOpaque(false);
        analitic_btn.setBorderPainted(false);
        analitic_btn.setContentAreaFilled(false);
        
        configuration_btn.setOpaque(false);
        configuration_btn.setBorderPainted(false);
        configuration_btn.setContentAreaFilled(false); */
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        back_btn = new javax.swing.JButton();
        configuration_btn = new javax.swing.JButton();
        analitic_btn = new javax.swing.JButton();
        message_btn = new javax.swing.JButton();
        propertySearch_btn = new javax.swing.JButton();
        addProperty = new javax.swing.JButton();
        sayHiAdmin = new javax.swing.JLabel();
        textInit = new javax.swing.JLabel();
        photoLabelViewInicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.GreyInline"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back_btn.setBackground(new java.awt.Color(153, 153, 153));
        back_btn.setFont(new java.awt.Font("Graphik Regular", 0, 14)); // NOI18N
        back_btn.setText("Volver");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        jPanel1.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        configuration_btn.setBackground(new java.awt.Color(153, 153, 153));
        configuration_btn.setFont(new java.awt.Font("Graphik Regular", 0, 18)); // NOI18N
        configuration_btn.setText("Administrar");
        configuration_btn.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        configuration_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configuration_btnActionPerformed(evt);
            }
        });
        jPanel1.add(configuration_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 190, 50));

        analitic_btn.setBackground(new java.awt.Color(153, 153, 153));
        analitic_btn.setFont(new java.awt.Font("Graphik Regular", 0, 18)); // NOI18N
        analitic_btn.setText("Estadisticas");
        analitic_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        analitic_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analitic_btnActionPerformed(evt);
            }
        });
        jPanel1.add(analitic_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 190, 50));

        message_btn.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        message_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/sobre.png"))); // NOI18N
        message_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        message_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                message_btnActionPerformed(evt);
            }
        });
        jPanel1.add(message_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 60, -1));

        propertySearch_btn.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        propertySearch_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/busqueda.png"))); // NOI18N
        propertySearch_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        propertySearch_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propertySearch_btnActionPerformed(evt);
            }
        });
        jPanel1.add(propertySearch_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        addProperty.setBackground(new java.awt.Color(153, 153, 153));
        addProperty.setFont(new java.awt.Font("Graphik Regular", 0, 18)); // NOI18N
        addProperty.setText("Publicar");
        addProperty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPropertyActionPerformed(evt);
            }
        });
        jPanel1.add(addProperty, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 190, 50));

        sayHiAdmin.setFont(new java.awt.Font("Graphik Regular", 0, 48)); // NOI18N
        sayHiAdmin.setText("¡HOLA!");
        jPanel1.add(sayHiAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        textInit.setFont(new java.awt.Font("Graphik Regular", 0, 18)); // NOI18N
        textInit.setText("Administra tus clientes de la manera más comoda.");
        jPanel1.add(textInit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        photoLabelViewInicio.setAlignmentY(0.2F);
        jPanel1.add(photoLabelViewInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void message_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_message_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_message_btnActionPerformed

    private void analitic_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analitic_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_analitic_btnActionPerformed

    private void addPropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPropertyActionPerformed
        AddPropertyView ventanaPropiedades = new AddPropertyView();
        dispose();
        ventanaPropiedades.setVisible(true);
    }//GEN-LAST:event_addPropertyActionPerformed

    private void propertySearch_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propertySearch_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_propertySearch_btnActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        this.dispose();
        LoginView ventana = new LoginView();
        ventana.setVisible(true);
    }//GEN-LAST:event_back_btnActionPerformed

    private void configuration_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configuration_btnActionPerformed
        this.dispose();
        Administrar ventana = new Administrar();
        ventana.setSize(700, 600);
        ventana.setVisible(true);
    }//GEN-LAST:event_configuration_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProperty;
    private javax.swing.JButton analitic_btn;
    private javax.swing.JButton back_btn;
    private javax.swing.JButton configuration_btn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton message_btn;
    private javax.swing.JLabel photoLabelViewInicio;
    private javax.swing.JButton propertySearch_btn;
    private javax.swing.JLabel sayHiAdmin;
    private javax.swing.JLabel textInit;
    // End of variables declaration//GEN-END:variables
}
