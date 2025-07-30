package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {

    /**
     * 영어 단어를 입력하면 한글 단어를 찾아주는 영어 사전
     */
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("==단어 입력 단계== ");

        while(true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q') : ");
            String eng = scanner.nextLine();
            if(eng.equals("q")) {
                break;
            }

            System.out.print("한글 뜻을 입력하세요: ");
            String kor = scanner.nextLine();

            //저장
            dictionary.put(eng, kor);
        }

        System.out.println("==단어 검색 단계==");
        while(true) {
            System.out.print("찾을 영어 단어를 입력하세요 (<종료는> 'q') : ");
            String searchEng = scanner.nextLine();
            if(searchEng.equals("q")) {
                break;
            }

            String dicKor = dictionary.get(searchEng);

            if(dicKor == null) {
                System.out.println(searchEng + " 은(는) 사전에 없는 단어입니다.");
            } else {
                System.out.println(searchEng + " 뜻: " + dicKor);
            }

        }
    }
}
