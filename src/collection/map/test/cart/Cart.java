package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int count) {
        //같은 상품은 수량만 더함
        //하나만 있으면 그냥 0으로 가져옴
        int existionQuantity = cartMap.getOrDefault(product, 0);
        cartMap.put(product, count + existionQuantity);
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
            System.out.println("상품: " + entry.getKey() + "수량: " + entry.getValue());
        }
    }

    public void minus(Product product, int minusCount) {
        int count = cartMap.getOrDefault(product, 0);
        int newCount = minusCount - count;
        if(newCount <= 0) {
            cartMap.remove(product);
        } else {
            cartMap.put(product, newCount);
        }
    }
}
