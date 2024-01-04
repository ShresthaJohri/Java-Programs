import java.util.*;
//Largest of 3 n0.

public class Largest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>=b && a>=c)
        {
         System.out.println("Largest of 3 is a :"+a);
        }
        else if (b>=c)
        {
          System.out.println("Largest of 3 is b :"+b);   
        }
        else
        {
          System.out.println("Largest of 3 is c :"+c);
        }
        sc.close();
    }
}
