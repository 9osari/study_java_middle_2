package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequenctTest2 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        Map<String, Integer> map = new HashMap<>();
        String[] s = text.split(" ");
        for (String string : s) {
            /*Integer count = map.get(string);
            if (count == null) {
                count = 0;
            }
            count++;
            map.put(string, count);*/

            map.put(string, map.getOrDefault(string, 0) + 1);
        }
        System.out.println(map);
    }
}
