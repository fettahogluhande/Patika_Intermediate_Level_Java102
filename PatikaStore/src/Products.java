public class Products {
    private String name;
    private String color;
    private Brand productBrand;
    private double screenSize;
    private double batteryCapacity;
    private int productPrice;
    private int discountRate;
    private int quality;
    private int memory;
    private int ram;
    private int productID;
    private static int nextId = 1;

    public Products(String name, String color, Brand productBrand, double screenSize, double batteryCapacity, int productPrice, int discountRate, int quality, int memory, int ram) {
        this.name = name;
        this.color = color;
        this.productBrand = productBrand;
        this.screenSize = screenSize;
        this.batteryCapacity = batteryCapacity;
        this.productPrice = productPrice;
        this.discountRate = discountRate;
        this.quality = quality;
        this.memory = memory;
        this.ram = ram;
        this.productID = nextId;
        nextId++;
    }

    //#region -----------GETTER AND SETTER REGION---------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Brand getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(Brand productBrand) {
        this.productBrand = productBrand;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getProductID() {
        return productID;
    }
    public void setProductID(int productID) {
        this.productID = productID;
    }
    //#endregion -----------------GETTER AND SETTER END REGION--------------
}
