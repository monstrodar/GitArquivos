
package sac.classes;
import java.sql.*;
public class Conecta{
    public static Connection abreConexaoBanco(){
        Connection conn; 
        try {
            Class.forName("org.postgresql.Driver");
            String url ="jdbc:postgresql://localhost/lp3";
            conn = DriverManager.getConnection(url,"postgres","postgres123");
        } catch (Exception e) {
            conn=null;
        }
        return conn;
    }
    
}
