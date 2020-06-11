
package bankjava;

import java.util.Scanner;


public class BankJava {

    
    public static void main(String[] args) {
        
            Scanner in = new Scanner(System.in);

            int userChoice;

            boolean quit = false;
             
    Customer customer=new Customer();
    Employe employe=new Employe();

           

            do {

                  System.out.println("1. Employe Details ");

                  System.out.println("2. Create Customer");

                  System.out.println("3. Account Information");

                  System.out.print("Your choice, 0 to quit: ");

                  userChoice = in.nextInt();

                  switch (userChoice) {

                  case 1:
                      employe.Createempolye();
                      employe.showemploye();
                     

                        

                        break;

                  case 2:

                       customer.createCustomer();
                       customer.showcustomer();
                      

                        break;

                  case 3:

                       customer.bankaccountInfo();

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
