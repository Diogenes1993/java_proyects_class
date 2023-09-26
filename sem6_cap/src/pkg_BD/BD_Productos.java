
package pkg_BD;

import pkg_relacion.Utilidades_;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import pkg_entidades.Producto;


public class BD_Productos implements IGlobal<Producto> {
 private Connection conexion=new BD_Conexion().getConnection();
    @Override
    public boolean Agregar(Producto producto) {
          boolean result=false;
        try
        {
            CallableStatement preparando_SP=conexion.prepareCall("{CALL SP_INSERTAR_PRODUCTO(?,?,?)}");
            preparando_SP.setString(1, producto.getNombre());
            preparando_SP.setInt(2,producto.getId_categoria());
            preparando_SP.setBytes(3,producto .getImagen());
            
            if(preparando_SP.executeUpdate()>0)
                    result=true;
        }catch(Exception ex)
        {
            Utilidades_.Mensaje(ex.toString(), 0);
        }
        return result;
    }

    @Override
    public boolean Actualizar(Producto producto) {
         boolean result=false;
        try
        {
            CallableStatement preparando_SP=conexion.prepareCall("{CALL SP_ACTUALIZAR_PRODUCTO(?,?,?,?)}");
            preparando_SP.setInt(1, producto.getId());
            preparando_SP.setString(2, producto.getNombre());
            preparando_SP.setInt(3,producto.getId_categoria());
            preparando_SP.setBytes(4,producto .getImagen());
            
            if(preparando_SP.executeUpdate()>0)
                    result=true;
        }catch(Exception ex)
        {
            Utilidades_.Mensaje(ex.toString(), 0);
        }
        return result;
    }

    @Override
    public boolean Eliminar(int codigo) {
     boolean result=false;
        try
        {
            CallableStatement preparando_SP=conexion.prepareCall("{CALL SP_ELIMINAR_PRODUCTO(?)}");
            preparando_SP.setInt(1, codigo);
            
            
            if(preparando_SP.executeUpdate()>0)
                    result=true;
        }catch(Exception ex)
        {
            Utilidades_.Mensaje(ex.toString(), 0);
        }
        return result;
    }

    @Override
    public DefaultTableModel Mostrar_Registro() {
      String[] Column_name={"ID","PRODUCTO","CATEGORIA","IMAGEN"};
        DefaultTableModel modelo=new DefaultTableModel(null,Column_name);
        
        try
        {
        
            CallableStatement preparando_SP=conexion.prepareCall("{ CALL SP_LISTAR_PRODUCTO()}");
            ResultSet resultado_data=preparando_SP.executeQuery();
            
            while(resultado_data.next())
            {
                Object data[]=
                {
                    resultado_data.getString(1),
                    resultado_data.getString(2),
                    resultado_data.getString(3),
                    Utilidades_.Manejo_Data(resultado_data.getBytes(4))
                };
                
                modelo.addRow(data);
            }
            
        }
        catch(Exception ex)
        {
            Utilidades_.Mensaje(ex.toString() , 0);
        }
        return modelo;
    }
    
}
