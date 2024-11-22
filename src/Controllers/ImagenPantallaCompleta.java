
package Controllers;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;


public class ImagenPantallaCompleta {
    public BufferedImage cargarYRedimensionarImagen() {
        BufferedImage imagenOriginal = null;
        BufferedImage imagenRedimensionada = null;
        
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream("view/images/imageSlide/c_house_3.jpg")) {
            if (inputStream != null) {
                imagenOriginal = ImageIO.read(inputStream);
                
         
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                int screenWidth = (int) screenSize.getWidth();
                int screenHeight = (int) screenSize.getHeight();
                
             
                imagenRedimensionada = new BufferedImage(screenWidth, screenHeight, BufferedImage.TYPE_INT_ARGB);
                
   
                Graphics2D g2d = imagenRedimensionada.createGraphics();
                g2d.drawImage(imagenOriginal, 0, 0, screenWidth, screenHeight, null);
                g2d.dispose();
                
            } else {
                System.err.println("No se pudo encontrar la imagen");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return imagenRedimensionada;
    }
}