import java.util.Scanner;

public class Car {
    private String model;
    private String Producent;
    private int year;
    private double price;
    private String color;
    private int quantity;

    public Car (String model, String producent, int year, double price, String color, int quantity) {
        this.model = model;
        this.Producent = producent;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducent() {
        return Producent;
    }

    public void setProducent(String producent) {
        Producent = producent;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void delivery(){
        Scanner in = new Scanner(System.in);
        System.out.print("How many cars where delivered: ");
        this.quantity = in.nextInt() + quantity;
    }

    public void sell(){
        Scanner in = new Scanner(System.in);
        System.out.print("How many cars where selled: ");
        this.quantity = quantity - in.nextInt();
    }


}
