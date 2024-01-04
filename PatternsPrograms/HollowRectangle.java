import java.util.*;
// PRINTING HOLLOW RECTANGLE PATTERN
public class HollowRectangle {
    public static void hollowRect(int totr, int totc){  // total no. of rows and columns
        for(int i = 1; i <= totr; i++)
        {
            for(int j = 1; j <= totc; j++)
            // cell- (i,j)
            {
                if(i == 1|| i == totr || j == 1|| j == totc)
                {
                    System.out.print("*");
                }
                else
                {
                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the no. of rows");
            int r = sc.nextInt();
            System.out.println("Enter the no. of columns");
            int c = sc.nextInt();
            hollowRect(r, c);
            sc.close();
        }
    }

