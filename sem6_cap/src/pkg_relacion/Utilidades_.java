
package pkg_relacion;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import pkg_BD.Image_Table;


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
   
    public static String ruta(JLabel lblImagen)
    {
        String ruta="";
        JFileChooser file_chooser=new JFileChooser();
        FileNameExtensionFilter extension_filter=new FileNameExtensionFilter("JPG ,PNG ,JPEG Y GIF","jpg","jpeg","png","gif");
        
        file_chooser.addChoosableFileFilter(extension_filter);
        file_chooser.setDialogTitle("Abrir Archivo");
        
        File ruta_image=new File("C:\\Users\\alexz\\Downloads\\git_proyects\\java_proyects_class\\sem6_cap\\image_cate\\Produc");
        file_chooser.setCurrentDirectory(ruta_image);
        int aceptar=file_chooser.showOpenDialog(null);
        if(aceptar==JFileChooser.APPROVE_OPTION)
        {
            ruta=file_chooser.getSelectedFile().getAbsolutePath();
            
            Image image=new ImageIcon(ruta).getImage();
            ImageIcon icon=new ImageIcon(image.getScaledInstance(lblImagen.getWidth(),lblImagen.getHeight(),0));
            lblImagen.setIcon(icon);
        }
        
        return ruta;
    }
    
  /*  public void tb_rs(JTable tabla_in,int columns)
    {
        tabla_in.setDefaultRenderer(Object.class,new Image_Table());
     
        tabla_in.setRowHeight(60);
        for(int i=0;i<columns;i++){
        tabla_in.getColumnModel().getColumn(i).setPreferredWidth(60);}
    }*/
    
}
