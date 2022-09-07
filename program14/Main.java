import java.util.*;


class Bank{
    private String[] accountNames = new String[10];
    private String[] accountPins = new String[10];
    private double[] accountBalance = new double[10];

    private String[] statements = new String[10];
    int ownerIndex = -1;

    public void welcomeCustomers(){
        //object to read the options
        Scanner opScanner = new Scanner(System.in);

        //print out options available
        System.out.print("Welcome to Standard bank\n\nRegistration\nLogin\n\nEnter option: ");

        //reading values from console
        String option = opScanner.nextLine();

        //checking the option to process
        if(option.toLowerCase().equals("registration")){
            this.registrationFunction();
        }
        else if(option.toLowerCase().equals("login")){
            if(this.loginFunction())
                System.out.println("Login successfully...");
        }else if(option.toLowerCase().equals("admin")){
           this.adminstratorFunction();
        }
        else{
            System.out.println("Invalid option type correctly....");
        }
    }

    public void registrationFunction(){

        //reading in all required customer details
        Scanner customerScanner = new Scanner(System.in);
        System.out.print("Enter account Name: ");
        String name = customerScanner.nextLine();

        System.out.print("Enter pin: ");
        String pin = customerScanner.nextLine();

        System.out.print("Would you like to make initial deposit (yes) or (no): ");
        String answer = customerScanner.nextLine();

        //check whether customer decide to deposit initial deposit
        if(answer.toLowerCase().equals("yes")){

            //reading the deposit amount
            Scanner initialScanner = new Scanner(System.in);
            System.out.print("Enter amount: ");
            double amount = initialScanner.nextDouble();

            if(amount > 0){

                //calling savingCustomer to save customer details
                if(this.savingCustomer(name,pin,amount)){
                    System.out.println("Registration done successfully");
                    return;
                }
            }else{
                System.out.println("Please amount should be more than Zero!");
                return;
            }
        }
        else
        {
            //calling savingCustomer to save customer details if customer decide to make initial deposit
            if(this.savingCustomer(name,pin,0)){
                System.out.println("Registration done successfully");
                return;
            }
        }
        System.out.println("Sorry we have some technical issues try again later!");

    }

    public boolean savingCustomer(String name, String pin, double deposit){

        //function will do the push element into array by checking for empty position in arrays
        int index = -1;
        for (String element : this.accountNames) {
            index++;
            if (element == null) {
                this.accountNames[index] = name;
                this.accountPins[index] = pin;
                this.accountBalance[index] = deposit;
                return true;
            }
        }
        return false;
    }

    public boolean loginFunction(){

        //reading all required values to login
        Scanner loginScanner = new Scanner(System.in);
        System.out.print("Enter account name: ");
        String name = loginScanner.nextLine();

        System.out.print("Enter pin: ");
        String pin = loginScanner.nextLine();

        //check if successfully read values are not empty
        if(name != null && pin != null){

            //sending account name value to verification function
            int indexFound = this.verification(name);

            //checking if indexfound is -1 if so means that account name does not exist
            if(indexFound != -1) {
                if (this.accountPins[indexFound].equals(pin)) {

                    //initialising the ownerindex values if user details are successfully matched
                    //this index is heavy used in Banking class
                    this.ownerIndex = indexFound;
                    return true;
                }
            }
        }else{
            System.out.println("Fill all fields!");
        }

        return false;
    }

    public int verification(String name){
        int index = -1;

        //matching name passed with names in accountNames array if found the index of name is returned
        try {
            for (String element : this.accountNames) {
                index++;
                if (element.equals(name)) {
                    return index;
                }
            }
        }catch (Exception e){
            System.out.println("Account name entered does not exist");
        }

        return -1;
    }

    public String[] getCustomer(int index){

        //returns the accountname and accountbalance of logged in customer
        //this function is heavy used in Banking class
        String[] user = {this.accountNames[index], Double.toString(this.accountBalance[index])};
        return user;
    }

    public int getOwnerIndex(){
        //returns owneridex which get it values after successully logging in
        //this function is heavy used in Banking class
        return this.ownerIndex;
    }

