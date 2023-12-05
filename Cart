import java.util.ArrayList;
import java.util.Scanner;
public class Cart {
    public static void main(String[] args) {
        ArrayList<Device> cart = new ArrayList<>();
        ArrayList<Device> warehouse = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Choose operation");
            System.out.println("1. Add to stock");
            System.out.println("2. Unloading goods from warehouse");
            System.out.println("3. Cart creation");
            System.out.println("4. Adding item to cart");
            System.out.println("5. adding item to cart through ID");
            System.out.println("6. View cart");
            System.out.println("7. Total Spending");
            System.out.println("8. Close the sale");
            System.out.println("0. Exit");
            System.out.println("Enter the number of operation: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter device name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter the aviable quantity");
                    int quantity = scanner.nextInt();
                    warehouse.add(new Device(name, quantity));
                    System.out.println("Device added to the werehouse.");
                    break;
                case 2:
                    System.out.println("Enter the name of device to download");
                    String deviceDownload = scanner.nextLine();
                    System.out.println("Enter the quantity to download");
                    int quantityDownload = scanner.nextInt();
                    downloadGoods(warehouse, deviceDownload, quantityDownload);
                    break;
                case 3:
                    cart.clear();
                    System.out.println("Cart created.");
                    break;
                case 4:
                    System.out.println("Enter the name of device to add to the cart");
                    String deviceToAdd = scanner.nextLine();
                    System.out.println("Enter the quantity to add to the cart");
                    int quantityToAdded = scanner.nextInt();
                    addToCart(warehouse, cart , deviceToAdd, quantityToAdded);
                    break;
                case 5:
                    System.out.println("Enter the id to add to the cart");
                    int idDevice = scanner.nextInt();
                     addIdToCart(warehouse, cart, idDevice);
                    break;
                case 6:
                    viewCart(cart);
                    break;
                case 7:
                    double totalSpending = cartTotal(cart);
                    System.out.println("The cart total is " + totalSpending);
                    break;
                case 8:
                    closeTheSale(warehouse, cart);
                    break;
                case 0:
                    System.out.println("Program finished");
                    break;
                default:
                    System.out.println("Invalid operation");
                    break;
            }
        } while (choice != 0);
            scanner.close();
    }
    private static void downloadGoods(ArrayList<Device> warehouse, String name, int quantity) {
        for (Device device : warehouse) {
            if (device.getName().equalsIgnoreCase(name)) {
                if (device.getQuantity() >= quantity) {
                    device.download(quantity);
                    System.out.println("Goods unloaded from the warehouse");
                } else {
                    System.out.println("Quantity not available in stock");
                }
                return;
            }
        }
        System.out.println("Device not found in warehouse");
    }
    private static void addToCart(ArrayList<Device> warehouse, ArrayList<Device> cart, String name, int quantity) {
        for (Device device : warehouse) {
            if (device.getName().equalsIgnoreCase(name)) {
                if (device.getQuantity() >= quantity) {
                    cart.add(new Device(device.getId(), device.getName(), quantity, device.getTotalPrice()));
                    device.download(quantity);
                    System.out.println("Item add to the cart.");
                } else {
                    System.out.println("Quantity not available in stock");
                }
                return;
            }
        }
        System.out.println("Device not found in warehouse");
    }
    private static void addIdToCart(ArrayList<Device> warehouse, ArrayList<Device> cart, int id){
        for(Device device : warehouse){
            if (device.getId() == id){
                System.out.println("Enter the quantity to add to the cart");
                Scanner scanner = new Scanner(System.in);
                int quantityToAdd = scanner.nextInt();
            if(device.getQuantity() >= quantityToAdd){
                cart.add(new Device(device.getId(),device.getName(), quantityToAdd, device.getTotalPrice()));
                device.download(quantityToAdd);
                System.out.println("Item add to cart");
            }else{
                System.out.println("Quantity not available in stock");
            }
            return;
            }
            System.out.println("Device not found with the ID");
        }
    }
    private static void viewCart(ArrayList<Device> cart){
    System.out.println("Cart: ");
    for(Device device : cart){
        System.out.println("Name: " + device.getName() + " ,Quantity: " + device.getQuantity());
        }
    }
   private static double cartTotal(ArrayList<Device> cart){
    double totalSpending = 0.0;
        for(Device device : cart){
        totalSpending += device.getTotalPrice();
    }
   return totalSpending;
    }

    private static void closeTheSale(ArrayList<Device> warehouse, ArrayList<Device> cart){
        System.out.println("Sale concluded");
    for(Device elementCart : cart ){
        downloadGoods(warehouse, elementCart.getName(), elementCart.getQuantity());
    }
    cart.clear();
    }

    static class Device{
        private String name;
        private int quantity;
        private int id;
        private double price;

        public Device(int id, String name, int quantity, double price) {
            this.name = name;
            this.quantity = quantity;
            this.id = id;
            this.price = price;

        }

        public Device(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public int getQuantity() {
            return quantity;
        }

        public double getTotalPrice() {
            return quantity * price;
        }

        public int getId() {
            return id;
        }
        public void download(int quantityToDownload) {
            quantity = quantityToDownload;
        }
    }



}
