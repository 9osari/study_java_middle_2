package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        //학생 성적 데이터 추가
        map.put("studentA", 90);
        System.out.println(map);

        map.put("studentA", 100); //같은 키에 저장시 기존 값 교체
        System.out.println(map);

        //키가 있는지?
        boolean containsKey = map.containsKey("studentA");
        System.out.println("containsKey = " + containsKey);

        //특정 학생의 값 삭제
        map.remove("studentA");
        System.out.println(map);
    }
}
