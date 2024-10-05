package example;

import example.Figures.Circle;
import example.Figures.Rectangle;
import example.Figures.Triangle;
import

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1.0);
        Triangle triangle = new Triangle(1.0, 2.0, 3.0);
        Rectangle rectangle = new Rectangle(1.0, 2.0);
        System.out.println(circle.perimetr());
        System.out.println(circle.area());
        System.out.println(triangle.perimetr());
        System.out.println(triangle.area());
        System.out.println(rectangle.perimetr());
        System.out.println(rectangle.area());
        GeometryUtils
    }
}