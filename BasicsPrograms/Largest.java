import java.util.*;
//Largest of 2 no.
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b)
        {
           System.out.println("Largest of 2 is a :" +a);
        }
        else
        {
           System.out.println("Largest of 2 is b :" +b);
        
        }
        sc.close();

    }
}
