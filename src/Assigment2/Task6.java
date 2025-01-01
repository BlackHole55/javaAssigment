package Assigment2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        int max = numbers[0];

        for (int i = 0; i < N; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.print("\n" + max);
        
        sc.close();
    }
}
