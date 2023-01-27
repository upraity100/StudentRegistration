package studentregistration;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyConnection 
{
   public static Connection getConnection()
       {
       Connection con=null;
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","1234");
           }
       catch (ClassNotFoundException | SQLException ex) 
           {
               System.out.println(ex);
           }
       return con;
       }

    private static class connection {

        public connection() {
        }
    }
}
