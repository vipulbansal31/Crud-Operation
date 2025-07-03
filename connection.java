import java.sql.*;
public class connection {
    Connection con;
    public Connection connect(){
    try{
        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Vipul","bansal");  
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
       return con;
    }
}
