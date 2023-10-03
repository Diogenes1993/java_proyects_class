
package pkg_Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Connection_ {
    private Connection connection;
    
   private static String driver="com.mysql.jdbc.Driver";
    private static String user="root";
    private static String password="123456admin";
    private static String bd="NORTHWIND";
    private static String url="jdbc:mysql://localhost:3306/".concat(bd);
    
    static
            {
                try
                     {
                         Class.forName(driver);
                     }
                catch(ClassNotFoundException ex)
                     {
                         System.out.println("ERROR "+ex.toString());
                     }
            }
    
    public Connection getConnection()
    {
        try
            {
                connection= DriverManager.getConnection(url,user,password);
            }
        catch(SQLException ex)
            {
                System.out.println("ERROR "+ex.toString());
            }
        
        return connection;
    }

    
}
