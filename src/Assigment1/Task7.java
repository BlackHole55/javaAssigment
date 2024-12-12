package Assigment1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int temperature = sc.nextInt();

        Boolean isHigh = temperature > 36;
        Boolean isLow = temperature < 36;

        if (isHigh) {
            System.out.println("The body temperature is high");
        }else if (isLow) {
            System.out.println("The body temoerature is low");
        }else {
            System.out.println("The body temperature is normal");
        }

        sc.close();
    }
}
