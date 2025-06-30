package collection.arraylist_study;

import java.util.Arrays;

public class MyArrayListV2 {
    //리스트를 생성할때 사용하는 기본 배열의 크기
    private static final int DEFAULT_CAPACITY = 5;

    //다양한 타입의 데이터를 보관하기위해 object 사용
    Object[] elementData;
    int size;

    //기본 생성자 5로 초기화
    public MyArrayListV2() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    public int size() {
        return size;
    }

    //리스트에 데이터 추가 후 size++
    public void add(Object e) {
        if(size == elementData.length) {
            sizeUp();
        }
        elementData[size] = e;
        size++;
    }

    public void add(int index, Object e) {
        if(size == elementData.length) {
            sizeUp();
        }
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }

    //요소의 마지막 부터 index까지 오른쪽으로 밀기
    private void shiftRightFrom(int index) {
        for(int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
    }

    private void sizeUp() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    //index에 있는 항목 조회
    public Object get(int index) {
        return elementData[index];
    }

    //변경 기능
    public Object set(int index, Object element) {
        Object oldValue = elementData[index];
        elementData[index] = element;
        return oldValue;
    }

    //검색 기능
    public int indexOf(Object e) {
        //사이즈만큼 반복
        for(int i = 0; i < size; i++) {
            if(e.equals(elementData[i])) { //e가 n번째 배열의 값과 같다면
                return i; //순서 반환
            }
        }
        return -1; //값이 없으면 -1 반환
    }

    //삭제 기능
    //n번째를 null로 변경
    public Object remove(int index) {
        Object removeValue = elementData[index];

        //뒤에 있는 데이터 한칸 앞으로
        for(int i = index; i < size -1; i++) {
            elementData[i] = elementData[i + 1];
        }

        //마지막 값은 중복이니 null 처리
        elementData[size-1] = null;
        size --;
        return removeValue;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size = " + size + " ," + "capacity = " + elementData.length;
    }
}