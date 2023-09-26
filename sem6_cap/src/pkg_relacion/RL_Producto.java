
package pkg_relacion;

import javax.swing.table.DefaultTableModel;
import pkg_BD.BD_Productos;
import pkg_entidades.Producto;


public class RL_Producto {
      BD_Productos producto_bd=new BD_Productos();
    public void Agregar(String nombre,int id_categoria,String ruta_image)
    {
        
        if(producto_bd.Agregar(new Producto(nombre,id_categoria,Utilidades_.getImagen(ruta_image))))
            Utilidades_.Mensaje("AGREGADO", 1);
    }
     public void Actualizar(int codigo,String nombre,int id_categoria,String ruta_image)
    {
        
        if(producto_bd.Actualizar(new Producto(codigo,nombre,id_categoria,Utilidades_.getImagen(ruta_image))))
            Utilidades_.Mensaje("ACTUALIZADO", 1);
    }
     
          public void Eliminar(int codigo)
    {
        
        if(producto_bd.Eliminar(codigo))
            Utilidades_.Mensaje("ELIMINADO", 1);
    }
     
     public DefaultTableModel listar()
     {
         return producto_bd.Mostrar_Registro();
     }


}
