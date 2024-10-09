/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javax.swing.*;
import java.net.URL;

public class Images extends JPanel {

        public Images(JLabel etiquetaImagen, String rutaImagen, int ancho, int alto) {
            try {
                URL imageUrl = getClass().getResource(rutaImagen);
                if (imageUrl == null) {
                    System.err.println("Error: No se pudo encontrar la imagen en " + rutaImagen);
                    return; // O lanzar una excepción si es necesario
                }

                Icon mIcono = new ImageIcon(new ImageIcon(imageUrl).getImage()
                        .getScaledInstance(etiquetaImagen.getWidth(), etiquetaImagen.getHeight(), 0));
                etiquetaImagen.setIcon(mIcono);
            } catch (Exception e) {
                System.err.println("Error al cargar la imagen: " + e.getMessage());
                // Manejar la excepción de forma adecuada (mostrar un mensaje al usuario, etc.)
            }
        }
    
}