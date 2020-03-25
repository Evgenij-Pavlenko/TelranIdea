package telran.data;

public class Rectangle extends Shape {
    private double wigth;
    private double height;

    public Rectangle(Color color, double wigth, double height) {
        super(color);
        this.wigth = wigth;
        this.height = height;
    }

    public double getWigth() {
        return wigth;
    }

    public double getHeight() {
        return height;
    }



    @Override
    public double getArea() {
        return wigth*height;
    }

    @Override
    public String toString() {
        return  super.toString() + "Rectangle: " + getColor() +
                ", wigth: " + wigth +
                ", height: " + height +
                ", area: " + getArea();
    }
}
