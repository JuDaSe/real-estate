package view;



import Controllers.ImagenPantallaCompleta;
import Controllers.LoginController;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import models.LoginModel;
import view.LoginView;

/**
 *
 * @author Juan
 */
public class Panel extends javax.swing.JFrame {

    
    public Panel() {
        initComponents();
/*         ImagenPantallaCompleta imagenPantallaCompleta = new ImagenPantallaCompleta();
        
        BufferedImage imagenRedimensionada = imagenPantallaCompleta.cargarYRedimensionarImagen();
        
       
        if (imagenRedimensionada != null) {
            System.out.println("Imagen redimensionada cargada exitosamente.");
        } else {
            System.err.println("No se pudo redimensionar la imagen.");
        }      
    if (imagenRedimensionada != null) {
        Images imagenFondo = new Images(photoEntryPanel, "view/images/imageSlide/")
        frame.setSize(imagenRedimensionada.getWidth(), imagenRedimensionada.getHeight());

        JLabel label = new JLabel(new ImageIcon(imagenRedimensionada));
        frame.add(label);

        frame.setVisible(true);
    }
        
        */
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loginClientPanel = new javax.swing.JToggleButton();
        loginViewPanel = new javax.swing.JToggleButton();
        photoEntryPanel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        nombreEmpresa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(18, 115, 105));
        setMaximumSize(new java.awt.Dimension(690, 422));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 248, 242));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginClientPanel.setBackground(new java.awt.Color(153, 153, 153));
        loginClientPanel.setFont(new java.awt.Font("Source Sans Pro ExtraLight", 1, 18)); // NOI18N
        loginClientPanel.setText("Buscar");
        loginClientPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginClientPanelActionPerformed(evt);
            }
        });
        jPanel1.add(loginClientPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 160, 40));

        loginViewPanel.setBackground(new java.awt.Color(153, 153, 153));
        loginViewPanel.setFont(new java.awt.Font("Source Sans Pro ExtraLight", 1, 18)); // NOI18N
        loginViewPanel.setText("Loguearse");
        loginViewPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginViewPanelActionPerformed(evt);
            }
        });
        jPanel1.add(loginViewPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 160, 40));
        jPanel1.add(photoEntryPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 420));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setToolTipText("");
        jSeparator1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 220, 2));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setToolTipText("");
        jSeparator2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 93, 220, 2));

        nombreEmpresa.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 48)); // NOI18N
        nombreEmpresa.setText("INMOBIL");
        jPanel1.add(nombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginViewPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginViewPanelActionPerformed
        this.dispose();
        LoginView login = new LoginView();
        
        LoginModel model = new LoginModel();
        
        new LoginController(model, login);
        login.setVisible(true);
    }//GEN-LAST:event_loginViewPanelActionPerformed

    private void loginClientPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginClientPanelActionPerformed
        UsuarioVista vistaUsuario = new UsuarioVista();
        vistaUsuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginClientPanelActionPerformed

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
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JToggleButton loginClientPanel;
    private javax.swing.JToggleButton loginViewPanel;
    private javax.swing.JLabel nombreEmpresa;
    private javax.swing.JLabel photoEntryPanel;
    // End of variables declaration//GEN-END:variables
}
