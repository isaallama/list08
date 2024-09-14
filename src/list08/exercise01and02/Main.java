package list08.exercise01;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Samsung The Frame", 1899.00, 6);
        product1.displayInfo();

        Product product2 = new Product("Tab S6 Lite", 1699.00, 10);
        product2.displayInfo();

        product2.setPrice(1781.00);
        product2.setQuantityInStock(5);

        System.out.println("\nUpdated product information:");
        product2.displayInfo();

        try {
            product1.applyDiscount(60);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}


