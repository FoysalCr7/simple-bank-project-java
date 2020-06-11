
package bankjava;

import java.util.Scanner;


public class Account {
    public String name;
    public int  acno;
    public double  balance;
    
    
    Scanner in= new Scanner(System.in);
    public void  CreateACC(){
          System.out.println("Enter Account Name: ");
     name = in.nextLine();
         
      System.out.println("Enter Account Number: ");
      acno = in.nextInt();
       System.out.println("Enter Initial Balance: ");
         balance = in.nextFloat(); 
        
    }
    public void showAcc(){
       System.out.println("your Account Name:"+name );
       System.out.println("Your account number"+acno);
       System.out.println("Your account balence"+balance);
    }
   
        
       
    
}
