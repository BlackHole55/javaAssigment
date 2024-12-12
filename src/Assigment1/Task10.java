package Assigment1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String stopWord = "ENTER";
        int result = 0;

        while (sc.hasNextInt()) {
            result += sc.nextInt();
            sc.nextLine();
        }
        
        String input = sc.nextLine();

        if (input.equals(stopWord)) {
            System.out.println(result);
        }

        sc.close();
    }
}
