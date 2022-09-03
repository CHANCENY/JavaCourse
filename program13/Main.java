import java.util.Arrays;
import java.util.Scanner;


public class Main {

    //WORKING WITH MULTIPLE FUNCTIONS IN CLASS TO BUILD CALCULATOR
    public static String additionFunction(double x, double y){
        return returnDecider(Double.toString(x + y));
    }

    public static String subtractionFunction(double x, double y){
        return returnDecider(Double.toString(x - y));
    }

    public  static String multipleFunction(double x, double y){
        return returnDecider(Double.toString(x * y));
    }

    public static String divisionFunction(double x, double y){

        if(x != 0 && y != 0){
            return returnDecider(Double.toString(x / y));
        }
        return "No Answer due to Zero division!";
    }

    public  static int remainderFunction(int x, int y){
        return x % y;
    }

    private static String returnDecider(String doubleNumber){

        /*subtring is extracting part of given string eg 54.0875
        * by giving inde of letter next from '.' character (indexOf(".")+ 1
        * therefore subtring will contain 0875
        * then we are checking if subtring is equal to string 0  ( is "0875" == "0"
        * if true the subtring is extracted from doubleNumber from index 0 up to index of '.' (54)
        * then return subtring (54)
        * else if false full  doubleNumber is return 54.0875
        * */

        if(doubleNumber.substring(doubleNumber.indexOf(".") + 1).equals("0")){
            return doubleNumber.substring(0, doubleNumber.indexOf("."));
        }
        return doubleNumber;
    }


    public static void main(String[] args) {

        Scanner operandScanner = new Scanner(System.in);
        Scanner operatorScanner = new Scanner(System.in);

        //asking for operands
        int i = 0;
        while (i < 1) {

            System.out.print("Enter number: ");
            double num1 = operandScanner.nextDouble();

            System.out.print("Enter Operator: ");
            String operator = operatorScanner.next();

            System.out.print("Enter number: ");
            double num2 = operandScanner.nextDouble();

            //calling function based on operator using if else

            //THIS PART OF (IF ELSE) SAME AS BELOW PART OF (TERNARY OPERATOR)

           /* if (operator.equals("+"))
                System.out.println("Answer: " + additionFunction(num1, num2));
            else if (operator.equals("-"))
                System.out.println("Answer: " + subtractionFunction(num1, num2));
            else if (operator.equals("*"))
                System.out.println("Answer: " + multipleFunction(num1, num2));
            else if (operator.equals("/"))
                System.out.println("Answer: " + divisionFunction(num1, num2));
            else if (operator.equals("%"))
                System.out.println("Answer: " + remainderFunction((int) num1, (int) num2));
            else
                System.out.println("Invalid operator try again.....");*/

            //TERNARY OPERATOR USED BELOW
           System.out.println("Answer: "+(operator.equals("+") ? additionFunction(num1, num2): operator.equals("-") ? subtractionFunction(num1, num2) : operator.equals("*") ? multipleFunction(num1, num2) : operator.equals("/") ? divisionFunction(num1, num2): operator.equals("%") ? remainderFunction((int) num1, (int) num2) : "Invalid operator try again....."));

        }

    }

}