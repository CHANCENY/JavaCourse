public class Main {
    public static void main(String[] args) {

        //WORKING WITH LOOPS -----WHILE LOOP

        //example

        int flag = 0;

        //while loop syntax while(condition){....block....}
        while (flag <= 10)
        {
            //HERE WE CAN DO ANYTHING THAT WE WANT TO BE EXECUTED REPEATEDLY PER CONDITION PROVIDED
            System.out.println(flag);
            flag++;
        }

        //IF STATEMENT CAN BE INSIDE WHILE LOOP EXP
        int x = 1;

        while (x < 50)
        {
            if(x == 20){
                System.out.println("We are at 20");
            } else if (x < 20) {
                System.out.println("We are below 20");
            }else if (x > 20) {
                System.out.println("We are above 20");
            }
            x++;
        }

        //WHILE LOOP CAN BE TERMITE BY FOR AND IN WHILE LOOP SKIPPING CAN HAPPEN EXP
        int y = 0;
        while (y <= 10)
        {
            if(y == 5){
                //CONTINUE HERE WILL MAKE THE  EXECUTION TO SKIP AT 5 STRAIGHT TO 6
               // continue;

                //BREAK CAN ALSO BE USED TO TERMINATE LOOP
                break;
            }
            else if(y <= 9){
                System.out.print(y+" ,");
            }
            else if(y == 10){
                System.out.print(y);
            }
            y++;
        }

        //FOREVER WHILE LOOP
        while (true){
            System.out.println("Running....");
        }

        /*
        * WHILE LOOP IS USED WHEN NUMBER OF TURN NOT KNOWNS IN ADVANCE
        * IN CASE TURNS ARE KNOWN WE CAN DIRECTLY SPECIFY IN OUR CODE
        * IN CASE TURNS ARE NOT KNOWN THEN USE FORVER LOOP WHICH WILL BREAK OUT WHEN SPECIFIED
        * CONDITION HAS REACHED DURING EXECUTION OF WHILE
        * NOTE: ALWAYS SPECIFY BREAKING CONDITION IN WHILE LOOP TO AVOID CRUSHING COMPUTERS
        * NOTE: IN LOOP WHERE COUNTER IS USED MAKE SURE THE INCREMENTION OR DECREMATION IS INCLUDE TO
        * AVOID FOREVER LOOP
        * CONTINUE STATEMENT CAN BE SKIPPED ALSO WHEN YOU WANT TO SKIP AT CERTAIN LEVEL OF LOOP BY JUST
        * NOT DOING ANYTHING IF CONDITION HAS OCCURED*/
    }
}