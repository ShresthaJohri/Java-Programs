import java.util.*;
//PRINT REVERSE OF A NO. 
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number N");
        int N = sc.nextInt();
        while(N>0)
        {
            int lastdigit = N % 10;
            System.out.print(lastdigit);
            N = N / 10;
        }
        System.out.println();
        sc.close();
    }
}    