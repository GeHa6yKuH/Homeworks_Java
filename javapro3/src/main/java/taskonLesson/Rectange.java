package taskonLesson;

public class Rectange extends Shape implements Resizable{

    private double length;
    private double width;

    public Rectange(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    public void resize(double factor) {
        length *= factor;
        width *= factor;
    }
}
