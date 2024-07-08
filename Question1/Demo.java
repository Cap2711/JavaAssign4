public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        try {
            shapes[0] = new Circle(5);
            shapes[1] = new Ellipse(6, 4);
            shapes[2] = new Triangle(3, 4, 5);

            // use setters
            ((Circle) shapes[0]).setRadius(10);
            ((Ellipse) shapes[1]).setA(7);
            ((Triangle) shapes[2]).setSide3(6);

            // Print shapes
            for (Shape shape : shapes) {
                System.out.println(shape);
            }

            // For the equalatural triangle
            EquilateralTriangle equilateralTriangle = new EquilateralTriangle(6);
            System.out.println(equilateralTriangle);

        } catch (IllegalArgumentException e) {
            System.err.println("Error creating shape: " + e.getMessage());
        }
    }
}
