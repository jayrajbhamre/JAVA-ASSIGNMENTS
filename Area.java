// Write a class in which you need to write functions to find area of circle,
// area of square and area of right angle triangle.
// Call all those functions inside the main and show the result. Take all inputs from the user. class Area {
import java.util.*;

public class Area {
    Scanner in = new Scanner(System.in);
    public double areaCircle()
    {

        System.out.println("Enter radius of circle: ");
        int r = in.nextInt();
        return (3.14 * r * r);
    }
    public double areaSquare()
    {
        System.out.println("Enter sides of square: ");
        int s = in.nextInt();
        return ( s * s);
    }
    public double areaRightTriangle()
    {
        System.out.println("Enter base of Right Triangle: ");
        int b = in.nextInt();
        System.out.println("Enter height of Right Triangle: ");
        int h = in.nextInt();
        return ( 0.5 * b * h );
    }
    public static void main(String[] args) {
        Area obj = new Area();
        System.out.println("Area of circle = "+obj.areaCircle());
        System.out.println("Area of Square = "+obj.areaSquare());
        System.out.println("Area of Right Triangle = "+obj.areaRightTriangle());

    }
}