package ArraysPrograms;
// PRINTING THE UPDATED VALUE MARKS
public class Abasic {
    public static void update(int marks[] , int nonchangable) { 
        nonchangable = 10;  // Array ko as argument lega 
        for(int i = 0; i <marks.length; i++)  
        {
            marks[i] = marks[i] + 1;
        } // we are going to every index of array one by one
    }
    public static void main(String[] args) {
        int marks[] = {98, 99, 100};
        int nonchangable = 5;
        update(marks , nonchangable);
        System.out.println(nonchangable); // value will not change it will print 5 only

        // To print our new marks 
        for(int i = 0; i <marks.length; i++)  
        {
            System.out.print(marks[i]+ " ");
        }
        System.out.println();
    }
}
