//import java.util.*;
public class bubblesort{
public static void printArray (int arr[]){
for (int i = 0; i < arr.length; i++)
{
     System.out.print(arr[i]+" ");
}
  System.out.println();
}

public static void main (String arr[]){
    //bubble sort
int array[] = {9, 7, 5, 3, 2, 6, 1 };
for (int i = 0; i < array.length-1; i++)
{ 
    for (int j = 0; j < array.length- i -1; j++)
    { 
        if (array[j] > array[j+ 1])
        { 
            int temp = array[j]; 
            array[j] = array[j+1]; 
            array[j+1] = temp; 
        }
    }
}
 printArray(array);
}
}

