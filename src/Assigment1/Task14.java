package Assigment1;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();
        int multiple = sc.nextInt();
        int result = 0;

        for (int i = start; i < end; i++) {
            if (i % multiple == 0) {
                result += i;
            }else {
                continue;
            }
        }

        System.out.println(result);

        sc.close();
    }
}