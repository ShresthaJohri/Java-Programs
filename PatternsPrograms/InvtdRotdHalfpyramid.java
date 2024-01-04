import java.util.*;
// PRINTING INVERTED AND ROTATED HALF PYRAMID
public class InvtdRotdHalfpyramid {
    public static void invertedRoatedHalfPyramid(int n) {
        for(int i = 1; i <= n; i++)
        {
            // Spaces
            for(int j = 1; j <= n-i; j++)
            {
                System.out.print(" ");
            }


            // Stars
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        invertedRoatedHalfPyramid(N);
        sc.close();
    }
}
