package model;
import interfaces.PricedItem;

public abstract class Property implements PricedItem {
    private int id;
    private String address;
    private double price;
    private Agent agent;

    public Property(int id, String address, double price, Agent agent) {
        this.id = id;
        this.address = address;
        this.price = price;
        this.agent = agent;
    }

    public abstract String getPropertyType();
    public abstract double getServiceFee();

    public void displayBasicInfo() {
        System.out.println("ID: " + id + ", Address: " + address);
    }

    public int getId() { return id; }
    public String getAddress() { return address; }
    public double getPrice() { return price; }
    public Agent getAgent() { return agent; }
}