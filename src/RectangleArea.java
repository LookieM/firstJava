import java.util.Scanner;

public class RectangleArea {
    private double length;
    private double width;
    private double area;


    public void pobieranieDanych(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        this.length = input.nextDouble();
        System.out.print("Enter width: ");
        this.width = input.nextDouble();
    }
    public void obliczaniePola(){
        this.area = this.length * this.width;
    }

    public void wyświetlaniePola(){
        System.out.println("Length of rectangle: " + this.length);
        System.out.println("Width of rectangle: " + this.width);
        System.out.println("Area of rectangle: " + this.area);
    }

}
