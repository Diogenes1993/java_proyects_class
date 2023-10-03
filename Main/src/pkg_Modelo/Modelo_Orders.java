
package pkg_Modelo;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.*;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;


public class Modelo_Orders {
    private Connection connection=(Connection) new Connection_().getConnection();
    
    public List<Map<String, Object>> Mostrar() {
    List<Map<String, Object>> usuarios=new ArrayList<>();
      try
      {
          Statement con=connection.createStatement();
          String consulta="SELECT * FROM V_DATA_AÑO;";
          ResultSet res=con.executeQuery(consulta);
          ResultSetMetaData metaData = res.getMetaData();
            int columnCount = metaData.getColumnCount();
          while (res.next()) {
               Map<String, Object> aplicacion = new HashMap<>();
                for (int i = 1; i <= columnCount; i++) {
                    String columnName = metaData.getColumnName(i);
                    Object value = res.getObject(i);
                   
                    aplicacion.put(columnName, value);
                    System.out.println(aplicacion);
                  
                }
              Map<String, Object> aplicacionReordenada = new LinkedHashMap<>();
        
                usuarios.add(aplicacion);
               
            }
          
      }catch(SQLException ex)
      {
          System.out.println("ERROR +"+ex);
      }
      return usuarios;
    }
    
  public DefaultTableModel Mostrar_ver2() {
    DefaultTableModel modelo = new DefaultTableModel();

    try {
        Statement con = connection.createStatement();
        String consulta = "SELECT * FROM V_DATA_AÑO";
        ResultSet res = con.executeQuery(consulta);
        ResultSetMetaData metaData = res.getMetaData();
        int columnCount = metaData.getColumnCount();

        // Agregar columnas al modelo basadas en los nombres de las columnas de la consulta
        for (int i = 1; i <= columnCount; i++) {
            modelo.addColumn(metaData.getColumnName(i));
        }

        // Agregar filas al modelo basadas en los datos de la consulta
        while (res.next()) {
            Object[] fila = new Object[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                fila[i - 1] = res.getObject(i);
            }
            modelo.addRow(fila);
        }

    } catch (SQLException ex) {
        System.out.println("ERROR: " + ex);
    }

    return modelo;
}

      
      public boolean contieneElemento(String[] arreglo, String elemento) {
    for (String valor : arreglo) {
        if (valor != null && valor.equals(elemento)) {
            return true; // El elemento existe en el arreglo
        }
    }
    return false; // El elemento no existe en el arreglo
}

}
