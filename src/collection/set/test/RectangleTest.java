package collection.set.test;

import java.util.HashSet;

public class RectangleTest {
    public static void main(String[] args) {
        HashSet<Rectangle> rectanglesSet = new HashSet<>();
        rectanglesSet.add(new Rectangle(10, 10));
        rectanglesSet.add(new Rectangle(20, 20));
        rectanglesSet.add(new Rectangle(20, 20));

        for  (Rectangle rectangle : rectanglesSet) {
            System.out.println("rectangle: " + rectangle);
        }
    }
}
