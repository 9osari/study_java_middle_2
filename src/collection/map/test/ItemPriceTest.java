package collection.map.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemPriceTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        //1000원일 상품 모두 출력
        List<String> list = new ArrayList<>();
        for (String string : map.keySet()) {
            if(map.get(string) == 1000) {
                list.add(string);
            }
        }
        System.out.println(list);
    }
}
