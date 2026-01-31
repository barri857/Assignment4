package model;
public class Apartment extends Property {
    private int floor;

    public Apartment(int id, String address, double price, Agent agent, int floor) {
        super(id, address, price, agent);
        this.floor = floor;
    }

    @Override
    public String getPropertyType() {
        return "Apartment on floor " + floor;
    }

    @Override
    public double getServiceFee() {
        return getPrice() * 0.03;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.01;
    }
}