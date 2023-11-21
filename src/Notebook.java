import java.util.UUID;

public class Notebook {
    private UUID id;
    private String item;
    private String manufacturer;
    private String model;
    private double displaySize;
    private String archiveSpace;
    private double buyingPrice;
    private double sellingPrice;

    public Notebook (String item, String manufacturer, String model, double displaySize, String archiveSpace, double buyingPrice, double sellingPrice) {
        this.id = generateID();
        this.item = item;
        this.manufacturer = manufacturer;
        this.model = model;
        this.displaySize = displaySize;
        this.archiveSpace = archiveSpace;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }
    // Method to generate a unique ID for the notebook
    private UUID generateID() {
        return UUID.randomUUID();
    }
    public String getId() {
        return id.toString();
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

    public String getArchiveSpace() {
        return archiveSpace;
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
        System.out.println("Archive space: " + archiveSpace);
        System.out.println("Buying Price: $" + buyingPrice);
        System.out.println("Selling Price: $" + sellingPrice);
    }
}
