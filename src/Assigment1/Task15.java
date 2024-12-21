package Assigment1;

public class Task15 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == i || j == (10 - (i + 1))) {
                    System.out.print(8);
                }else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}