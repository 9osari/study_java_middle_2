package collection.list_study;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayEx1 {
    //배열을 리스트로 변경하기
    public static void main(String[] args) {
        int[] students = new int[3];

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < students.length; i++) {
            System.out.print("점수 입력: ");
            students[i] = sc.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();
        int total = 0;
        for(int i = 0; i < students.length; i++) {
            list.add(students[i]);
            total += students[i];
        }
        System.out.println(list);

        double average = (double) total / list.size();
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
