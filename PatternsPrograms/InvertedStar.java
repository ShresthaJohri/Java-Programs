import java.util.*;

public class InvertedStar {
    //PRINTING INVERTED STAR PATTERN
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number in how many lines you want your pattern : ");
        int n = sc.nextInt();
         for(int i=1; i<=n; i++)            //    for(int i=1; i<=n; i++)
        {
         for(int j=n; j>=i; j--)           //     for(int j=1; j<=n-i+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
