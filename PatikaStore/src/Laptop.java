import java.util.HashMap;

public class Laptop extends Products {
    public static HashMap<Integer, Products> laptop = new HashMap<>();

    public Laptop(String name, String color, Brand productBrand, double screenSize, double batteryCapacity, int productPrice, int discountRate, int quality, int memory, int ram) {
        super(name, color, productBrand, screenSize, batteryCapacity, productPrice, discountRate, quality, memory, ram);
        laptop.put(this.getProductID(), this);
    }
}
