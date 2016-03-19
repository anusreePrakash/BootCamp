package shape;

/*
    Jobs of Rectangle class:
        - Every calculation related to its properties
 */

import Exceptions.InvalidArguments;

public class Rectangle {
    private final double height;
    private final double width;

    protected Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return height * width;
    }

    public static Rectangle create(double width, double height) throws InvalidArguments {
        if(width<=0 || height <=0){
            throw new InvalidArguments();
        }
        return new Rectangle(width,height);
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}
