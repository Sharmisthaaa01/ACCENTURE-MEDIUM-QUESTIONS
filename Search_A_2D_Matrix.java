
/*
   search a 2D matrix.

   Input => matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
   output =true
    the numbers are in ascending order
 */

package Mediumprb;
import java.util.*;

public class Search_A_2D_Matrix {
    public static boolean IS_2D_Matrix (int [][] matrix,int target, int row, int col) {

        //traverse the matrix row by row and col by col
        for(int i = 0; i <row; i++) {
            for(int j = 0; j <col; j++) {
                if(matrix[i][j] == target) {
                    System.out.println("element" +target + "found at pos : ("+ i + "," + j + ")");
                    return true;
                }
            }
        }
        // if the traverse result comes out wrong
        System.out.println("element" + " " + target + " " + "not found");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows in the matrix :");
        int row = sc.nextInt();

        System.out.println("Enter the number of columns in the matrix :");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];

        System.out.println("Enter the elements of the matrix :");
        for(int i = 0; i <row; i++) {
            for(int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // now input for the target element for search
        System.out.println("Enter the element to be searched");
        int target = sc.nextInt();

        // call the function
        IS_2D_Matrix(matrix,target,row,col);

        sc.close(); // close the scanner after use
    }
}