    public void deleteAccount(int index){

        //initialising string variable to be used
        String names = new String();
        String pins = new String();
        String balances = new String();
        String statement = new String();

        //filtering through all names while using index to collect all values from arrays and
        //making string of names separated by "," also string of pins separated by "," same to balance
        for (int i = 0; i < this.accountNames.length; i++){
            if(i != this.ownerIndex){
                names = names + this.accountNames[i]+",";
                pins = pins + this.accountPins[i]+",";
                balances = balances + this.accountBalance[i]+",";
                statement = statement + this.statements[i]+",";
            }
        }

        //calling completeDeletion
        this.completeDeletion(names,pins,balances, statement);

        //setting ownerindex to -1 so that to logout user out since account is deleted
        this.ownerIndex = -1;
    }

    private void completeDeletion(String name, String pin, String balance, String statement){

        //forming new arrays by using string function split
        String[] names = name.split(",");
        String[] pins = pin.split(",");
        String[] balances = balance.split(",");
        String[] statements = statement.split(",");

        //running for loop upto size of new formed array of names
        //and using index to insert values on same index in arrays of Bank
        for (int i = 0; i < names.length; i++){
            this.accountNames[i] =names[i];
            this.accountPins[i] =pins[i];
            this.accountBalance[i] =Double.parseDouble(balances[i]);
            this.statements[i] = statements[i];

        }

    }

    public boolean logout(){

        //setting owneridex to -1 does the logout process
        this.ownerIndex = -1;
        return true;
    }

    public void setBalance(int index, double balance){

        //setBalance is setter for any of balance in accountBalance array that is to modified
        this.accountBalance[index] = balance;
    }

    private void adminstratorFunction(){
        Scanner adminScanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = adminScanner.nextLine();

        System.out.print("Enter password: ");
        String password = adminScanner.nextLine();

        if(username.equals("admin2022")){
            if(password.equals("admin@2022")){
                System.out.println("\n\nStandard Bank");
                System.out.println("*************************************************************");
                System.out.println("ACCOUNT NAMES AVAILABLE IN SYSTEM");
                System.out.println(Arrays.toString(this.accountNames));

                System.out.println("*************************************************************");
                System.out.println("ACCOUNT BALANCES AVAILABLE IN SYSTEM");
                System.out.println(Arrays.toString(this.accountBalance));

                System.out.println("*************************************************************");
                System.out.println("ACCOUNT STATEMENTS AVAILABLE IN SYSTEM");
                System.out.println(Arrays.toString(this.statements));
                System.out.println("*************************************************************");
            }else{
                System.out.println("Error occurred! Wrong password");
            }
        }else{
            System.out.print("Error occurred! Wrong username");
        }
    }

    public void setStatements(int index, String statement){
        this.statements[index] = statement;
    }

    public String getStatement(){
        return this.statements[this.ownerIndex];
    }
}

class Banking{
    private Bank bank;
    private String[] customerDetails;
    private String statement;


    public void BankingOptions(Bank bank){
        //initialising the bank object using bank argument parameter passed;
        this.bank = bank;

        //getting the logged in customer details from Bank class
        customerDetails = bank.getCustomer(bank.getOwnerIndex());

        //print out the options available
        Scanner optionScanner = new Scanner(System.in);
        System.out.print("\nDeposit Cash\nWithdraw Cash\nCheck Balance\nLog Out\nDelete Account\nStatements\nEnter option: ");
        String option = optionScanner.nextLine();

        //check for option to proccess
        if(option.toLowerCase().equals("deposit")){
            this.depositTransactionFunction();
        } else if(option.toLowerCase().equals("withdraw")){
            this.withdrawTransactionFunction();
        } else if(option.toLowerCase().equals("balance")){
           this.checkBalanceFunction();
        } else if(option.toLowerCase().equals("logout")){
            if(bank.logout()){
                System.out.println("You have logged out");
            }
        } else if(option.toLowerCase().equals("delete")){
            bank.deleteAccount(bank.getOwnerIndex());
            System.out.println("Account deleted successfully...");
        }else if(option.toLowerCase().equals("statement")){
            this.viewStatements();
        }
        else{
            System.out.println("Invalid option you have enter ("+option+")");
        }
    }

