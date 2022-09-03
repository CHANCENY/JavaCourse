import java.util.Random;

public class Main {

    //WORKING WITH USER DEFINED FUNCTION THAT RETURNS VALUE

    public static String getStudentInfo(int index){

        //array consisting name roll course school
        String[] student ={"Chance Nyasulu","2001003012","B.tech CSE","Rayat bahra university"};

        //checking index pass as argument in parameters is not out of range of student array
        if(student.length > index)
        {
            return student[index];
        }
        else{
            return "Please provide proper index between (0 - 3)";
        }
    }

    public static int getIntNumber(){

        Random number = new Random();
        return number.nextInt(1000);
    }

    public static void main(String[] args) {

        //let call getStudentInfo pass argument of int
        //NOTE: this getStudentInfo can be called repeatedly using for loop while passing counter values as arg
        System.out.println(getStudentInfo(3));

       //WITH FOR LOOP
        for (int i = 0; i < 10; i++){
            System.out.println(getStudentInfo(i));
        }

        //avoiding to show instruction returns using if statement and break when counter is out of range
        for (int i = 0; i < 10; i++){
            String returnValue = getStudentInfo(i);

            if(returnValue.equals("Please provide proper index between (0 - 3)"))
            {
                break;
            }
            System.out.println(returnValue);
        }

        System.out.println("NUMBER RANDOM: "+getIntNumber());

        /*FUNCTION getStudentInfo IS FUNCTION THAT RETURN STRING VALUES AND TAKE PARAMETER OF INT TYPE
        * getStudentInfo HAS IF STATEMENT INSIDE WHICH ACT AS CONTROLLER TO AVOID RUNTIME ERROR THAT WILL LIKELY
        * CRASH OUR PROGRAM IF INDEX GIVEN IS BIGGER THAN SIZE OF ARRAY
        * NOTE: ANY FUNCTION CAN RETURN ANY VALUES AMONG ALL PRIMITIVE DATATYPE
        * NOTE: ITS NOT MANDATORY TO HAVE FUNCTION WITH PARAMETERS......CHECK getIntNumber FUNCTION
        * WHICH IS RETURN RANDOM WHOLE NUMBER WHEN CALLED*/
    }
}