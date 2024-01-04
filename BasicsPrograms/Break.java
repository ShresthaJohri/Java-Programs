import java.util.Scanner;
//  PRINTING NO TILL USER ENTERS MULTIPLE OF 10
public class Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do
        {
           System.out.println("Enter your number :");
            int N = sc.nextInt();
            if (N % 10 == 0)
            {
                break;
            }
             System.out.println(N);
        }
            while (true);
        sc.close();
    }
}