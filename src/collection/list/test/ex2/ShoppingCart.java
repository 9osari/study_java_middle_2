package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");

        //목적: 출력
        for (Item item : items) {
            System.out.println("상품명: " + item.getName() + " 합계: " + item.getTotalPrice());
        }

        //목적: 계산
        //유지보수성과 가독성이 좋아짐
        System.out.println("전체 가격 합: " + getTotalPrice());
    }

    private int getTotalPrice() {
        int total = 0;
        for (Item item : items) {
            total = total + item.getTotalPrice();
        }
        return total;
    }
}
