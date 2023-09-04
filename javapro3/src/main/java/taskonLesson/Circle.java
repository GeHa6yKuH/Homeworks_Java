package taskonLesson;

public class Circle extends Shape implements Resizable{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public void resize(double factor) {
        radius = radius * (factor/2);
    }
}
