package Assigment2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strings = new String[6];
        String temp = "";
        int arrLen = 6;

        for (int i = 0; i < arrLen; i++) {
            strings[i] = sc.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) {
                temp = strings[i];
            }
            for (int j = i + 1; j < strings.length; j++) {
                if (temp.equals(strings[j])) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }

        sc.close();
    }
}
