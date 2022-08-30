public class Main {
    public static void main(String[] args) {

        //Working with string

        //declaratin of string
        String sentence = "My name is chance nyasulu";
        System.out.println(sentence);

        //declaration 2 in this way we create string object which is immutable
        String sentence2 = new String("   Hello there my name is chance   ");
        System.out.println(sentence2);

        //string functions  NOTE these function doesnt  change orignal string value they work on its copy
        System.out.println(sentence2.length());  //get total length
        System.out.println(sentence2.toLowerCase()); // change all characters to lower
        System.out.println(sentence2.toUpperCase());  //change all characters to upper
        System.out.println(sentence2.trim());   //remove all extra space in front and at end

        System.out.println(sentence2.substring(4)); // make sub string from given number index
        System.out.println(sentence2.substring(4,20));  // make sub string from given starting index to ending index
        System.out.println(sentence2 + sentence);  //connecting strings
        System.out.println(sentence2.concat(sentence)); //connecting strings

        System.out.println(sentence2.endsWith("y"));

        //we can chain these functions also

         System.out.println(sentence2.trim().endsWith("e"));
         System.out.println(sentence2.trim().length());
         System.out.println(sentence2.toUpperCase().trim().endsWith("E"));
         System.out.println(sentence2.trim().isEmpty());








    }
}