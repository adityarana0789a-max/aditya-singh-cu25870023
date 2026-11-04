class Shape { double calculateArea() { return 0; } }
class Circle extends Shape {
    double radius = 5;
    @Override double calculateArea() { return 3.14 * radius * radius; }
}
class Rectangle extends Shape {
    double length = 4, width = 6;
    @Override double calculateArea() { return length * width; }
}
public class ShapeArea {
    public static void main(String[] args) {
        System.out.println("Circle area: " + new Circle().calculateArea());
        System.out.println("Rectangle area: " + new Rectangle().calculateArea());
    }
}
