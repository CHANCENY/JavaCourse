import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       //WORKING WITH ELSEIF STATEMENTS  ----- BUILDING ATM APP

        Scanner scanOption = new Scanner(System.in);
        Scanner scanAmount = new Scanner(System.in);

        double balanceAccount = 0.0;
        int flags = 1;

        //show all option to screen
        System.out.println("1. Deposit Money\n2. Withdraw Money\n3. Check Balance");

           //asking for option input
           System.out.print("Option: ");
           String option = scanOption.nextLine().toLowerCase().trim();


           //check for option given
           if (option.equals("deposit") || option.equals("deposit money") || option.equals("1")) {
               System.out.print("Enter Amount: ");
               double amount = scanAmount.nextDouble();
               double previousBalance = balanceAccount;
               balanceAccount += amount; //same as balanceAccount = balanceAccount + amount
               if (previousBalance < balanceAccount) {
                   System.out.println("Deposited: " + amount + "\nPrevious balance: " + previousBalance + "\nCurrent balance: " + balanceAccount);
                   return;
               } else {
                   System.out.println("Depositing failed!");
                   return;
               }
           }

           //syntax of else if statement else if(conditions){....statement blocks...}
           else if (option.equals("withdraw") || option.equals("withdraw money") || option.equals("2")) {
               System.out.print("Enter Amount: ");
               double amount = scanAmount.nextDouble();
               double previousBalance = balanceAccount;

               if (balanceAccount < 0.0 || amount > balanceAccount) {
                   System.out.println("Withdraw failed! funds problem.... check you balance ");
                   return;
               }
               balanceAccount -= amount;  //same as balanceAccount = balanceAccount - amount
               if (previousBalance > balanceAccount) {
                   System.out.println("Withdrawn: " + amount + "\nPrevious balance: " + previousBalance + "\nCurrent balance: " + balanceAccount);
               } else {
                   System.out.println("Withdraw failed!");
               }
               return;
           } else if (option.equals("3") || option.equals("check balance") || option.equals("balance")) {
               System.out.println("Balance: " + balanceAccount);
               return;
           } else {
               System.out.println("Please selected option");
           }


    }
}