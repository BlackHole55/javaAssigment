package Assigment1;

public class Task12 {
    public static void main(String[] args) {
        int i = 1;
        int result = 0;
        
        while (i <= 100) {
            if (i % 3 == 0) {
                i++;
                continue;
            }
            result += i;
            i++;
        }

        System.out.println(result);
    }
}