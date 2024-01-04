import java.util.*;
// PRINTING FLOYD'S TRIANGLE PATTERN
public class FloydTriangle {
    public static void floydTriangle(int n) {
        int count = 1;
        for(int i = 1; i <= n; i++)
    {
        for(int j = 1; j <= i; j++)
        {
            System.out.print(count+" ");
            count++;
        }
        System.out.println();

    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        floydTriangle(N);;
        sc.close();
    }
}
