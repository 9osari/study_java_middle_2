package collection.list_study.cart;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getTotalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return name + " (" + quantity + "개 × " + price + ")";
    }
}
