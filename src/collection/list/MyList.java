package collection.list;

public interface MyList<E> {
//같은 기능을 제공하는 메서드를 인터페이스로 뽑아보자
    int size();

    void add(E e);

    void add(int index,E e);

    E get(int index);

    E set(int index,E e);

    E remove(int index);

    int indexOf(E o);
}
