package view;

import models.PropertyModel;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;
import models.ConnectMySQL;


public class Administrar extends javax.swing.JFrame {

    private PropertyModel currentProperty;
    private List<Integer> propertyIds;
    private int currentIndex;  
    
     public Administrar() {
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
        String sql = "SELECT id FROM property";
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
    }

    private void cargarSiguientePropiedad() {
         if (propertyIds.isEmpty()) {
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
                    rs.getInt("id"),
                    rs.getString("location"),
                    rs.getBytes("images")
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
        anteriorAdministrar = new javax.swing.JLabel();
        siguienteAdmininistrar = new javax.swing.JLabel();
        back_btn = new javax.swing.JLabel();
        labelPausa = new javax.swing.JLabel();
        AdministrarLabel = new javax.swing.JLabel();
        BorrarPAdministrar = new javax.swing.JLabel();
        PausarPAdministrar = new javax.swing.JLabel();
        EditarPAdministrar = new javax.swing.JLabel();
        imageProperty = new javax.swing.JLabel();
        ubicationLabelAdministrar = new javax.swing.JLabel();
        imageBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(830, 620));
        setMinimumSize(new java.awt.Dimension(830, 620));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAdministrar.setBackground(new java.awt.Color(255, 255, 255));
        panelAdministrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        anteriorAdministrar.setBackground(new java.awt.Color(204, 204, 204));
        anteriorAdministrar.setFont(new java.awt.Font("Graphik Regular", 1, 18)); // NOI18N
        anteriorAdministrar.setText("     Anterior");
        anteriorAdministrar.setOpaque(true);
        anteriorAdministrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anteriorAdministrarMouseClicked(evt);
            }
        });
        panelAdministrar.add(anteriorAdministrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 130, 50));

        siguienteAdmininistrar.setBackground(new java.awt.Color(204, 204, 204));
        siguienteAdmininistrar.setFont(new java.awt.Font("Graphik Regular", 1, 18)); // NOI18N
        siguienteAdmininistrar.setText("    Siguiente");
        siguienteAdmininistrar.setOpaque(true);
        siguienteAdmininistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siguienteAdmininistrarMouseClicked(evt);
            }
        });
        panelAdministrar.add(siguienteAdmininistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 130, 50));

        back_btn.setBackground(new java.awt.Color(204, 204, 204));
        back_btn.setText("      Volver");
        back_btn.setOpaque(true);
        back_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_btnMouseClicked(evt);
            }
        });
        panelAdministrar.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 70, 40));

        labelPausa.setFont(new java.awt.Font("Graphik Regular", 0, 14)); // NOI18N
        labelPausa.setText("Esta pausado");
        panelAdministrar.add(labelPausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, -1, -1));

        AdministrarLabel.setFont(new java.awt.Font("Graphik Regular", 1, 24)); // NOI18N
        AdministrarLabel.setText("ADMINISTRAR");
        panelAdministrar.add(AdministrarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        BorrarPAdministrar.setBackground(new java.awt.Color(204, 204, 204));
        BorrarPAdministrar.setFont(new java.awt.Font("Graphik Regular", 1, 14)); // NOI18N
        BorrarPAdministrar.setText("Borrar Publicación");
        BorrarPAdministrar.setOpaque(true);
        BorrarPAdministrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BorrarPAdministrarMouseClicked(evt);
            }
        });
        panelAdministrar.add(BorrarPAdministrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, -1, 30));

        PausarPAdministrar.setBackground(new java.awt.Color(204, 204, 204));
        PausarPAdministrar.setFont(new java.awt.Font("Graphik Regular", 1, 14)); // NOI18N
        PausarPAdministrar.setText("Pausar Publicación");
        PausarPAdministrar.setOpaque(true);
        PausarPAdministrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PausarPAdministrarMouseClicked(evt);
            }
        });
        panelAdministrar.add(PausarPAdministrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, -1, 30));

        EditarPAdministrar.setBackground(new java.awt.Color(204, 204, 204));
        EditarPAdministrar.setFont(new java.awt.Font("Graphik Regular", 1, 14)); // NOI18N
        EditarPAdministrar.setText("Editar Publicación");
        EditarPAdministrar.setOpaque(true);
        EditarPAdministrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditarPAdministrarMouseClicked(evt);
            }
        });
        panelAdministrar.add(EditarPAdministrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, 30));
        panelAdministrar.add(imageProperty, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 410, 340));

        ubicationLabelAdministrar.setFont(new java.awt.Font("Graphik Regular", 0, 18)); // NOI18N
        ubicationLabelAdministrar.setText("Ubicación: ");
        panelAdministrar.add(ubicationLabelAdministrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 400, 30));
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
        InicioView ventana = new InicioView();
        ventana.setVisible(true);
    }//GEN-LAST:event_back_btnMouseClicked

    private void EditarPAdministrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarPAdministrarMouseClicked
        EditPropertyView editarCasa = new EditPropertyView(propertyIds.get(currentIndex));
        editarCasa.setVisible(true);
        
    }//GEN-LAST:event_EditarPAdministrarMouseClicked

    private void BorrarPAdministrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrarPAdministrarMouseClicked
         PropertyModel borrarPropiedad = new PropertyModel();
         borrarPropiedad.borrarDatos(propertyIds.get(currentIndex));
         JOptionPane.showMessageDialog(this, "Elemento eliminado");
    }//GEN-LAST:event_BorrarPAdministrarMouseClicked

    private void PausarPAdministrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PausarPAdministrarMouseClicked
      
         if (currentProperty != null) {
         int id = propertyIds.get(currentIndex);
         boolean isPaused = !currentProperty.getPaused();
         System.out.println("Estado actual: " + currentProperty.getPaused());
         if(currentProperty.getPaused() == false){
            String ps = "<html><body style='color:red;'>Pausado</body></html>";
            labelPausa.setText(ps);
         } else {
             String ps = "<html><body style='color:green;'>En vista</body></html>";
             labelPausa.setText(ps);
         }
         
         

         currentProperty.actualizarDatos(isPaused, id);
         currentProperty.sincronizarEstado(id);

         System.out.println("Parámetros enviados: isPaused = " + isPaused + ", idProperty = " + id);
         if (isPaused) {
             JOptionPane.showMessageDialog(this, "Casa pausada");
         } else {
             JOptionPane.showMessageDialog(this, "Casa despausada");
         }
     }
    }//GEN-LAST:event_PausarPAdministrarMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdministrarLabel;
    private javax.swing.JLabel BorrarPAdministrar;
    private javax.swing.JLabel EditarPAdministrar;
    private javax.swing.JLabel PausarPAdministrar;
    private javax.swing.JLabel anteriorAdministrar;
    private javax.swing.JLabel back_btn;
    private javax.swing.JLabel imageBackground;
    private javax.swing.JLabel imageProperty;
    private javax.swing.JLabel labelPausa;
    private javax.swing.JPanel panelAdministrar;
    private javax.swing.JLabel siguienteAdmininistrar;
    private javax.swing.JLabel ubicationLabelAdministrar;
    // End of variables declaration//GEN-END:variables
}
