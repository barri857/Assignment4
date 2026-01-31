package model;
public class House extends Property {
    private double yardSize;

    public House(int id, String address, double price, Agent agent, double yardSize) {
        super(id, address, price, agent);
        this.yardSize = yardSize;
    }

    @Override
    public String getPropertyType() {
        return "House";
    }

    @Override
    public double getServiceFee() {
        return getPrice() * 0.02; // Мысалы 2%
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05;
    }
}