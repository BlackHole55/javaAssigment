package Assigment3;

public class Task2 {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }
    
    public interface CanMove {
        public void move();
    }
    
    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanMove, CanEat {
        public void move() {

        }

        public  void eat() {

        }
    }
    
    public class Duck implements CanFly, CanMove, CanEat {
        public void fly() {

        }

        public void move() {

        }

        public  void eat() {

        }
    }
    
    public class Car implements CanMove {
        public void move() {

        }
    }
    
    public class Airplane implements CanFly, CanMove {
        public void fly() {

        }

        public void move() {
            
        }
    }
}
