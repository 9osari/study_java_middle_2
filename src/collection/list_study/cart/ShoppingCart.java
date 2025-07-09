package collection.list_study.cart;


import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Item> cart = new ArrayList<>();

    public void addItem(Item item) {
        cart.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        int totalPrice = 0;
        System.out.println(cart);
        for(Item item : cart) {
            totalPrice += item.getTotalPrice();
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
        }
        System.out.println("전체 가격 합: " + totalPrice);
    }
}
