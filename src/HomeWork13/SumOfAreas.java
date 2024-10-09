package HomeWork13;

public class SumOfAreas {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(6),
                new Triangle(6, 8),
                new Square(9)};
        double sumAreasShape = calculateSumAreasShape(shapes);
        System.out.println("Total area of all figures: " + sumAreasShape);
    }

    public static double calculateSumAreasShape(Shape[] shapes) {
        double sumAreasShape = 0;
        for (Shape shape : shapes) {
            sumAreasShape += shape.getArea();
        }
        return sumAreasShape;
    }
}
