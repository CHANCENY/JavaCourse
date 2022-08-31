import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        //WORKING WITH READING INPUT FROM CONSOLE

        //Scanner is class that have method to read data either from console screen or files

        Scanner scan = new Scanner(System.in);

        //reading integer
        System.out.print("Enter integer: ");
        int number = scan.nextInt();

        //reading double
        System.out.print("Enter decimal: ");
        double decimalNumber = scan.nextDouble();


        //reading float
        System.out.print("Enter float: ");
        float floatNumber = scan.nextFloat();


        //reading short NOTE precaution is advice reading less than max value
        System.out.print("Enter short:  ");
        short shortNumber = scan.nextShort();

        //reading byte NOTE precision is advice reading less than max value
        System.out.print("Enter byte: ");
        byte byteNumber = scan.nextByte();

        //NOTE next and nextLine read string and should not go together to avoid errors

        //reading string NOTE reads entire line
        Scanner stringScanner = new Scanner(System.in);
        System.out.print("Enter sentence2: ");
        String sentence2 = new String(stringScanner.nextLine());


        //reading string NOTE reads line of data up to a space only
       /* System.out.print("Enter sentence: ");
        String sentence1 = stringScanner.next();*/




        //display all values led
        System.out.println("Int "+number);
        System.out.println("Float "+floatNumber);
        System.out.println("Double "+decimalNumber);
        System.out.println("Short "+shortNumber);
        System.out.println("Byte "+byteNumber);
       // System.out.println("sentence1 "+sentence1);
        System.out.println("sentence2 "+sentence2);


    }
}