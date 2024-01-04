package ArraysPrograms;
import java.util.*;
// IMPLEMENTING LINEAR SEARCH  
public class LinearSearch {
    public static int linearSearch(int num[], int key) {
        for(int i = 0; i<num.length; i++)
        {
            if(num[i] == key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8 ,10, 12, 14, 16, 18};
        System.out.print("Enter the element you want to search : ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();                    // you can also pass key as int key = 10; 
        int index = linearSearch(num, key);

        if( index == -1)
        {
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index :" +index);
        }
        sc.close();
    }
}
