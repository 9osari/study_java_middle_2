package collection.list.test.ex1;

import java.util.ArrayList;

public class ListEx1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(90);
        list.add(80);
        list.add(70);
        list.add(60);
        list.add(50);

        int listTotal = total(list);
        double listavg = average(list);

        System.out.println("점수 총합: " + listTotal);
        System.out.println("점수 평균: " + listavg);
    }

    public static int total(ArrayList<Integer> list) {
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        return total;
    }

    public static double average(ArrayList<Integer> list) {
        double average = 0;
        for (int i = 0; i < list.size(); i++) {
            average += list.get(i);
        }
        return average / list.size();
    }
}
