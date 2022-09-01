import java.util.Arrays;
import java.lang.Math;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //WORKING WITH ARRAYS

        //declaring arrays  datatype[] name of array = new datatype[size]
        int[] numbers = new int[15];

        //FUNCTIONS USED IN ARRAY

        //add element in array
        numbers[0] = 12;
        numbers[1] = 38;
        numbers[2] = 20;
        numbers[3] = 200;
        numbers[4] = 21;

        //ELEMENT CAN ALSO BE ADDED INTO ARRAY DURING DECLARATION
        int[] fixedArray = {3, 9, 6, 90, 58, 483};

        System.out.println(Arrays.toString(numbers));

        //change value or element at particular position
        numbers[2] = 59;

        System.out.println("updated values is 59: "+Arrays.toString(numbers));

        //find size
        System.out.println("Array size: "+numbers.length);

        //removing element using for loop exp remove at 3 (200) NOTE USE THIS ONLY WHEN YOU KNOW WHAT TO DELETE
        //BUT YOU DON'T KNOW THE POSITION

        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] == 200)
                numbers[i]=0;
        }

        //how to print out entire array we use class Array
        System.out.println("Value 200 removed: "+ Arrays.toString(numbers));

        //filtering all non zeros in array NOTE FROM LINE 41 TO LIN 54 THIS CODE CAN BE GROUP INTO A FUNCTION
        //AND LIST MADE ON LINE 53 ITS ELEMENT CAN BE CHANGE TO INT TYPE
        String nonZeros = new String();
        for(int number: numbers)
        {
            if(number != 0){
                nonZeros = nonZeros + number+",";
            }
        }

        //from this string made for filtering the non zeros form array we can generate an array
        System.out.println("non zero string: "+nonZeros);
        String[] list = nonZeros.split(",");

        System.out.println("non zero string list: "+ Arrays.toString(list));

        System.out.println("Size of list non Zero made: "+ list.length);

        //MULTI DIMENSIONAL ARRAY DECLARATION
        int[][] martices = new int[4][4];

        //adding values into multi dimensional array
        martices[0][0] = 8;
        martices[1][1] = 4;
        martices[2][2] = 49;
        martices[3][3] = 11;


        //to print out all obj of multi-dimensional array we use Array.deepToString()
        System.out.println("multi-dimensional"+ Arrays.deepToString(martices));

        //finding size of multi-dimensional array
        System.out.println(martices.length);

        //updating can happen also in multi
        martices[1][1] = 500;
        System.out.println("multi-dimensional updated: "+ Arrays.deepToString(martices));

        //put values in multi using for loop exp  using Random class to generate values or element
        //NOTE for easy use of multi-d make sure the number of rows are the same as number of columns
        Random element = new Random();

        int[][] arrayMatrix = new int[5][5];
        for (int i = 0; i < arrayMatrix.length; i++)
        {
           for(int j = 0; j < arrayMatrix.length; j++){
               arrayMatrix[i][j] = element.nextInt(50);
           }
        }
       System.out.println(Arrays.deepToString(arrayMatrix));

        //print out element of multidimensional in table form using for loop
        for (int i = 0; i < arrayMatrix.length; i++)
        {
           for (int j = 0; j < arrayMatrix.length; j++){
               System.out.print(arrayMatrix[i][j]+" ");
           }
           System.out.print("\n");
        }

        /*
        * ARRAY ARE COLLECTION OF DATA OF SAME DATATYPE
        * ARRAY SIZE CAN BE FOUND BY USING PROPERTY LENGTH
        * ARRAY ELEMENT CAN BE ACCESSED BY INDEXES
        * ARRAY ELEMENT CAN BE MODIFIED
        * ARRAY REQUIRES FIX SIZE DURING DECLARATION
        * ARRAY CAN BE INITIAL BY VALUES OR AS OBJECT WITH NEW KEYWORD
        * int[] fixedArray = {3, 9, 6, 90, 58, 483}; THIS ARRAY ITS SIZE WILL
        * BE ALLOCATE BY THE NUMBER OF ELEMENT IN TH ARRAY (6)*/
    }
}