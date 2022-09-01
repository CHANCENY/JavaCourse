public class Main {
    public static void main(String[] args) {
        //  WORKING WITH LOOP ------FOR LOOP

        //syntax of for loop for(statement 1; condition; increment){  .......block of code...}

       /*for (int i = 0; i < 10; i++){
            System.out.print("*");
        }

        //FOR LOOPS CAN BE NESTED TOGETHER EXP
       for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10 - i; j++){
                  System.out.print(j+" "); //replace * with j values
            }
            System.out.print("\n");
        }

        //i++ means increment also we can do decrement exp
       for (int i = 10; i >= 0; i--){
              System.out.print(i+" "); //replace * with j values
        }

        //WE CAN ALSO NESTED THIS FOR LOOP EXP
       for (int i = 10; i > 0; i--)
        {
            for (int j = 10; j - i >= 0; j--)
            {
                System.out.print(j+" "); //replace * with j values
            }
            System.out.print("\n");
        }


        //BREAK AND CONTINUE STATEMENT CAN ALSO BE USED TOGETHER WITH FOR LOOPS EXP
        for (int i = 0; i <= 50; i++)
        {
            if(i == 20){
               //IN CASE IF WE WANT TO SKIP AT 20 THE CONTINUE STATEMENT IS USED
               //IN CASE WE WANT SOMETHING SPECIAL TO HAPPEN WHEN WE ARE 20 THE WE DO IN THIS BLK
               //IN CASE WE WANT TO STOP THE LOOP EXECUTION WE USE BREAK STATEMENT
                //continue; //to skip  uncomment  here
                //break;    //to break out of loop uncomment here
                System.out.println("\nWe are at 20 position ["+i+"]");
            }
            System.out.print(i+" ");
        }

        //FOR LOOP ALSO HAVE SAME VARIANTS WHICH ARE EXCLUSIVELY USED IN ARRAYS EXP FOREACH LOOP AND FOR LOOP

        String[] list = {"chance","marcos", "emmanuel","mary","john","rose","hanna"};
        for (String name: list){
            System.out.println(name);
        }

        System.out.println("\n");
        for (String name :
                list) {
            System.out.println(name);
        }*/

        /*
        * NOTE FOR LOOP ARE HEAVY USED WHEN THE NUMBER OF TURNS THE LOOP WILL RUN ARE KNOWN
        * FOR LOOP ARE ALSO USED WHEN WORKING MULTI DIMENSIONAL ARRAYS WHERE NESTED FOR LOOP ARE APPLIED
        * UNLIKE WHILE LOOPS THE FOR LOOP COUNTER IS RECOMMENDED TO BE LOCAL EG FOR(INT I = 0)
        * CONTINUE STATEMENT IS USED TO SKIP OR JUMP TO NEXT TURN IN LOOP EXECUTION
        * BREAK STATEMENT IS USED TO BREAK OUT OF LOOP FOR ANY GIVEN CONDITION
        * CONDITION SHOULD BE VALID FOR LOOP TO EXECUTE PROPERLY TO AVOID FORVER EXECUTION WHICH WILL
        * CAUSE COMPUTER CRASH*/

    }
}