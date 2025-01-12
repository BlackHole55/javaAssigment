package Assigment3;

public class Task11 {
    public static void main(String[] args) {

    }

    //can move
    public interface Movable {
        void move();
    }

    //can be eaten
    public interface Edible {
        void beEaten();
    }

    // might eat someone
    public interface Eat {
        void eat();
    }

    class Dog implements Movable, Eat{
        public void move() {

        } 

        public void eat() {

        }
    }

    class Cat implements Movable, Edible, Eat {
        public void move() {

        }

        public void eat() {

        }

        public void beEaten() {
            
        }
    }

    class Mouse implements Movable, Edible {
        public void move() {

        }

        public void beEaten() {

        }
    }
}
