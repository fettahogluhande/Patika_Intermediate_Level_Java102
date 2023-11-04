import java.util.HashMap;

public class Phone extends Products {
    public static HashMap<Integer, Products> phones = new HashMap<>();

    public Phone(String name, String color, Brand productBrand, double screenSize, double batteryCapacity, int productPrice, int discountRate, int quality, int memory, int ram) {
        super(name, color, productBrand, screenSize, batteryCapacity, productPrice, discountRate, quality, memory, ram);
        phones.put(this.getProductID(), this);
    }
}
