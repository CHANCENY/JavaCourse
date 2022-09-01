import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //WORKING WITH SWITCH STATEMENT TO BUILD WEATHER APP

        //scanner object for temperature
        Scanner tempScanner = new Scanner(System.in);

        System.out.print("Enter Temperature: ");
        int temperature =(int) tempScanner.nextDouble();

        //Switch statement syntax switch(variable) { case : ......statement block.... break}
        switch (temperature)
        {
            case 20: System.out.println("Temperature is slightly warm today"); break;
            case 30: System.out.println("Temperature is warm today "); break;
            case 40: System.out.println("Temperature is slightly hot today "); break;
            case 50: System.out.println("Temperature is hot today "); break;
            case 55: System.out.println("Temperature is very hot today "); break;
            case 60: System.out.println("Temperature is extreme hot today "); break;
            default:
                if (temperature < 20)
                {
                    System.out.println("Temperature is cold today "); return;
                }
                else if (temperature > 20 && temperature < 30) {
                    System.out.println("Temperature looks like it will be warm today "); return;
                }
                else if(temperature > 30 && temperature < 40)
                {
                    System.out.println("Temperature looks like it will be hot today "); return;
                }
                else if(temperature > 40 && temperature < 50)
                {
                    System.out.println("Temperature looks like it will be very hot today drink cold water"); return;
                }
                else if(temperature > 50 && temperature < 60)
                {
                    System.out.println("Temperature looks like it will be extremely hot today stay indoors"); return;
                }
                else{
                    System.out.println("Temperature is beyond 60 degrees today world is burn.... global warming is real"); return;
                }
        }
        /*
        * THIS PROGRAM IS SHOWING THAT SWITCH STATEMENT CAN BE USED FOR DECISION-MAKING IN PROGRAM BUT SWITCH HAS ITS DRAW BACKS
        * SWITCH REQUIRES SINGLE SWITCHING CONDITION EITHER INT, STRING, ETC
        * IN SWITCH THE USE OF LOGICAL OPERATOR IS NOT ALLOWED EG && FOR AND || FOR OR
        * IN SWITCH THE DEFAULT SECTION IS ADDED TO HANDLE THE CASES WHICH HAVE NOT BE DEFINED IN SWITCHING CASES
        * THIS PROGRAM ALSO IS SHOW THAT WITHIN THESE CASE THE USE OF IF STATEMENT ELSEIF STATEMENT OR ELSE STATEMENT CAN
        * BE IMPLEMENTED IF REQUIRED
        *
        * BREAK STATEMENT PREVENT THE EXECUTE OF FLOW TO EXECUTE OTHER BLOCK OF CODE BELOW THE DESIGNATED BLOCK*/


    }
}