package uk.ac.westminster.products_api; // a PhysicalProduct IS-A Product becuase it is an item being sold in the store and will be shipped to the customer
//a ShoppingCart would not pass this test because it would be a class that contains Products, this woud be a HAs-A relationship. In other words a ShoppingCart HAS-A Product
public class PhysicalProduct extends Product{

    private double weightKg;
    private String dimensions;

    public PhysicalProduct () {}

    public PhysicalProduct (long id, String name, double price, double weightKg, String dimensions) {
        super(id,name,price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}
