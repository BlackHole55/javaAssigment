package Assigment2;

public class Task4 {
    public static int[] firstArray = new int[]{0, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {
        int firstArrLen = firstArray.length;
        int secondArrLen = secondArray.length;

        int j = 0;

        resultArray = new int[firstArrLen + secondArrLen];

        for (int i = 0; i < firstArrLen; i++) {
            resultArray[i] = firstArray[i];
        }
        for (int i = firstArrLen; i < (secondArrLen + firstArrLen); i++) {
            resultArray[i] = secondArray[j];
            j++;
        }

        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
}