    public void depositTransactionFunction(){
        double amount = this.amountScannerFunction();

        if(amount > 0){
            bank.setBalance(bank.getOwnerIndex(),Double.parseDouble(this.customerDetails[1]) + amount);
            this.viewTransactionStatus();
            String line = "Transaction Type: Deposit\nAccount Name: "+this.customerDetails[0]+"\nAmount: "+amount+"\nBalance: "+this.balanceEditor(bank.getCustomer(bank.getOwnerIndex())[1]);
            this.updateStatement(this.constructorStatement(line));
            return;

        }else{
            System.out.println("You can't deposited Zero");
        }
    }

    public void withdrawTransactionFunction(){
        double amount = this.amountScannerFunction();

        if(Double.parseDouble(bank.getCustomer(bank.getOwnerIndex())[1]) >= amount){
          bank.setBalance(bank.getOwnerIndex(), Double.parseDouble(this.customerDetails[1]) - amount);
          this.viewTransactionStatus();

            String line = "Transaction Type: Withdraw\nAccount Name: "+this.customerDetails[0]+"\nAmount: "+amount+"\nBalance: "+this.balanceEditor(bank.getCustomer(bank.getOwnerIndex())[1]);
            this.updateStatement(this.constructorStatement(line));
        }

    }

    private double amountScannerFunction(){

        //to read input of amount only from console
        Scanner depositOwner = new Scanner(System.in);
        System.out.print("Enter Amount: ");
        double amount = depositOwner.nextDouble();
        return amount;
    }

    private void viewTransactionStatus(){
        //showing the old balance and new balance after every transaction
        System.out.println("\n\n********************************");
        System.out.println("\nAccount Name:"+ this.customerDetails[0]);
        System.out.println("Old Balance: "+this.balanceEditor(this.customerDetails[1]));
        System.out.println("New Balance: "+this.balanceEditor(bank.getCustomer(bank.getOwnerIndex())[1]));
        System.out.println("********************************");

    }

    public void checkBalanceFunction(){
        System.out.println("\n\n********************************");
        System.out.println("Standard Bank\n");
        System.out.println("Account Name: "+bank.getCustomer(bank.getOwnerIndex())[0]);
        System.out.println("Account Balance: "+this.balanceEditor(bank.getCustomer(bank.getOwnerIndex())[1]));
        System.out.println("********************************");

    }

    private String balanceEditor(String balance){

        //when balance figure doesn't have decimal number (.0) this function will return only (65)
        //whole number if it has decimal number (.55) will return function figure with (65.55)
        if(balance.substring(balance.indexOf(".") + 1).equals("0")){
            return balance.substring(0, balance.indexOf("."));
        }
        return balance;
    }

    private void updateStatement(String  newStatement){
        this.statement = !Objects.equals(bank.getStatement(), null) ? bank.getStatement() : "";
        this.statement = this.statement + newStatement+"@";
        bank.setStatements(bank.getOwnerIndex(), this.statement);
    }

    private String constructorStatement(String transaction){
        Date now = new Date();
        Random rands =new Random();
        String ref =Integer.toString(rands.nextInt(10000,990000));
        String today = now.toString();
        String statement = "**************************\n\nDate: "+today+"\n"+transaction+"\nRef No: "+ref+"\nstandard bank.\n\n****************************";
        return statement;
    }

    public void viewStatements(){

        try {
            this.statement = bank.getStatement();
            String[] statements = statement.split("@");

            for (String st : statements) {
                System.out.println(st + "\n");
            }
        }catch (Exception e){
            System.out.println("Statements not available!");
        }
    }
}


public class Main {

    public static void main(String[] args) {

        int i = 0;
        Bank bank = new Bank();

        while(i < 1){

            if(bank.getOwnerIndex() == -1) {
                bank.welcomeCustomers();
            }

            if(bank.getOwnerIndex() != -1) {
                Banking banking = new Banking();
                banking.BankingOptions(bank);
            }

        }

    }
}