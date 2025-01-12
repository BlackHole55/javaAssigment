package Assigment3;

public class Task6 {
    public static void main(String[] args) {

    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    class Screen implements Selectable, Updatable {
        public void onSelect() {

        }

        public void refresh() {
            
        }
    }
}
