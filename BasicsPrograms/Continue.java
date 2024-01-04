import java.util.Scanner;
// PRINTING NO EXCEPT THE MULTIPLE OF 10
public class Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do
        {
           System.out.print("Enter your number :");
           int N = sc.nextInt();
        
            if (N % 10 == 0)
            {
                continue;
            }
             System.out.println(N);
        }
    
            while (true);
        
    }
}     
        