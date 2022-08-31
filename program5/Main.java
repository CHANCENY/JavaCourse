import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //WORKING WITH CONDITION STATEMENTS

        //1. IF STATEMENT BUILDING BASIC CALCULATOR
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        //reading  input of first number
        System.out.print("Enter num1: ");
        double num1 = scan.nextDouble();

        //reading input of operator - , + , *, /, %
        System.out.print("Operator: ");
        char operator = scan1.next().charAt(0);

        // reading input of second number
        System.out.print("Enter num2: ");
        double num2 = scan2.nextDouble();

        //syntax of if statement if(condition here){...statements block..}

        if(operator == '+')
        {
            double answer = num1+num2;
            System.out.println(num1+" + "+num2+" = "+ answer);
            return;
        }
        if(operator == '-')
        {
            double answer = num1-num2;
            System.out.println(num1+" - "+num2+" = "+ answer);
            return;
        }
        if(operator == '/')
        {
            //division Note with does not work
            if(num2 != 0){

                if(num1 != 0) {
                    double answer = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + answer);
                    return;
                }else{
                    System.out.println("Num1 number to be divided is Zero ("+num1+")");
                    return;
                }
            }else{
                System.out.println("Num2 the divisor is Zero ("+num2+")");
                return;
            }
        }
        if(operator == '*')
        {
            double answer = num1 * num2;
            System.out.println(num1+" * "+num2+" = "+ answer);
            return;
        }else{
            System.out.println("Please provide valid mathematical operator");
        }

        //NOTE IF WRONG OP IS GIVEN THE PROGRAM WILL NOT SHOW ANYTHING THEREFORE TO MAKE PROGRAM
        //TO MAKE PROGRAM NOTIFY USER OF WRONG OP THEN ADD ELSE BLOCK AFTER LAST IF BLOCK
        //BUT THIS BLOCK WILL EXECUTED ALL TIME TO AVOID THAT PUT RETURN STATEMENT INSIDE ALL IF BLOCK
        //AFTER SYSTEM STATEMENT


    }
}