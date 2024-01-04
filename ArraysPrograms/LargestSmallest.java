package ArraysPrograms;
// FINDING THE LARGEST ELEMENT IN THE ARRAY
public class LargestSmallest {
    public static int getLargestSmallest(int num[]) {
        int lar = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for(int i =0; i<num.length; i++)
        {
            if(lar < num[i])
            {
                lar = num[i];   //Update largest if yes
            }
            if(small > num[i])
            {
                small = num[i];
            }
        }
        System.out.println("Smallest number is :" +small);
        return lar;
    }
    public static void main(String[] args) {
        int num[] = {4, 5, 9, 6, 8, 3};
        System.out.println("Largest number is :" + getLargestSmallest(num));
    }
}
