package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimpleHistoryTest {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        stack.push("유튜브");
        stack.push("구글");
        stack.push("페이스북");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
