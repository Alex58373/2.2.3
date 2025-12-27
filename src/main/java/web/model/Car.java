package web.model;

public class Car {
    private int id;
    private String name;
    private  String color;
    private Boolean theStinker;
    private String driver;


    public Car(int id, String name, String color,  Boolean theStinker, String driver) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.theStinker = theStinker;
        this.driver = driver;
    }

    public Boolean getTheStinker() {
        return theStinker;
    }

    public void setTheStinker(Boolean theStinker) {
        this.theStinker = theStinker;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
