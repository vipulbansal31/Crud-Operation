
import java.sql.*;
import java.util.Scanner;

public class a2 {
    
    public void Add(){
        connection obj = new connection();
        Connection con = obj.connect();
        System.out.print("Enter employee id :");
        int id=(new Scanner(System.in)).nextInt();
        //new Scanner(System.in).nextLine();
        System.out.print("Enter employee Name :");
        String name=(new Scanner(System.in)).nextLine();
        System.out.print("Enter employee age :");
        int age=(new Scanner(System.in)).nextInt();
        System.out.print("Enter employee salary :");
        double salary=(new Scanner(System.in)).nextDouble();
        try {
            PreparedStatement stmt = con.prepareStatement("insert into employee values (?,?,?,?)");
            stmt.setInt(1,id);
            stmt.setString(2,name);
            stmt.setInt(3,age);
            stmt.setDouble(4,salary);
            int rowAffact=stmt.executeUpdate();
            if(rowAffact>0)
                System.out.println("Insert row successfully..");
            else
                System.out.println("Record note inserted..");
        } catch (Exception e) {
        }
    }
    
    public void delete(){
        connection obj = new connection();
        Connection con = obj.connect();
        System.out.print("Enter employee id which you want to delete :");
        int id=(new Scanner(System.in)).nextInt();
        try {
            PreparedStatement stmt = con.prepareStatement("delete from employee where id=?");
            stmt.setInt(1,id);
            int rowAffact=stmt.executeUpdate();
            if(rowAffact>0)
                System.out.println("Delete row successfully..");
            else
                System.out.println("Now record Exist..");
            System.out.println("Done");
        } catch (Exception e) {
        }
    } 
    
    public void update(){
        connection obj = new connection();
        Connection con = obj.connect();
        System.out.print("Enter employee id which you want to update :");
        int id=(new Scanner(System.in)).nextInt();
        //new Scanner(System.in).nextLine();
        System.out.print("Enter employee Nane :");
        String name=(new Scanner(System.in)).nextLine();
        System.out.print("Enter employee age :");
        int age=(new Scanner(System.in)).nextInt();
        System.out.print("Enter employee salary :");
        double salary=(new Scanner(System.in)).nextDouble();
        
        try {
            PreparedStatement stmt = con.prepareStatement("update employee set name=?,age=?,salary=? where id=?");
            stmt.setString(1,name);
            stmt.setInt(2,age);
            stmt.setDouble(3,salary);
            stmt.setInt(4,id);
            int rowAffact=stmt.executeUpdate();
            if(rowAffact>0)
                System.out.println("Update row successfully..");
            else
                System.out.println("Now record Exist..");
            System.out.println("Done");
        } catch (Exception e) {
        }
    }
    
    public void view(){
        connection obj=new connection();
        Connection con=obj.connect();
        try{
            PreparedStatement stmt=con.prepareStatement("select * from employee");
            ResultSet rs=stmt.executeQuery();
            System.out.println("---------------Employee Records------------");
            while(rs.next()){
                String s1=rs.getString(1);
                String s2=rs.getString(2);
                String s3=rs.getString(3);
                String s4=rs.getString("salary");
                System.out.println(s1+"  "+s2+"  "+s3+"  "+s4);
            }
            System.out.println("-------------------------------------------");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
