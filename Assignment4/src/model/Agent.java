package model;
public class Agent {
    private int id;
    private String name;
    private String phone;

    public Agent(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }
    public int getId() { return id; }
    public String getName() { return name; }
}