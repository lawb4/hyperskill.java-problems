import java.util.Scanner;

class ManufacturingController {
    static int productCount;


    public static String requestProduct(String product) {
        productCount++;
        return String.format("%d. Requested %s", productCount, product);
    }

    public static int getNumberOfProducts() {
        return productCount;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String product = scanner.nextLine();
            System.out.println(ManufacturingController.requestProduct(product));
            System.out.println(ManufacturingController.getNumberOfProducts());
        }
    }
}