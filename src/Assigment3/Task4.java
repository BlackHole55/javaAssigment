package Assigment3;

public class Task4 {
    public static void main(String[] args) {

    }

    interface CanRun {
        public void run();
    }

    interface CanSwim {
        public void swim();
    }

    abstract class Human implements CanRun, CanSwim{

    }
}
