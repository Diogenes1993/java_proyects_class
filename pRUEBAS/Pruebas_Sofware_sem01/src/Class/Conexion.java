
package Class;

import java.sql.*;
import java.sql.DriverManager;



public class Conexion {
    private static Connection cs;
    private static String url="jdbc:mysql://localhost:3306/";
    private static String usuario="root";
    private static String contrasenia="123456admin";
    private static String base_de_datos="INSTITUCION";
    private static String ruta=url+base_de_datos;
    
     
public static Connection Conectar()
  {
      String driver="com.mysql.jdbc.Driver";
      try{
          //Class.forName(driver);
          cs= DriverManager.getConnection(ruta,usuario,contrasenia);
          
      }
      catch(/*ClassNotFoundException |*/ SQLException e){
          System.out.println("ERROR");
      }
      return cs;
  }

}
