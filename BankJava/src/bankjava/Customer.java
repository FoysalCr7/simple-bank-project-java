
package bankjava;

import java.util.Scanner;


public class Customer {
    Scanner in=new Scanner(System.in);
    String name;
     int nid;
     public void createCustomer(){
       System.out.println("Enter your Name: ");
     name = in.nextLine();  
      System.out.println("Enter Nid Number: ");
      nid = in.nextInt();    
     }
      public void showcustomer(){
       System.out.println("your Account Name:"+name );
       System.out.println("Your account number"+nid);
     
    }
     public void bankaccountInfo(){
         
            int userChoice;

            boolean quit = false;
             
    Account aac=new Account();
      Deposit dep=new Deposit();
      Withdrow with=new Withdrow();
             
    aac.CreateACC();
  
    aac.showAcc();

           

            do {

                  System.out.println("1. Deposit money");

                  System.out.println("2. Withdraw money");

                  System.out.println("3. Check balance");

                  System.out.print("Your choice, 0 to quit: ");

                  userChoice = in.nextInt();

                  switch (userChoice) {

                  case 1:

                      dep.deposit();

                        

                        break;

                  case 2:

                       
                       with.withdarw();
                        

                        break;

                  case 3:

                        System.out.println("Your balance: $" + aac.balance);

                        break;

                  case 0:

                        quit = true;

                        break;

                  default:

                        System.out.println("Wrong choice.");

                        break;

                  }

                  System.out.println();

            } while (!quit);

            System.out.println("Bye!");
     }
    
    
}
