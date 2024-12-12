package Assigment1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if (age < 20 || age > 60) {
            System.out.println("you don't have to work");
        }

        sc.close();
    }
}
