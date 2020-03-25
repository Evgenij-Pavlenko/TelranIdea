package telran.data;

public abstract class Shape {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Shape: ";
    }

    public abstract double getArea();
    public static Shape findMaxShapeByArea(Shape[] shapes){
        Shape max = null;
        double maxArea = 0;
        for (Shape s: shapes){
            if (s.getArea()>maxArea){
                maxArea = s.getArea();
                max = s;
            }
        }
        System.out.println("Max area is: " + maxArea);
        return max;
    }
    public static Shape[] getByColor(Shape[] shapes, String color){
        int size = 0;
        for (Shape s: shapes){
            if (s.getColor().name().equalsIgnoreCase(color)){
                size++;
            }
        }
        if (size<1){
            System.out.println("Color not found");
            return null;
        }
        Shape[] shapeByColor = new Shape[size];
        int index = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i].getColor().name().equalsIgnoreCase(color)){
                shapeByColor[index] = shapes[i];
                index++;
            }
        }
        return shapeByColor;
    }
}
