

public class Main {
    public static void main(String[] args) {

        //working with numbers conversions

        //follow heirachicl -> double -> float -> long -> int -> short -> byte

        int x = 9;
       //change datatype of values in primitive way
        float y = x;
        double z = y;

        char letter = 65;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(letter);

        //narrowing conversion
        double bigNumber = 100.53988776;
        int smallNumber = (int) bigNumber;
        float samllNumber2 = (float) bigNumber;
        byte smalNumber3 = (byte) bigNumber;
        short samllNumber4 = (short) bigNumber;
        System.out.println(smallNumber);
        System.out.println(samllNumber2);
        System.out.println(smalNumber3);
        System.out.println(samllNumber4);

        //strings to numbers unboxing
        String numberWord = "127.687699694".toString();

        //if string number  is in float but want to change to int first change string to float or double then
        // float or double values changed change them to int
        int intValue = (int) Float.parseFloat(numberWord);
        System.out.println(intValue);

        //this one changing string of float value direct to float or double  will work
        System.out.println(Float.parseFloat(numberWord));
        System.out.println(Double.parseDouble(numberWord));

        //for these follow process of change to int but in this final change will be to short and byte
        //make sure the final values doesnt go beyond max value of these datatypes
        System.out.println( (short) Float.parseFloat(numberWord));
        System.out.println( (byte) Float.parseFloat(numberWord));

    }
}