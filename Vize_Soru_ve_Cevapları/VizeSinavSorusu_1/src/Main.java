import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Shape> shapeLists = new ArrayList<>();

        shapeLists.add(new Rectangle(10.0, 5.0));
        shapeLists.add(new Circle(4.0));
        shapeLists.add(new Rectangle(5.0, 6.0));

        System.out.println("Calculating Shape's Primeters and Areas");

        for (Shape shape : shapeLists) {
            System.out.println("\nShape Name: " + shape.getShapeName());
            System.out.printf("Area: %.2f\n", shape.calculateArea());
            System.out.printf("perimeter: %.2f\n", shape.calculatePerimeter());
        }
    }
}