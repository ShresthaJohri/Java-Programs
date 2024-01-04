package FunctionPrograms;
// FUNCTION OVERLOADING USING DATA TYPES
public class Overloading2 {
    public static int sum(int a, int b) {    //function to calculate int sum
        return a+b;
    }
public static float sum(float a, float b) {      //function to calculate float sum
        return a+b;
    }

public static void main(String[] args) {
     
    System.out.println("The sum of a and b is : " + sum(5,3));
    System.out.println("The sum of a, b and c is : " + sum(3.2f,3.1f)); 
    
   }
}
