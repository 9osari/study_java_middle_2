package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("n개의 정수 입력");
        while (true) {
            int input = sc.nextInt();
            if(input == 0) {
                break;
            }
            list.add(input);
        }
        System.out.println("출력");
        int total = 0;
        double avg = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        avg = (double) total / list.size();
        System.out.println("입력한 정수의 합계 : " + total);
        System.out.println("입력한 정수의 평균 : " + avg);
    }
}
