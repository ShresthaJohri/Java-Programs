package ArraysPrograms;

public class Reverse {
    public static void reverse(int n[]) {
        int first = 0, last = n.length - 1;
        while (first < last) {
            //swap
            int temp = n[last];
            n[last] = n[first];
            n[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int n[] = {5, 6, 7, 3, 7, 8, 10};
        reverse(n);
        //print array
        for(int i = 0; i < n.length; i++)    
        {
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }
}
