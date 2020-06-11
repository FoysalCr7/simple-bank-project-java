
package bankjava;

import java.util.Scanner;


public class Employe {
   String name;
String empId;
double salary ;
 Scanner in= new Scanner(System.in);
public void Createempolye(){
     System.out.println("Enter Account Name: ");
     name = in.nextLine();
         
      System.out.println("Enter Account Number: ");
      empId = in.nextLine();
       System.out.println("Enter Initial Balance: ");
         salary = in.nextDouble(); 
        
    }
    public void showemploye(){
       System.out.println("your Account Name:"+name );
       System.out.println("Your account number"+empId);
       System.out.println("Your account balence"+salary);
    }
   


}
