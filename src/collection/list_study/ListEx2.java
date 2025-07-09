package collection.list_study;


import java.util.LinkedList;
import java.util.Scanner;

public class ListEx2 {
//사용자에게 n 개의 정수를 입력받아서 List 에 보관하고, 보관한 정수의 합계와 평균을 계산하는 프로그램
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LinkedList<Integer> list = new LinkedList<>();

    int sum = 0;

    System.out.println("n개의 정수를 입력하세요 (종료 0)");
    while(true) {
        int input = sc.nextInt();
        if(input == 0) break;
        list.add(input);
        sum += input;
    }
    double avg = (double) sum / list.size();
    System.out.println("입력한 정수의 합계: " + sum);
    System.out.println("입력한 정수의 평균: " + avg);

}
/**
 * n개의 정수를 입력하세요 (종료 0)
 * 1
 * 2
 * 3
 * 4
 * 5
 * 0
 * 입력한 정수의 합계: 15
 * 입력한 정수의 평균: 3.0
 */
}
