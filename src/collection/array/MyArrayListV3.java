package collection.array;

import java.util.Arrays;

public class MyArrayListV3 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV3() {
        //기본생성자를 쓰면 배열 길이 = 5
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV3(int initialCapacity) {
        //생성할때 크기를 다르게 만들고 싶으면 이 생성자 사용
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    //리스트에 데이터를 추가 데이터 추가하면 size +1
    public void add(Object e) {
        //코드 추가
        if(size == elementData.length){
            grow();
        }
        elementData[size] = e;
        size++;
    }

    public void add(int index, Object e) {
        if(size == elementData.length){
            grow();
        }
        //데이터 이동
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }

    //코드 추가 요소의 마지막부터 Index까지 오른쪽으로 밀기
    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
    }

    public Object remove(int index) {
        Object oldValue  = get(index);
        shiftLeftFrom(index);

        size--;
        elementData[size] =  null;
        return oldValue;
    }

    private void shiftLeftFrom(int index) {
        for (int i = index; i < size -1; i++) {
            elementData[i] = elementData[i + 1];
        }
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2; //길이가 2배
        //배열을 새로 만들고 기존 배열을 새로운 배열로 복사
        elementData = Arrays.copyOf(elementData, newCapacity);
    }



    public Object get(int index) {
        //인덱스에 있는 항목 조회
        return elementData[index];
    }

    public Object set(int index, Object element) {
        //인덱스에 있는 항목 변경.. 값을 교체하지만 기존값을 반환해준다.
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;    //기존 값 반환
    }

    //검색 기능
    public int indexOf(Object o) {
        for(int i = 0; i < size; i++) {
            if(o.equals(elementData[i])) {
                return i; //데이터 있으면 위치 반환
            }
        }
        return -1; //없는 경우 -1 반환
    }

    public String toString() {
        //[1,2,3,null,null] //size = 3
        //[1,2,3] // size = 3
        return Arrays.toString(Arrays.copyOf(elementData, size)) + //size 크기의 배열을 새로 만든다
                " size = " + size + " ," + "capacity = " + elementData.length; //배열의 사이즈만큼 카피 후 출력 null 빼줌
    }

}
