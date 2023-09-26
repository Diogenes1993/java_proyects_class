
package pkg_BD;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import pkg_entidades.Categoria;


public class BD_Categoria implements IGlobal<Categoria>{

    private Connection conexion=new BD_Conexion().getConnection();
    
    @Override
    public boolean Agregar(Categoria categoria) {
        boolean result=false;
        try
        {
            CallableStatement preparando_SP=conexion.prepareCall("{CALL SP_INSERTAR_CATEGORIA(?,?)}");
            preparando_SP.setString(1, categoria.getNombre());
            preparando_SP.setBytes(2, categoria.getImagen());
            
            if(preparando_SP.executeUpdate()>0)
                    result=true;
        }catch(Exception ex)
        {
            Utilidades_.Mensaje(ex.toString(), 0);
        }
        return result;
    }

    @Override
    public boolean Actualizar(Categoria categoria) {
          boolean result=false;
        try
        {
            CallableStatement preparando_SP=conexion.prepareCall("{CALL SP_ACTUALIZAR_CATEGORIA(?,?,?)}");
            preparando_SP.setInt(1, categoria.getId());
            preparando_SP.setString(2, categoria.getNombre());
            preparando_SP.setBytes(3, categoria.getImagen());
            
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
            CallableStatement preparando_SP=conexion.prepareCall("{CALL SP_ELIMINAR_CATEGORIA(?)}");
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
           String[] Column_name={"ID","CATEGORIA","IMAGEN"};
        DefaultTableModel modelo=new DefaultTableModel(null,Column_name);
        
        try
        {
        
            CallableStatement preparando_SP=conexion.prepareCall("{ CALL SP_LISTAR_CATEGORIA()}");
            ResultSet resultado_data=preparando_SP.executeQuery();
            
            while(resultado_data.next())
            {
                Object data[]=
                {
                    resultado_data.getString(1),
                    resultado_data.getString(2),
                    Utilidades_.Manejo_Data(resultado_data.getBytes(3))
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
