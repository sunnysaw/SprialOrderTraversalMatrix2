/*
Question : Given a positive integer n, generate an n*n matrix filled with elements from 1 to n^2 in spiral order.
 */
import java.util.Scanner;
public class Main {
    static void PrintMethod(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    static void SpiralOrder(int a){
        int count = 1,topRow = 0,bottomRow = a-1, leftcol = 0, rightCol = a-1;
        int[][] matrix = new int[a][a];
        while (count <= a * a){
            for (int j = leftcol; j <= rightCol && count <= a*a; j++){
                matrix[topRow][j] = count++;
            }
            topRow++;
            for (int i = topRow; i <= bottomRow && count < a*a; i++){
                matrix[i][rightCol] = count++;
            }
            rightCol--;
            for (int j = rightCol; j >= leftcol && count < a*a; j--){
                matrix[bottomRow][j] = count++;
            }
            bottomRow--;
            for (int i= bottomRow; i >= topRow && count < a*a; i--){
                matrix[i][leftcol] = count++;
            }
            leftcol++;
        }
        PrintMethod(matrix);
    }
    public static void main(String[] args) {
        int a,temp,temp2,temp3 = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for generating matrix :");
        a = sc.nextInt();
        temp = a;
        temp2 = temp * a;
        System.out.println("Firstly, printing the square of given number :");
        while (temp2 > 0){
            System.out.print(temp3 + " ");
            temp3++;
            temp2--;
        }
        System.out.println();
        System.out.println("Now, printing the final matrix of n*n :");
        SpiralOrder(a);
    }
}