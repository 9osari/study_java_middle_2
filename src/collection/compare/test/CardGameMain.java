package collection.compare.test;

public class CardGameMain {
    public static void main(String[] args) {
        Card card1 = new Card(1, "Heart");
        Card card2 = new Card(2, "Spade");
        System.out.println( card1.compareTo(card2));
    }
}
