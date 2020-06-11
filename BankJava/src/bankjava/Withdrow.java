

package bankjava;

import java.util.Scanner;

public class Withdrow {
 int amount;

Scanner in= new Scanner(System.in);
 Account aac=new Account();
    public void withdarw(){
         System.out.print("Amount to withdraw: ");

                       amount = in.nextInt();

                        if (amount <= 0 || amount > aac.balance)

                             System.out.println("Withdrawal can't be completed.");

                        else {

                           aac.balance -= amount;

                             System.out.println("$" + amount + " has been withdrawn.");
    }
    
}
}