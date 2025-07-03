import java.util.*;
public class crud {
    private int id;
    private String name;
    private int age;
    private double salary;
    
    
    
    
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     a2 crd=new a2();
     while(true){
       System.out.println("=====Employee Choice=====");
       System.out.println("1 Insert Employee");
       System.out.println("2 Delete Employee");
       System.out.println("3 Update Employee");
       System.out.println("4 View all Employee");
       System.out.println("5 Exit");
       System.out.print("Choose option  :");
       int choice=sc.nextInt();
       switch(choice){
           case 1:
               crd.Add();
               break;
           case 2:
               crd.delete();
               break;
           case 3:
               crd.update();
               break;
           case 4:
               crd.view();
               break;
           case 5:
             System.exit(0);
           
           default:
               System.out.print("Invalid choice,Please choose correct choice :");
               System.out.println("--------------------------------------------");       
       }   
    }
    }
}
