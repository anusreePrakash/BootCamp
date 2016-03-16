package march_16;

/*
    Job of Rectangle class:
        - Anything related to height and breadth
            - Calculate the area
            - Calculate the perimeters
 */

public class Rectangle {
    private final double height;
    private final double width;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return height * width;
    }

    public static Rectangle create(double width, double height) {
        if(width<=0 || height <=0){
            throw new IllegalArgumentException("illegal arguments");
        }
        return new Rectangle(width,height);
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}
