package Assigment2;

import java.util.Scanner;

public class Task13 {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        sc.close();

        int max = array[0][0];

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }

        System.out.println("Max element: " + max);
    }
}
