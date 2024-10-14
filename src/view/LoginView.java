
package view;

import Controllers.Images;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import models.UserModel;

public class LoginView extends javax.swing.JFrame {

    public LoginView() {
        initComponents();
        iAmGuest_btn.setOpaque(true);
        Images imagenLogin = new Images(etiquetaImagen_Login, "/view/images/imgLogin.png", (etiquetaImagen_Login.getWidth()), etiquetaImagen_Login.getHeight());
        
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
        LoginBtn = new javax.swing.JButton();
        textFieldPassword = new javax.swing.JTextField();
        textFieldEmail = new javax.swing.JTextField();
        etiquetaImagen_Login = new javax.swing.JLabel();
        rememberMe = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        iAmGuest_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginBtn.setText("Iniciar Sesión");
        jPanel1.add(LoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 300, -1));

        textFieldPassword.setBackground(new java.awt.Color(0, 102, 153));
        textFieldPassword.setToolTipText("");
        textFieldPassword.setBorder(null);
        jPanel1.add(textFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 300, -1));

        textFieldEmail.setBackground(new java.awt.Color(0, 102, 153));
        textFieldEmail.setBorder(null);
        jPanel1.add(textFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 300, -1));

        etiquetaImagen_Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaImagen_Login.setText("loginImage");
        jPanel1.add(etiquetaImagen_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 430));

        rememberMe.setBackground(new java.awt.Color(0, 102, 153));
        rememberMe.setForeground(new java.awt.Color(255, 255, 255));
        rememberMe.setText("Recordarme");
        jPanel1.add(rememberMe, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 260, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 310, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 310, 10));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contraseña");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, -1, -1));

        iAmGuest_btn.setBackground(new java.awt.Color(0, 102, 153));
        iAmGuest_btn.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        iAmGuest_btn.setText("Entrar como Invitado");
        iAmGuest_btn.setBorder(null);
        iAmGuest_btn.setBorderPainted(false);
        iAmGuest_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iAmGuest_btnActionPerformed(evt);
            }
        });
        jPanel1.add(iAmGuest_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, -1, -1));

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

    private void iAmGuest_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iAmGuest_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iAmGuest_btnActionPerformed

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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }
    
    public JButton getLoginButton() {
        return LoginBtn;
    }
    
    public UserModel getAccount(){
        String emailUser = textFieldEmail.getText();
        String passwordUser = textFieldPassword.getText();
        return new UserModel(emailUser, passwordUser);
    }
    
    public void setMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBtn;
    private javax.swing.JLabel etiquetaImagen_Login;
    private javax.swing.JButton iAmGuest_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JCheckBox rememberMe;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldPassword;
    // End of variables declaration//GEN-END:variables
}