package collection.list_study;

import java.util.LinkedList;
import java.util.Scanner;

public class ListEx1 {
    //사용자에게 n 개의 정수를 입력받아서 List 에 저장하고, 입력 순서대로 출력하자.
    //0 을 입력하면 입력을 종료하고 결과를 출력한다.
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 입력 0 => 종료");
        while (true) {
            int input = scanner.nextInt();
            if(input == 0) break;
            list.add(input);
        }
        System.out.println("종료");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            //마지막 인덱스가 아니면 , 출력
            if(i != list.size() - 1) System.out.print(", ");
        }
    }
}
