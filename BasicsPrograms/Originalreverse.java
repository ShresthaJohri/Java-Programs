import java.util.Scanner;
// REVERSING THE ORIGINAL NO. ITSELF  
public class Originalreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number N");
        int N = sc.nextInt();
        int rev = 0;
        while(N>0)
        {
            int lastdigit = N % 10;
            rev = (rev*10)+ lastdigit;
            N = N / 10;
        }
        System.out.println(rev);
        sc.close();
    }
}
