package Assigment2;

public class Task28 {
    public static void main(String[] args) {
        int[] array = {15,64,9,51,42};

        printSqrt(array);
    }
    public static void printSqrt(int[] array) {
        String sqrtStr = "The square root for the number ";
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double elementSqrt = Math.sqrt(element);

            System.out.println(sqrtStr + element + " equals " + elementSqrt);
        }
    }
}