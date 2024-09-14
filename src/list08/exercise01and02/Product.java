package list08.exercise01;

public class Product {
    private String name;
    private double price;
    private int quantityInStock;

    public Product(String name, double price, int quantityInStock) {
        this.name = name;
        setPrice(price); // Use setter for validation
        setQuantityInStock(quantityInStock); // Use setter for validation
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Error: Price cannot be negative.");
        } else {
            this.price = price;
        }
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        if (quantityInStock < 0) {
            System.out.println("Error: Quantity in stock cannot be negative.");
        } else {
            this.quantityInStock = quantityInStock;
        }
    }

    public void displayInfo() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    }

    // Method to apply a discount
    public void applyDiscount(double percentage) {
        try {
            Validator.validateDiscount(percentage);
            double discountAmount = price * (percentage / 100);
            price -= discountAmount;
            System.out.println("Discount applied: " + percentage + "% to " + name);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + " for product: " + name);
        }
    }
}

