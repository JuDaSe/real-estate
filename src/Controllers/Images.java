
package Controllers;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Image;

import javax.swing.*;
import java.net.URL;

public class Images extends JPanel {

        public Images(JLabel etiquetaImagen, String rutaImagen, int ancho, int alto) {
            try {
                URL imageUrl = getClass().getResource(rutaImagen);
                if (imageUrl == null) {
                    System.err.println("Error: No se pudo encontrar la imagen en " + rutaImagen);
                    return; 
                }

                Icon mIcono = new ImageIcon(new ImageIcon(imageUrl).getImage()
                        .getScaledInstance(etiquetaImagen.getWidth(), etiquetaImagen.getHeight(), 0));
                etiquetaImagen.setIcon(mIcono);
            } catch (Exception e) {
                System.err.println("Error al cargar la imagen: " + e.getMessage());
            }
        }
        
        public ImageIcon ResizeImage(String ImagePath, JLabel label)
        {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
}