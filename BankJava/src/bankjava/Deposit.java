
package bankjava;

import java.util.Scanner;


public class Deposit {
    
int amount;
Scanner in= new Scanner(System.in);
 Account aac=new Account();
    public void deposit(){
        
        
          

                        System.out.print("Amount to deposit: ");

                        amount = in.nextInt();

                        if (amount <= 0)

                             System.out.println("Can't deposit nonpositive amount.");

                        else {

                          aac.balance += amount;

                             System.out.println("$" + amount + " has been deposited.");
    }
    
}
}
