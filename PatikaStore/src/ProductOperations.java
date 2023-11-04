import java.util.HashMap;
import java.util.Scanner;

public class ProductOperations {
    static Scanner scanner = new Scanner(System.in);
    public static void run(HashMap<Integer, Products> productList) {
        boolean status = true;
        while (status) {
            System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
            System.out.println("1-Ürün ekleme");
            System.out.println("2-Ürün silme");
            System.out.println("3-Ürün listeleme");
            System.out.println("4-Filtreleme ile ürün listeleme");
            System.out.println("0-Çıkış yap");
            int select = scanner.nextInt();
            switch (select) {
                case 0 -> status = false;
                case 1 -> addProduct(productList);
                case 2 -> deleteProduct(productList);
                case 3 -> listProduct(productList);
                case 4 -> searchProduct(productList);
                default -> System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz !");
            }
        }
    }
    public static void addProduct(HashMap<Integer, Products> productList) {
        System.out.print("Ürünün adını giriniz:");
        scanner.nextLine();
        String productName = scanner.nextLine();

        Brand brand = null;
        boolean status = true;

        while (status) {
            System.out.print("Ürünün markasını giriniz:");
            String productBrand = scanner.next();
            for (Brand b : Brand.brands) {
                if (b.getBrandName().equals(productBrand)) {
                    brand = b;
                    status = false;
                }
            }
        }
        System.out.print("Ekran boyutu:");
        double screenSize = scanner.nextDouble();

        System.out.print("Pil gücü:");
        double batteryCapacity = scanner.nextDouble();

        System.out.print("Hafıza:");
        int memory = scanner.nextInt();

        System.out.print("Ram:");
        int ram = scanner.nextInt();

        System.out.print("Renk:");
        String color = scanner.next();

        System.out.print("Fiyat:");
        int productPrice = scanner.nextInt();

        System.out.print("Stok:");
        int quality = scanner.nextInt();

        System.out.print("İndirim oranı:");
        int discountRate = scanner.nextInt();

        Products newProduct = new Products(productName, color, brand, screenSize, batteryCapacity, productPrice, discountRate, quality, memory, ram);
        productList.put(newProduct.getProductID(), newProduct);
    }
    public static void deleteProduct(HashMap<Integer, Products> productList) {
        System.out.print("Silmek istediğiniz ürünün id'sini giriniz: ");
        int productID = scanner.nextInt();

        if (productList.containsKey(productID)) {
            productList.remove(productID);
            System.out.println(productID + " numaralı ürün silinmiştir...");
        } else {
            System.out.println("Bu id değerine sahip ürün yoktur...");
        }
    }
    public static void listProduct(HashMap<Integer, Products> productList) {
        String format = "| %-8s | %-30s | %-22s | %-12s | %-22s | %-25s | %-16s | %-22s | %-22s | %-16s | %-22s |\n";
        System.out.format("+----------+--------------------------------+------------------------+--------------+------------------------+---------------------------+------------------+------------------------+------------------------+------------------+------------------------+\n");
        System.out.format("| ID       | Ürün Adı                       | Marka                  | Ekran Boyutu | Batarya Kapasitesi     | Depolama Kapasitesi       | RAM Kapasitesi   | Renk                   | Fiyat                  | Adet             | İndirim Oranı          |\n");
        System.out.format("+----------+--------------------------------+------------------------+--------------+------------------------+---------------------------+------------------+------------------------+------------------------+------------------+------------------------+\n");
        for (Products product : productList.values()) {
            System.out.format(format, product.getProductID(), product.getName(), product.getProductBrand().getBrandName(), product.getScreenSize(), product.getBatteryCapacity(), product.getMemory(), product.getRam(), product.getColor(), product.getProductPrice(), product.getQuality(), product.getDiscountRate());
            System.out.format("+----------+--------------------------------+------------------------+--------------+------------------------+---------------------------+------------------+------------------------+------------------------+------------------+------------------------+\n");
        }
    }
    public static void searchProduct(HashMap<Integer, Products> productList) {
        System.out.println("Filtrele: ");
        scanner.nextLine();
        String filter = scanner.nextLine();

        if (filter.matches("\\d+")) {
            int ourFilter = Integer.parseInt(filter);
            if (productList.containsKey(ourFilter)) {
                Products product = productList.get(ourFilter);
                String format = "| %-8s | %-30s | %-22s | %-12s | %-22s | %-25s | %-16s | %-22s | %-22s | %-16s | %-22s |\n";
                System.out.format("+----------+--------------------------------+------------------------+--------------+------------------------+---------------------------+------------------+------------------------+------------------------+------------------+------------------------+\n");
                System.out.format("| ID       | Ürün Adı                       | Marka                  | Ekran Boyutu | Batarya Kapasitesi     | Depolama Kapasitesi       | RAM Kapasitesi   | Renk                   | Fiyat                  | Adet             | İndirim Oranı          |\n");
                System.out.format("+----------+--------------------------------+------------------------+--------------+------------------------+---------------------------+------------------+------------------------+------------------------+------------------+------------------------+\n");
                System.out.format(format, product.getProductID(), product.getName(), product.getProductBrand().getBrandName(), product.getScreenSize(), product.getBatteryCapacity(), product.getMemory(), product.getRam(), product.getColor(), product.getProductPrice(), product.getQuality(), product.getDiscountRate());
                System.out.format("+----------+--------------------------------+------------------------+--------------+------------------------+---------------------------+------------------+------------------------+------------------------+------------------+------------------------+\n");
            } else {
                System.out.println("Bu id numarasına sahip ürün bulunamadı");
            }


        } else if (filter.matches("\\D+")) {
            if (productList.values().stream().anyMatch(p -> p.getProductBrand().getBrandName().equals(filter))) {
                for (Products product : productList.values()) {
                    if (product.getProductBrand().getBrandName().equals(filter)) {
                        String format = "| %-8s | %-30s | %-22s | %-12s | %-22s | %-25s | %-16s | %-22s | %-22s | %-16s | %-22s |\n";
                        System.out.format("+----------+--------------------------------+------------------------+--------------+------------------------+---------------------------+------------------+------------------------+------------------------+------------------+------------------------+\n");
                        System.out.format("| ID       | Ürün Adı                       | Marka                  | Ekran Boyutu | Batarya Kapasitesi     | Depolama Kapasitesi       | RAM Kapasitesi   | Renk                   | Fiyat                  | Adet             | İndirim Oranı          |\n");
                        System.out.format("+----------+--------------------------------+------------------------+--------------+------------------------+---------------------------+------------------+------------------------+------------------------+------------------+------------------------+\n");
                        System.out.format(format, product.getProductID(), product.getName(), product.getProductBrand().getBrandName(), product.getScreenSize(), product.getBatteryCapacity(), product.getMemory(), product.getRam(), product.getColor(), product.getProductPrice(), product.getQuality(), product.getDiscountRate());
                        System.out.format("+----------+--------------------------------+------------------------+--------------+------------------------+---------------------------+------------------+------------------------+------------------------+------------------+------------------------+\n");
                    }
                }
            } else {
                System.out.println("Belirtilen marka ile eşleşen bir ürün bulunamadı");
            }

        } else {
            System.out.println("Filtreleme id veya markaya göre yapılıyor lütfen bu değerlerden birini giriniz");
        }
    }
}

