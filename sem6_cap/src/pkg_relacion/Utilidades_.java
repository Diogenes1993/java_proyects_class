
package pkg_BD;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class Utilidades_ {
    public static void Mensaje(String mensaje,int icono)
    {
        JOptionPane.showMessageDialog(null,mensaje,"SEM 6",icono);
    }
    
      public static byte[] getImagen(String ruta_)
  {
      File image=new File(ruta_);
      try
      {
          byte[] icono=new byte[(int) image.length()];
          InputStream input=new FileInputStream(image);
          input.read(icono);
          return icono;
      }
      catch(Exception ex)
      {
          return null;
      }
  }
      
   public static JLabel Manejo_Data(byte[] image)
   {
       JLabel image_label;
       try
                    {
                        byte[] imagen=image;
                        BufferedImage buffer_imagen=null;
                        InputStream input_stream=new ByteArrayInputStream(imagen);
                        buffer_imagen=ImageIO.read(input_stream);
                        ImageIcon image_icon=new ImageIcon(buffer_imagen.getScaledInstance(60, 60, 60));
                        return image_label=new JLabel(image_icon);
                    }
                    catch(Exception ex)
                    {
                           return image_label=new JLabel("No Imagen");
                    }
   }
    
}
