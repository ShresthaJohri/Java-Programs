package FunctionPrograms;
// FUNCTION OVERLOADING USING PARAMETERS
import java.util.*;
public class Overloading {
    public static int sum(int a,int b) {      // function to calculate sum of 2 no.s
        return a+b;
    }

public static int sum(int a,int b,int c ) {     //  function to calculate sum of 3 no.s
        return a+b+c;
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Print the sunm of :");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    System.out.println("The sum of a and b is : " + sum(a,b));
    System.out.println("The sum of a, b and c is : " + sum(a,b,c)); 
    sc.close();
}
}
