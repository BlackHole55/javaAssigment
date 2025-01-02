package Assigment2;

public class Task24 {
    public static void main(String[] args) {
        signIn("user");
    }
    public static void signIn(String username){
        if (username == "user") {
            return;
        }
        System.out.println("Welcome " + username);
        System.out.println("Missed you very much, " + username);
    }
}
