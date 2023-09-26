
package pkg_BD;
import pkg_relacion.Utilidades_;
import java.sql.Connection;
import java.sql.DriverManager;


public class BD_Conexion {
   private static Connection connection; 
   
   private static String driver="com.mysql.jdbc.Driver";
   private static String user="root";
   private static String password="123456admin";
   private static String url="jdbc:mysql://localhost:3306/CERNTRO_COMERCIAL";
   

   
   static
   {
        try
        {
            Class.forName(driver);
        }catch(Exception ex)
        {
            Utilidades_.Mensaje(ex.toString(), 0);
        }
   }
   
   public Connection getConnection()
   {
       try
       {
           connection=DriverManager.getConnection(url,user,password);
       }catch(Exception ex)
       {
           Utilidades_.Mensaje(ex.toString(), 0);
       }
       
       return connection;
   }

   
}
