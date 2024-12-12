package Assigment1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the outside temperature: ");
        
        int temperature = sc.nextInt();

        if (temperature >= 0) {
            System.out.println("It's warm outside");
        }
        else {
            System.out.println("It's cold outside");
        }

        sc.close();
    }
}
