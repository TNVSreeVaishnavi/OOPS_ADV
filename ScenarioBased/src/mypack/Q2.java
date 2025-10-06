import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {
        ArrayList<Integer> productQuantities = new ArrayList<>();

        productQuantities.add(10);
        productQuantities.add(20);
        productQuantities.add(15);
        productQuantities.add(5);

        productQuantities.set(2, 25);

        int totalQuantity = 0;
        for (int quantity : productQuantities) {
            totalQuantity += quantity;
        }
        System.out.println("Total quantity: " + totalQuantity);

        productQuantities.clear();
        System.out.println("Inventory cleared. Size: " + productQuantities.size());
    }
}
