public class Smartphone extends Prodotti {
    private static int counter = 0; // Static counter for generating unique IDs
    private int id;
    private String item;
    private String manufacturer;
    private String model;
    private double displaySize;
    private String archiveSpce;
    private double buyingPrice;
    private double sellingPrice;

    public Smartphone (String item, String manufacturer, String model, double displaySize, String archiveSpce, double buyingPrice, double sellingPrice) {
        this.id = generateID();
        this.item = item;
        this.manufacturer = manufacturer;
        this.model = model;
        this.displaySize = displaySize;
        this.archiveSpce = archiveSpce;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }
    // Method to generate a unique ID for the smartphone
    private int generateID() {
        return ++counter;
    }
    public int getId() {
        return id;
    }
    public String getItem() {
        return item;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public String getModel() {
        return model;
    }
    public double getDisplaySize() {
        return displaySize;
    }

    public String getArchiveSpce() {
        return archiveSpce;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
    public void displayInfo() {
        System.out.println("Smartphone ID: " + id);
        System.out.println("Type: " + item);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Display size: " + displaySize);
        System.out.println("Archive space: " + archiveSpce);
        System.out.println("Buying Price: $" + buyingPrice);
        System.out.println("Selling Price: $" + sellingPrice);
    }
}
