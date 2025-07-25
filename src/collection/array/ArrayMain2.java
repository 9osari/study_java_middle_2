package collection.array;

import java.util.Arrays;

/**
 * 배열의 특징
 */
public class ArrayMain2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));

        //배열의 첫번째 위치에 추가
        //기본 배열의 데이터를 한 칸씩 뒤로 밀리고 배열의 첫번째 위치에 추가
        System.out.println("배열의 첫번째 위치에 3 추가 O(n)");
        int newVal = 3;
        addFirst(arr, newVal);
        System.out.println(Arrays.toString(arr));

        //index 위치에 추가
        //개본 배열의 데이터를 한 칸씩 뒤로 밀고 배열의 Index 위치에 추가
        System.out.println("배열의 index(2) 위치에 4 추가 O(n)");
        int index = 2;
        int value = 4;
        addAtIndex(arr, index, value);
        System.out.println(Arrays.toString(arr));

        System.out.println(" 배열의 마지막 위체에 5 추가 O(1)");
        addLast(arr, 5);
        System.out.println(Arrays.toString(arr));

        /**
         * 배열의 최대 단점은 배열의 크기를 생성전에 미리 정해야 한다...
         */
    }

    private static void addFirst(int[] arr, int newVal) {
        for (int i = arr.length -1 ; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = newVal;    //연산이 끝난 후
    }

    private static void addAtIndex(int[] arr, int index, int value) {
        for(int i = arr.length -1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
    }

    private static void addLast(int[] arr, int newValue) {
        arr[arr.length - 1] = newValue;
    }
}
