package Assigment2;

public class Task23 {
    public static void main(String[] args) {
        int a = 6;
        int b = 7;
        int c = 1;

        String str1 = "Some ";
        String str2 = "One";

        double d = 4.2;
        double e = 5.0;

        boolean bool = true;

        UniversalMethod();
        UniversalMethod(str1);
        UniversalMethod(str1, str2);
        UniversalMethod(a);
        UniversalMethod(a, b);
        UniversalMethod(bool);
        UniversalMethod(a, str1);
        UniversalMethod(d);
        UniversalMethod(d, e);
        UniversalMethod(a, b, c);
    }

    public static void UniversalMethod() {
        System.out.println("A common mistake that people make when trying to design something completely foolproof is to underestimate the ingenuity of complete fools.");
    }
    
    public static void UniversalMethod(String str) {
        System.out.println(str);
    }

    public static void UniversalMethod(String str1, String str2) {
        System.out.println(str1 + str2);
    }
    
    public static void UniversalMethod(int a) {
        System.out.println(a);
    }

    public static void UniversalMethod(int a, int b) {
        System.out.println(a * b);
    }

    public static void UniversalMethod(boolean bool) {
        if (bool) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }

    public static void UniversalMethod(int n, String str) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    public static void UniversalMethod(double a) {
        System.out.println(a);
    }

    public static void UniversalMethod(double a, double b) {
        System.out.println(a + b);
    }

    public static void UniversalMethod(int a, int b, int c) {
        System.out.println((a + b) * c);
    }
}
