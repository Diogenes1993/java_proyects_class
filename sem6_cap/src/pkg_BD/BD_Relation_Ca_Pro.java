package pkg_BD;

import pkg_relacion.Utilidades_;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class BD_Relation_Ca_Pro {
     private Connection conexion=new BD_Conexion().getConnection();
     
     public DefaultTableModel  Mostrar_Registro_Join()
     {
          String[] Column_name={"ID","PRODUCTO","IMAGEN","CATEGORIA","IMAGEN"};
        DefaultTableModel modelo=new DefaultTableModel(null,Column_name);
        
        try
        {
            Statement preparando_View=conexion.createStatement();
            String view=" SELECT * FROM VW_IJ_CATE_PRO";
            ResultSet resultado_data=preparando_View.executeQuery(view);
            
            while(resultado_data.next())
            {
                Object data[]=
                {
                    resultado_data.getString(1),
                    resultado_data.getString(2),
                    Utilidades_.Manejo_Data(resultado_data.getBytes(3)),
                    resultado_data.getString(4),
                    Utilidades_.Manejo_Data(resultado_data.getBytes(5))
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
     
      public DefaultTableModel  Mostrar_Registro_Filtro_Join(String nombre_categoria)
     {
          String[] Column_name={"ID","PRODUCTO","IMAGEN","CATEGORIA","IMAGEN"};
        DefaultTableModel modelo=new DefaultTableModel(null,Column_name);
        
        try
        {
            CallableStatement preparando_SP=conexion.prepareCall("{ CALL SP_FILTRAR_X_CATEGORI(?)}");
            preparando_SP.setString(1, nombre_categoria);
            ResultSet resultado_data=preparando_SP.executeQuery();
            
            while(resultado_data.next())
            {
                Object data[]=
                {
                    resultado_data.getString(1),
                    resultado_data.getString(2),
                    Utilidades_.Manejo_Data(resultado_data.getBytes(3)),
                    resultado_data.getString(4),
                    Utilidades_.Manejo_Data(resultado_data.getBytes(5))
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
