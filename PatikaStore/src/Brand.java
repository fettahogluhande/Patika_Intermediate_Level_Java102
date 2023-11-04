import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Brand {
    private String brandName;
    private int brandID;
    private static int nextID = 1;
    public static List<Brand> brands = new ArrayList<>();
    public Brand(String brandName) {
        this.brandName = brandName;
        this.brandID = nextID;
        if (nextID > 9) {
            brands.add(this);
        }
        nextID++;
        brands.sort(Comparator.comparing(Brand::getBrandName));
    }

    static {
        brands.add(new Brand("Samsung"));
        brands.add(new Brand("Lenovo"));
        brands.add(new Brand("Apple"));
        brands.add(new Brand("Huawei"));
        brands.add(new Brand("Asus"));
        brands.add(new Brand("HP"));
        brands.add(new Brand("Xiomi"));
        brands.add(new Brand("Monster"));
        brands.sort(Comparator.comparing(Brand::getBrandName));
    }
    //#region -----------GETTER AND SETTER REGION---------
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getBrandID() {
        return brandID;
    }

    public void setBrandID(int brandID) {
        this.brandID = brandID;
    }

    public static int getNextID() {
        return nextID;
    }

    public static void setNextID(int nextID) {
        Brand.nextID = nextID;
    }
    //#endregion -----------------GETTER AND SETTER END REGION--------------
}
