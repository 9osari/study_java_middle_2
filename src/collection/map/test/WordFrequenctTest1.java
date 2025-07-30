package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequenctTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        Map<String, Integer> map = new HashMap<>();
        String[] s = text.split(" ");
        for (String string : s) {
            Integer count = map.get(string);
            if (count == null) {
                count = 0;
            }
            count++;
            map.put(string, count);
        }
        System.out.println(map);
    }
}
