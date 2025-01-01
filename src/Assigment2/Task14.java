package Assigment2;

import java.util.Scanner;

public class Task14 {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        sc.close();

        int min_row = array[0][0] + array[0][1] + array[0][2];
        int sum_row = 0;

        int min_col = array[0][0] + array[1][0] + array[2][0];
        int sum_col = 0;

        int result = 0;

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                sum_row += array[i][j];
            }

            for(int j = 0; j < array[i].length; j++) {
                sum_col += array[j][i];
            }

            if (min_row > sum_row) {
                min_row = sum_row;
            }

            if (min_col > sum_col) {
                min_col = sum_col;
            }
        }

        if (min_row < min_col) {
            result = min_row;
        }
        else {
            result = min_col;
        }

        System.out.println("Min sum of elements: " + result);
    }
}
