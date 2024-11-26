
package view;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import Controllers.Images;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashSet;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import models.PropertyModel;

/**
 *
 * @author Juan
 */
public class EditPropertyView extends javax.swing.JFrame {

    /**
     * Creates new form AddPropertyView
     */
    
    int idPropiedad;
    public EditPropertyView(int idPropiedad) {
        this.idPropiedad = idPropiedad;
        initComponents();  
        
         Images imagenLogin = new Images(backgroundImage, "/view/images/fototecho.png", (backgroundImage.getWidth()), backgroundImage.getHeight());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AgregarProperty = new javax.swing.JButton();
        priceProperty = new javax.swing.JTextField();
        sizeProperty = new javax.swing.JTextField();
        locationProperty = new javax.swing.JTextField();
        ownerProperty = new javax.swing.JTextField();
        isSaleProperty = new javax.swing.JCheckBox();
        inRentalProperty = new javax.swing.JCheckBox();
        titleString = new javax.swing.JLabel();
        typeProperty = new javax.swing.JComboBox<>();
        back_btn = new javax.swing.JButton();
        setPropertyImage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        descriptionProperty = new java.awt.TextArea();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AgregarProperty.setBackground(new java.awt.Color(204, 204, 204));
        AgregarProperty.setFont(new java.awt.Font("Graphik Regular", 1, 14)); // NOI18N
        AgregarProperty.setText("Agregar");
        AgregarProperty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarPropertyActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarProperty, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 110, 40));

        priceProperty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pricePropertyActionPerformed(evt);
            }
        });
        jPanel1.add(priceProperty, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 190, 20));

        sizeProperty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizePropertyActionPerformed(evt);
            }
        });
        jPanel1.add(sizeProperty, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 190, -1));

        locationProperty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationPropertyActionPerformed(evt);
            }
        });
        jPanel1.add(locationProperty, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 190, -1));
        jPanel1.add(ownerProperty, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 190, -1));

        isSaleProperty.setFont(new java.awt.Font("Graphik Regular", 0, 14)); // NOI18N
        isSaleProperty.setText("En venta");
        isSaleProperty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isSalePropertyActionPerformed(evt);
            }
        });
        jPanel1.add(isSaleProperty, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        inRentalProperty.setFont(new java.awt.Font("Graphik Regular", 0, 14)); // NOI18N
        inRentalProperty.setText("En alquiler");
        inRentalProperty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inRentalPropertyActionPerformed(evt);
            }
        });
        jPanel1.add(inRentalProperty, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        titleString.setFont(new java.awt.Font("Graphik Regular", 0, 48)); // NOI18N
        titleString.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleString.setText("PUBLICAR");
        jPanel1.add(titleString, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 90));

        typeProperty.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        typeProperty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casa", "Terreno", "Apartamento", "Local" }));
        jPanel1.add(typeProperty, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 190, -1));

        back_btn.setBackground(new java.awt.Color(204, 204, 204));
        back_btn.setFont(new java.awt.Font("Graphik Regular", 1, 14)); // NOI18N
        back_btn.setText("Volver");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        jPanel1.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, -1));

        setPropertyImage.setBackground(new java.awt.Color(255, 204, 204));
        setPropertyImage.setFont(new java.awt.Font("Source Sans Pro ExtraLight", 1, 24)); // NOI18N
        setPropertyImage.setText("                          Subir archivos");
        setPropertyImage.setOpaque(true);
        setPropertyImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setPropertyImageMouseClicked(evt);
            }
        });
        jPanel1.add(setPropertyImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 380, 230));

        jLabel1.setFont(new java.awt.Font("Graphik Regular", 0, 14)); // NOI18N
        jLabel1.setText("Agrega una breve descripción de la propiedad");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 390, 20));

        jLabel2.setFont(new java.awt.Font("Graphik Regular", 0, 14)); // NOI18N
        jLabel2.setText("Agente inmobiliario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Graphik Regular", 0, 14)); // NOI18N
        jLabel3.setText("Precio");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Graphik Regular", 0, 14)); // NOI18N
        jLabel4.setText("Tamaño");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, 20));

        jLabel5.setFont(new java.awt.Font("Graphik Regular", 0, 14)); // NOI18N
        jLabel5.setText("Localidad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Graphik Regular", 0, 14)); // NOI18N
        jLabel6.setText("Tipo de propiedad");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        descriptionProperty.setBackground(new java.awt.Color(255, 204, 204));
        descriptionProperty.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(descriptionProperty, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 390, 120));
        jPanel1.add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 720, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarPropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarPropertyActionPerformed
    Administrar idProperty = new Administrar();
    Double precio = Double.parseDouble(priceProperty.getText());
    String descripcion = descriptionProperty.getText();
    int tamaño = Integer.parseInt(sizeProperty.getText());
    String locacion = locationProperty.getText();
    boolean enRenta = inRentalProperty.isSelected();
    boolean enVenta = isSaleProperty.isSelected();
    String tipo = String.valueOf(typeProperty.getSelectedItem());
    String dueño = ownerProperty.getText();
    boolean isPaused = false;

    byte[] imageBytes = null;
    Icon icon = setPropertyImage.getIcon();
    if (icon != null) {
        BufferedImage bufferedImage = iconToBufferedImage(icon);
        imageBytes = bufferedImageToByteArray(bufferedImage, "png");
        PropertyModel propiedadAdd = new PropertyModel();
        
        propiedadAdd.setSize(tamaño);
        propiedadAdd.setOwner(dueño);
        propiedadAdd.setDescription(descripcion);
        propiedadAdd.setLocation(locacion);
        propiedadAdd.setPrice(precio);
        propiedadAdd.setImages(imageBytes);
        propiedadAdd.setIsRental(enRenta);
        propiedadAdd.setIsSale(enVenta);
        propiedadAdd.setType(tipo);
        propiedadAdd.setPaused(false);
        
        propiedadAdd.actualizarDatos(precio, descripcion, tamaño, locacion, enRenta, enVenta, tipo, dueño, imageBytes, isPaused, idPropiedad);
        System.out.println("Archivos guardados");
        JOptionPane.showMessageDialog(this, "Propiedad agregada");
    } else {
        System.out.println("No hay imagen seleccionada en el JLabel.");
    }
        
    }//GEN-LAST:event_AgregarPropertyActionPerformed

        public byte[] bufferedImageToByteArray(BufferedImage image, String format) {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            ImageIO.write(image, format, baos);
            return baos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public BufferedImage iconToBufferedImage(Icon icon) {
    if (icon instanceof ImageIcon) {
        Image image = ((ImageIcon) icon).getImage();
        BufferedImage bufferedImage = new BufferedImage(
        image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics g = bufferedImage.createGraphics();
        g.drawImage(image, 0, 0, null);
        g.dispose();
        return bufferedImage;
    } else {
        int width = icon.getIconWidth();
        int height = icon.getIconHeight();
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics g = bufferedImage.createGraphics();
        icon.paintIcon(null, g, 0, 0);
        g.dispose();
        return bufferedImage;
    }
}
    private void isSalePropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isSalePropertyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isSalePropertyActionPerformed

    private void pricePropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pricePropertyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pricePropertyActionPerformed

    private void sizePropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizePropertyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sizePropertyActionPerformed

    private void locationPropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationPropertyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationPropertyActionPerformed

    private void inRentalPropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inRentalPropertyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inRentalPropertyActionPerformed

    private void setPropertyImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setPropertyImageMouseClicked
          
       JFileChooser file = new JFileChooser();
       file.setCurrentDirectory(new File(System.getProperty("user.home")));
       FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "gif", "png");
       file.addChoosableFileFilter(filter);

       int result = file.showOpenDialog(null);
       if (result == JFileChooser.APPROVE_OPTION) {
           File selectedFile = file.getSelectedFile();
           String path = selectedFile.getAbsolutePath();
           setPropertyImage.setIcon(ResizeImage(path));

       } else if (result == JFileChooser.CANCEL_OPTION) {
           System.out.println("Sin archivo seleccionado");
       }  
    }//GEN-LAST:event_setPropertyImageMouseClicked

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        this.dispose();
        InicioView ventana = new InicioView();
        ventana.setVisible(true);
    }//GEN-LAST:event_back_btnActionPerformed

      public ImageIcon ResizeImage(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(setPropertyImage.getWidth(), setPropertyImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarProperty;
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel backgroundImage;
    private java.awt.TextArea descriptionProperty;
    private javax.swing.JCheckBox inRentalProperty;
    private javax.swing.JCheckBox isSaleProperty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField locationProperty;
    private javax.swing.JTextField ownerProperty;
    private javax.swing.JTextField priceProperty;
    private javax.swing.JLabel setPropertyImage;
    private javax.swing.JTextField sizeProperty;
    private javax.swing.JLabel titleString;
    private javax.swing.JComboBox<String> typeProperty;
    // End of variables declaration//GEN-END:variables

}


