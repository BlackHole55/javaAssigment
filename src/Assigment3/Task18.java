package Assigment3;

import java.util.ArrayList;
import java.util.List;

public class Task18 {
    public static void main(String[] args) {
        List<Person> plot = new ArrayList<Person>();

        plot.add(new Person("Repka", "Repka"));
        plot.add(new Person("Dedka", "Dedku"));
        plot.add(new Person("Babka", "Babka"));
        plot.add(new Person("Granddaughter", "Granddaughter"));

        RepkaStory.tell(plot);
    }
    
    public static class Person implements RepkaItem {
        private String name;
        private String namePadezh;
        
        public Person(String name, String namePadezh) {
            this.name = name;
            this.namePadezh = namePadezh;
        }
        
        public String getName() {
            return name;
        }
        
        public void setName(String name) {
            this.name = name;
        }
        
        public String getNamePadezh() {
            return namePadezh;
        }
        
        public void setNamePadezh(String namePadezh) {
            this.namePadezh = namePadezh;
        }

        public void pull(Person first, Person second) {
            System.out.println(second.name + " for " + first.namePadezh);
        }
    }

    public interface RepkaItem {
        public String getNamePadezh();
    }

    public class RepkaStory {
        static void tell(List<Person> items) {
            Person first;
            Person second;

            for (int i = items.size() - 1; i > 0; i--) {
                first = items.get(i - 1);
                second = items.get(i);
                first.pull(first, second);
            }
        }
    }
}
