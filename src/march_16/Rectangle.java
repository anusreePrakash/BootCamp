package march_16;

public class Rectangle {
    private final int height;
    private final int width;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int calcArea() {
        return height*width;
    }

    public static Rectangle create(int width, int height) {
        if(width<=0)
            throw new IllegalArgumentException("Width should be a positive Integer greater than zero");
        if(height<=0)
            throw new IllegalArgumentException("Height should be a positive Integer greater than zero");
        return new Rectangle(width,height);
    }
}
