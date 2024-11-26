package view;

import models.PropertyModel;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;
import models.ConnectMySQL;


public class UsuarioVista extends javax.swing.JFrame {

    private PropertyModel currentProperty;
    private List<Integer> propertyIds;
    private int currentIndex;  
    
     public UsuarioVista() {
         initComponents();
         propertyIds = new ArrayList<>();
         cargarIdsPropiedades();
         if (!propertyIds.isEmpty()) {
                currentIndex = 0;
                cargarSiguientePropiedad(); 
         } else {
                JOptionPane.showMessageDialog(this, "No hay propiedades en la base de datos.");
         }
    }

  private void cargarIdsPropiedades() {
        String sql = "SELECT id FROM property WHERE isPaused = false";
        try (Connection conn = ConnectMySQL.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                propertyIds.add(rs.getInt("id"));
            }
        } catch (SQLException e) {
            System.err.println("Error al cargar los IDs de las propiedades: " + e.getMessage());
        }
    }

    private void mostrarIDPropiedad(PropertyModel property) {
        if(property == null){
            System.err.println("Error: propiedades nulas");
            return;
        }
        
        String info2 = "Ubicación: " + property.getLocation();
        ubicationLabelAdministrar.setText(info2);
        
        String info3 = "<html><body style='width: 100%;'>Descripción: " + property.getDescription() + "</body></html>";
        descripcion.setText(info3);
        
        String info4 = "Agente Inmobiliario: " + property.getOwner();
        agentM.setText(info4);
        
        String info5 = "Precio Casa: " + property.getOwner();
        price.setText(info5);
    }

    private void cargarSiguientePropiedad() {
         if (propertyIds.isEmpty() && currentProperty.getPaused() == true) {
            JOptionPane.showMessageDialog(this, "No hay propiedades en la base de datos.");
            return;
            }

            if (currentIndex < propertyIds.size()) {
                int propertyId = propertyIds.get(currentIndex);
                cargarPropiedad(propertyId);
            }
    }

    private void cargarAnteriorPropiedad() {
        if (propertyIds.isEmpty() || currentIndex == 0) {
        JOptionPane.showMessageDialog(this, "Nulo, no se puede ir hacia atras, no existen propiedades");
        return;
        }
        currentIndex--;
        cargarSiguientePropiedad();
    }
    
        private void cargarPropiedad(int propertyId) {
        String sql = "SELECT * FROM property WHERE id = ?";

        try (Connection conn = ConnectMySQL.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, propertyId);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                currentProperty = new PropertyModel(
                    rs.getDouble("price"),
                    rs.getString("description"),
                    rs.getInt("size"),
                    rs.getString("location"),
                    rs.getBoolean("isRental"),
                    rs.getBoolean("isSale"),
                    rs.getString("type"),
                    rs.getString("agent"), 
                    rs.getBytes("images"),
                    rs.getBoolean("isPaused"),
                    rs.getInt("id")    
                );

                mostrarIDPropiedad(currentProperty);

                byte[] imgBytes = currentProperty.getImages();
                if (imgBytes != null) {
                    ImageIcon imageIcon = new ImageIcon(imgBytes);
                    imageProperty.setIcon(imageIcon);
                } else {
                    imageProperty.setIcon(null);
                }
            } else {
                System.err.println("No se encontró la propiedad con ID: " + propertyId);
            }
        } catch (SQLException e) {
            System.err.println("Error al cargar la propiedad: " + e.getMessage());
        }
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAdministrar = new javax.swing.JPanel();
        messageAdmin = new javax.swing.JButton();
        descripcion = new javax.swing.JLabel();
        agentM = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        anteriorAdministrar = new javax.swing.JLabel();
        siguienteAdmininistrar = new javax.swing.JLabel();
        back_btn = new javax.swing.JLabel();
        AdministrarLabel = new javax.swing.JLabel();
        imageProperty = new javax.swing.JLabel();
        ubicationLabelAdministrar = new javax.swing.JLabel();
        imageBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(830, 620));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAdministrar.setBackground(new java.awt.Color(255, 255, 255));
        panelAdministrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        messageAdmin.setText("Enviar mensaje");
        messageAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageAdminActionPerformed(evt);
            }
        });
        panelAdministrar.add(messageAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        descripcion.setFont(new java.awt.Font("Graphik Regular", 0, 18)); // NOI18N
        descripcion.setText("Descripción:");
        panelAdministrar.add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 460, 150));

        agentM.setFont(new java.awt.Font("Graphik Regular", 0, 18)); // NOI18N
        agentM.setText("Agente Inmobiliario:");
        panelAdministrar.add(agentM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        price.setFont(new java.awt.Font("Graphik Regular", 0, 18)); // NOI18N
        price.setText("Precio:");
        panelAdministrar.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        anteriorAdministrar.setBackground(new java.awt.Color(204, 204, 204));
        anteriorAdministrar.setFont(new java.awt.Font("Graphik Regular", 1, 18)); // NOI18N
        anteriorAdministrar.setText("     Anterior");
        anteriorAdministrar.setOpaque(true);
        anteriorAdministrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anteriorAdministrarMouseClicked(evt);
            }
        });
        panelAdministrar.add(anteriorAdministrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 130, 50));

        siguienteAdmininistrar.setBackground(new java.awt.Color(204, 204, 204));
        siguienteAdmininistrar.setFont(new java.awt.Font("Graphik Regular", 1, 18)); // NOI18N
        siguienteAdmininistrar.setText("    Siguiente");
        siguienteAdmininistrar.setOpaque(true);
        siguienteAdmininistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siguienteAdmininistrarMouseClicked(evt);
            }
        });
        panelAdministrar.add(siguienteAdmininistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, 130, 50));

        back_btn.setBackground(new java.awt.Color(204, 204, 204));
        back_btn.setText("      Volver");
        back_btn.setOpaque(true);
        back_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_btnMouseClicked(evt);
            }
        });
        panelAdministrar.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 70, 40));

        AdministrarLabel.setFont(new java.awt.Font("Graphik Regular", 1, 24)); // NOI18N
        AdministrarLabel.setText("ADMINISTRAR");
        panelAdministrar.add(AdministrarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        panelAdministrar.add(imageProperty, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 410, 340));

        ubicationLabelAdministrar.setFont(new java.awt.Font("Graphik Regular", 0, 18)); // NOI18N
        ubicationLabelAdministrar.setText("Ubicación: ");
        panelAdministrar.add(ubicationLabelAdministrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 340, 30));
        panelAdministrar.add(imageBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 540));

        getContentPane().add(panelAdministrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siguienteAdmininistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siguienteAdmininistrarMouseClicked
        if (currentIndex < propertyIds.size() - 1) {
        currentIndex++;
        cargarSiguientePropiedad();
        } else {
            JOptionPane.showMessageDialog(this, "No hay más propiedades.");
        }
    }//GEN-LAST:event_siguienteAdmininistrarMouseClicked

    private void anteriorAdministrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anteriorAdministrarMouseClicked
        cargarAnteriorPropiedad();
    }//GEN-LAST:event_anteriorAdministrarMouseClicked

    private void back_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_btnMouseClicked
        this.dispose();
        Panel ventana = new Panel();
        ventana.setVisible(true);
    }//GEN-LAST:event_back_btnMouseClicked

    private void messageAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageAdminActionPerformed
        
    }//GEN-LAST:event_messageAdminActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdministrarLabel;
    private javax.swing.JLabel agentM;
    private javax.swing.JLabel anteriorAdministrar;
    private javax.swing.JLabel back_btn;
    private javax.swing.JLabel descripcion;
    private javax.swing.JLabel imageBackground;
    private javax.swing.JLabel imageProperty;
    private javax.swing.JButton messageAdmin;
    private javax.swing.JPanel panelAdministrar;
    private javax.swing.JLabel price;
    private javax.swing.JLabel siguienteAdmininistrar;
    private javax.swing.JLabel ubicationLabelAdministrar;
    // End of variables declaration//GEN-END:variables
}
