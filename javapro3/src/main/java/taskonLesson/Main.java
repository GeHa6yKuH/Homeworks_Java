package taskonLesson;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.resize(5);
        System.out.println("Circle area after resizing: " + circle.calculateArea());

        Rectange rectangle = new Rectange(4, 6);
        System.out.println("Rectangle area after resizing: " + rectangle.calculateArea());
    }
}
