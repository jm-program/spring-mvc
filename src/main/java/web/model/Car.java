package web.model;

public class Car {

    private String manufacturer;
    private String mod;
    private int avgPrice;

    public Car (String manufacturer, String mod, int avgPrice) {
        this.manufacturer = manufacturer;
        this.mod = mod;
        this.avgPrice = avgPrice;
    }

    public Car() {}

    public String getManufacturer() {
        return manufacturer;
    }

    public String getMod() {
        return mod;
    }

    public int getAvgPrice() {
        return avgPrice;
    }

}
