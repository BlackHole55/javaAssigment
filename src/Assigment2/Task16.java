package Assigment2;

import java.util.Scanner;

public class Task16 {
    public static char[][] array;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int height = sc.nextInt();

        sc.close();

        array = new char[height][];

        for(int i = 1; i <= array.length; i++) {
            array[i - 1] = new char[i + (i - 1)];
        }

        for(int i = 0; i < array.length; i++) {
            for(int j = height - i; j > 1; j--) {
                System.out.print(' ');
            }
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = '#';
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
