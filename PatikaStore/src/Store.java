import java.util.Scanner;

public class Store {
    private final Scanner scanner = new Scanner(System.in);
    public void start() {
        System.out.println("PatikaStore Ürün Yönetim Paneli !");
        boolean status = true;
        while (true) {
            System.out.println("1-Notebook İşlemleri");
            System.out.println("2-Cep Telefonu İşlemleri");
            System.out.println("3-Marka Listele");
            System.out.println("0-Çıkış Yap");
            System.out.println("*-------------------------------------*");
            System.out.print("Seçiminiz: ");
            int select = scanner.nextInt();

            switch (select) {
                case 0:
                    status = false;
                    break;
                case 1:
                    ProductOperations.run(Laptop.laptop);
                    break;
                case 2:
                    ProductOperations.run(Phone.phones);
                    break;
                case 3:
                    listBrand();
                    break;
                default:
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz !");
            }
            if (!status) {
                System.out.println("Programdan çıkılıyor...");
                break;
            }
        }
    }
    public void listBrand() {
        for (Brand brand : Brand.brands) {
            System.out.println("Marka adı: " + brand.getBrandName());
            System.out.println("Marka id :" + brand.getBrandID());
            System.out.println("*-------------------------------------*");
        }
    }
}
