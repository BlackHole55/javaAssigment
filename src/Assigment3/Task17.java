package Assigment3;

public class Task17 {
    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
            System.out.println(bigFox.getName());
            System.out.println(bigFox.getColor());
        }
        
        public interface Animal {
            String getColor();
        }
        
        public abstract static class Fox implements Animal {
            public String getName() {
                return "Fox.";
            }
        }
        
        public static class BigFox extends Fox {
            public String getColor() {
                return "Orange";
            }
        }
}
