//WORKING WITH ENCAPSULATION

import java.util.Arrays;
import java.util.Objects;

class Students{

    //SETTER this function used to assign the values of studentNames attribute
    public void setStudentNames(String[] studentNames) {
        this.studentNames = studentNames;
    }

    //SETTER this function used to assign the values of studentRollNumbers attribute
    public void setStudentRollNumbers(String[] studentRollNumbers) {
        this.studentRollNumbers = studentRollNumbers;
    }

    //SETTER this function used to assign the values of Sizes attribute
    public void setSizes(int sizes) {
        this.sizes = sizes;
        capacity = this.sizes;
    }

    //GETTER this is function used to return values of attribute capacity
    public int getCapacity() {
        return capacity;
    }

    //GETTER this is function used to return values of attribute sizeRoll
    public int sizeRoll(){
        int size = 0;
        for (int i = 0; i < this.studentRollNumbers.length; i++){
            if(!Objects.equals(this.studentRollNumbers[i], null)){
                size++;
            }
        }
        return size;
    }

    //GETTER this is function used to return values of attribute sizeName
    public int sizeName(){
        int size = 0;
        for (int i = 0; i < this.studentNames.length; i++){
            if(!Objects.equals(this.studentNames[i], null)){
                size++;
            }
        }
        return size;
    }

    //GETTER this is function used to return index of given name in studentNames
    public int indexOfStudentName(String name){
        for (int i = 0; i < this.studentNames.length; i++){
            if(Objects.equals(this.studentNames[i], name)){
                return i;
            }
        }
        return -1;
    }
    private int sizes = 0;
    public int capacity = 0;

    //GETTER this is function used to return values of attribute studentNames
    public String[] getStudentNames() {
        return studentNames;
    }

    //GETTER this is function used to return values of attribute studentRollNumbers
    public String[] getStudentRollNumbers() {
        return studentRollNumbers;
    }

    private String[] studentNames = new String[sizes];
    private String[] studentRollNumbers = new String[sizes];


}


public class Main {
    public static void main(String[] args) {

        Students students = new Students();
        students.setSizes(200);
        students.setStudentNames(new String[]{"chance", "marcos","emma","rose","hanna","rohan"});
        students.setStudentRollNumbers(new String[]{"3012","3029","3015","3013","3019","3017","3067","3014"});

        System.out.println(Arrays.toString(students.getStudentNames()));
        System.out.println(Arrays.toString(students.getStudentRollNumbers()));

        System.out.println("Full capacity: "+ students.capacity);
        System.out.println("Size roll: "+ students.sizeRoll());
        System .out.println("Size names: "+ students.sizeName());
        System .out.println("Index of marcos: "+ students.indexOfStudentName("hanna"));



    }
}