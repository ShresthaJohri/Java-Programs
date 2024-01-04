import java.util.*;
// PRINTING HALF PYRAMID WITH NUMBERS
public class HalfPyramidNum {
    public static void halfPyramidNums(int n) {
        
    for(int i = 1; i <= n; i++)
    {
        for(int j = 1; j <= n-i+1; j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();

    }
  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        halfPyramidNums(N);
        sc.close();
    }
}