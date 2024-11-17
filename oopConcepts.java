public class oopConcepts{
public static void main(String[] args){

    Circle circle = new Circle(6.0, "Orange", true);
    System.out.println("Area of Circle: " + circle.getArea());
    System.out.println("Perimeter of Circle: " + circle.getPerimeter());
    System.out.println(circle.toString());
    System.out.println("\n");

    Rectangle rectangle = new Rectangle(5.0, 10.0, "Green", true);
    System.out.println("Area of Rectangle: " + rectangle.getArea());
    System.out.println("Perimeter of Rectangle: " + rectangle.getPerimeter());
    System.out.println(rectangle.toString());
    System.out.println("\n");

    Square square = new Square(8.0, 8.0, 8.0,  "Yellow", false);
    System.out.println("Area of Square: " + square.getArea());
    System.out.println("Perimeter of Square: " + square.getPerimeter());
    System.out.println(square.toString());
}
}