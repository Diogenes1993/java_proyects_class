package pkg_relacion;

import java.awt.Component;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import pkg_BD.BD_Categoria;
import pkg_BD.Utilidades_;
import pkg_entidades.Categoria;


public class RL_Categoria {
    
    BD_Categoria categoria_bd=new BD_Categoria();
    public void Agregar(String nombre,String ruta_image)
    {
        
        if(categoria_bd.Agregar(new Categoria(nombre,Utilidades_.getImagen(ruta_image))))
            Utilidades_.Mensaje("AGREGADO", 1);
    }
     public void Actualizar(int codigo,String nombre,String ruta_image)
    {
        
        if(categoria_bd.Actualizar(new Categoria(codigo,nombre,Utilidades_.getImagen(ruta_image))))
            Utilidades_.Mensaje("ACTUALIZADO", 1);
    }
     
          public void Eliminar(int codigo)
    {
        
        if(categoria_bd.Eliminar(codigo))
            Utilidades_.Mensaje("ELIMINADO", 1);
    }
     
     public DefaultTableModel listar()
     {
         return categoria_bd.Mostrar_Registro();
     }
     
       public String ruta(Component parentComponent,JLabel lblImagen)
    {
        String ruta="";
        JFileChooser file_chooser=new JFileChooser();
        FileNameExtensionFilter extension_filter=new FileNameExtensionFilter("JPG ,PNG ,JPEG Y GIF","jpg","jpeg","png","gif");
        
        file_chooser.setFileFilter(extension_filter);
        
        if(file_chooser.showOpenDialog(parentComponent)==JFileChooser.APPROVE_OPTION)
        {
            ruta=file_chooser.getSelectedFile().getAbsolutePath();
            
            Image image=new ImageIcon(ruta).getImage();
            ImageIcon icon=new ImageIcon(image.getScaledInstance(lblImagen.getWidth(),lblImagen.getHeight(),0));
            lblImagen.setIcon(icon);
        }
        
        return ruta;
    }
}
