package collection.compare;

import java.util.Comparator;

public class IdComparator implements Comparator<MyUser> {

    @Override
    public int compare(MyUser o1, MyUser o2) {
        return o1.getId().compareTo(o2.getId()); //아이디를 기준으로 정렬
    }
}
