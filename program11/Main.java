public class Main {

    //WORKING WITH USER DEFINED FUNCTIONS THAT RETURNS NOTHING

    //syntax modifier static return-type functionName(parameters,..,...){...block of code.....}
    public static void displayStudent(String[] student){

        String name = student[0];
        String roll = student[1];
        String course =student[2];
        System.out.println("Student Name: "+name);
        System.out.println("Student Roll: "+roll);
        System.out.println("Student Course: "+course);

    }


    public static void main(String[] args) {

        String[] student = {"Chance nyasulu","2001003012","B.tech CSE"};
        displayStudent(student);
    }

    /*
    * FUNCTION DISPLAYSTUDENT IS FUNCTION THAT RETURNS NO VALUE TO THE CALLER SINCE IT HAS VOID
    * FUNCTION DISPLAYSTUDENT IS FUNCTION THAT HAS ONE PARAMETER WHICH TAKES AN ARRAY
    * FUNCTION DISPLAYSTUDENT IS HAVING STATIC KEYWORD SINCE IT IS IN MAIN CLASS
    * MAIN CLASS DOES NOT NEED OBJECT CLASS INITIALIZATION HENCE ALL FUNCTION GET STATIC KEYWORD
    * FOR ANY FUNCTION EXCEPT MAIN FUNCTION NEED TO BE CALLED TO PERFORM ITS TASK AS SHOW ON LINE 21
    * ANY FUNCTION CAN TAKE MORE THAN ONE PARAMETERS
    * CLASS CAN HAVE MORE THAN ONE FUNCTIONS*/
}