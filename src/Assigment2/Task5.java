package Assigment2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        if (N % 2 == 1) {
            for (int i = 0; i < N; i++) {
                System.out.println(numbers[i]);
            }
        }

        for (int i = N - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
        
        sc.close();
    }
}
