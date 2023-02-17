/*
Question : Given a positive integer n, generate an n*n matrix filled with elements from 1 to n^2 in spiral order.
 */
import java.util.Scanner;
public class Main {
    static void PrintMethod(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public  static void  SpiralOrder(int a){
        int count = 1;
        int[][] matrix = new int[a][a];
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[i].length;j++){
                    matrix[i][j]=count++;
                }
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
