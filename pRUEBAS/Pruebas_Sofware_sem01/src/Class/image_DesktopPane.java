
package Class;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.border.Border;


public class image_DesktopPane implements  Border{
    public BufferedImage imagen_memoria;
    
    public image_DesktopPane()
    {
        try
        {
            URL  direccion_imagen=new URL(getClass().getResource("../imagenes/fondo_serio_02.jpg").toString());
            imagen_memoria=ImageIO.read(direccion_imagen);
        }catch(IOException ex)
        {
            System.out.println("ERROR "+ex);
        }
    }
    @Override
   public void paintBorder(Component componente, Graphics graficas, int eje_x, int eje_y, int ancho, int alto) {
        graficas.drawImage(imagen_memoria, (eje_x +(ancho-imagen_memoria.getWidth())/2),(eje_x +(alto-imagen_memoria.getHeight())/2), null);
    }
    
    
    @Override
    public Insets getBorderInsets(Component componente)
    {
        return new Insets(0,0,0,0);
    }
    
    @Override
    public boolean isBorderOpaque()
    {
        return false;
    }

    
 
}
