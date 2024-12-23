
package view;

import Controllers.Images;
import Controllers.LoginController;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import models.LoginModel;
import models.UserModel;

public class LoginView extends javax.swing.JFrame {

    public LoginView() {
        initComponents();
        Images imagenLogin = new Images(logoLogin, "/view/images/fototecho.png", (logoLogin.getWidth()), logoLogin.getHeight());
        textFieldEmail.setOpaque(false);
        textFieldPassword.setOpaque(false);
        rememberMe.setOpaque(false);
        textFieldEmail.setBackground(new Color(255, 0 ,0 , 10));
        
        
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
        textFieldPassword = new javax.swing.JTextField();
        textFieldEmail = new javax.swing.JTextField();
        separadorUsuario = new javax.swing.JSeparator();
        rememberMe = new javax.swing.JCheckBox();
        separadorContraseña = new javax.swing.JSeparator();
        LoginBtn = new javax.swing.JButton();
        LoginBtn1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        logoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(679, 510));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textFieldPassword.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        textFieldPassword.setToolTipText("");
        textFieldPassword.setBorder(null);
        jPanel1.add(textFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 300, -1));

        textFieldEmail.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        textFieldEmail.setBorder(null);
        textFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEmailActionPerformed(evt);
            }
        });
        jPanel1.add(textFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 300, -1));

        separadorUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), java.awt.Color.black, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        separadorUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(separadorUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 310, -1));

        rememberMe.setBackground(new java.awt.Color(255, 255, 255));
        rememberMe.setFont(new java.awt.Font("Graphik Regular", 0, 14)); // NOI18N
        rememberMe.setText("Recordarme");
        jPanel1.add(rememberMe, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, -1));

        separadorContraseña.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), java.awt.Color.black, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        separadorContraseña.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(separadorContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 310, -1));

        LoginBtn.setBackground(new java.awt.Color(204, 204, 204));
        LoginBtn.setFont(new java.awt.Font("Graphik Regular", 0, 14)); // NOI18N
        LoginBtn.setText("Ingresar");
        jPanel1.add(LoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 110, 40));

        LoginBtn1.setBackground(new java.awt.Color(204, 204, 204));
        LoginBtn1.setFont(new java.awt.Font("Graphik Regular", 0, 14)); // NOI18N
        LoginBtn1.setText("Volver");
        LoginBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(LoginBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 110, 40));

        jLabel1.setFont(new java.awt.Font("Graphik Regular", 0, 14)); // NOI18N
        jLabel1.setText("CONTRASEÑA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Graphik Regular", 0, 14)); // NOI18N
        jLabel2.setText("USUARIO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Graphik Regular", 0, 36)); // NOI18N
        jLabel3.setText("BIENVENIDO USUARIO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        logoLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/fototecho.png"))); // NOI18N
        logoLogin.setText("Logo");
        logoLogin.setToolTipText("");
        jPanel1.add(logoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEmailActionPerformed

    private void LoginBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtn1ActionPerformed
        Panel ventana = new Panel();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LoginBtn1ActionPerformed

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
    private javax.swing.JButton LoginBtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoLogin;
    private javax.swing.JCheckBox rememberMe;
    private javax.swing.JSeparator separadorContraseña;
    private javax.swing.JSeparator separadorUsuario;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldPassword;
    // End of variables declaration//GEN-END:variables
}
