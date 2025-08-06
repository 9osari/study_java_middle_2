package collection.compare;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain2 {
    public static void main(String[] args) {
        Integer[] arr = {3,2,1};
        System.out.println(Arrays.toString(arr));

        System.out.println("Comparator 비교");
        Arrays.sort(arr, new AscCompartor());
        System.out.println("AscCompartor: " + Arrays.toString(arr));

        Arrays.sort(arr, new DescCompartor());
        System.out.println("DescComparator: " + Arrays.toString(arr));

        Arrays.sort(arr, new AscCompartor().reversed()); //Desc와 같다
        System.out.println("reversed: " + Arrays.toString(arr));

    }

    public static class DescCompartor implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println( "o1 = " + o1 + ", o2 = " + o2);
            return ((o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1)) * -1;
        }
    }

    public static class AscCompartor implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println( "o1 = " + o1 + ", o2 = " + o2);
            return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1);
        }
    }
}
