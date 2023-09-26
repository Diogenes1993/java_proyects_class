package pkg_relacion;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import pkg_BD.BD_Categoria;
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
     
     public void llenar_Combo(JComboBox combo_)
     {
          ArrayList<String> nombre_cate=categoria_bd.llenar_Combo();
          combo_.removeAllItems();
          combo_.addItem("Selecciona una Categoria");
          for(String nombre : nombre_cate)
          {
              combo_.addItem(nombre);
          }
     }
      
}
