package Lesson1;

public class Cats {

    public static void main(String[] args) {
        int catQty = 5;
        double catFeed = 10;

        System.out.println("The qty of cats: " + catQty);
        System.out.println("All food for cat: " + catFeed + " kg");

        double foodPerCat = catFeed/catQty;

        System.out.println("Qty of food for one cat per day: " + foodPerCat + " kg");
    }
}
