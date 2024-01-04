package ArraysPrograms;
//import java.util.*;
// IMPLEMENTING BINARY SEARCH 
public class BinarySearch {
public static int binarySearch(int num[], int key) {
    int start = 0, end = num.length - 1; 
    while(start <= key)
    {
        int mid = (start + end)/2;
        if(num[mid] == key)
        {
            return mid;
        }
        if(num[mid] < key) // right
        {
            start = mid + 1;
        }
        else{
            end = mid - 1;  //left
        }
    }
    return -1;
        
    }
public static void main(String[] args) {
    int num[] = {8, 7, 4, 10, 5, 1, 3, 14};
   // System.out.print("Enter the element you want to search : ");
       // Scanner sc = new Scanner(System.in);
        int key = 23;//sc.nextInt();                     
        System.out.println("Element found at index :" +binarySearch(num, key));
       // sc.close();
}
}
