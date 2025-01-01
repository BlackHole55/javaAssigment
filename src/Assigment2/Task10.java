package Assigment2;

import java.util.Scanner;

public class Task10 {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int rows = sc.nextInt();

        multiArray = new int[rows][];

        for(int i = 0; i < rows; i++) {
            int columns = sc.nextInt();
            multiArray[i] = new int[columns];
        }

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
