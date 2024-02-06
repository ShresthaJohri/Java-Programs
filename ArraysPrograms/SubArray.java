package ArraysPrograms;

public class SubArray {
    public static void printSubarray(int n[]) {
        int ts = 0;
        for(int i = 0; i < n.length; i++)
        {
            int start = i;     //  OR  //i
            for(int j = i; j < n.length; j++)  // j = i bcz we need single element array also 
            {
                int end = j;  //     or  //j
                for(int k = start; k <= end; k++){   // just for print
                    System.out.print(n[k]+" ");
                }
                ts++;
            System.out.println();
            }
            System.out.println();
        }
         System.out.println("total subarrays = " +ts);
    }
    public static void main(String[] args) {
        int n[] = {4, 6, 8, 0, 1, 4 , 6};
        printSubarray(n);
    }
}
