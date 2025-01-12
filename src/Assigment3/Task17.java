package Assigment3;

public class Task17 {
    public static void main(String[] args) throws Exception {

    }

    public interface Animal {
        String getColor();
        Integer getAge();
    }
    
    public abstract static class Fox implements Animal {
        public String getName() {
            return "Fox.";
        }
    }
}
