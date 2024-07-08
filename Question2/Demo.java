public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4]; 

        try {
            shapes[0] = new Circle(5);
            shapes[1] = new Ellipse(6, 4);
            shapes[2] = new Triangle(3, 4, 5);

            // Use setters
            ((Circle) shapes[0]).setRadius(10);
            ((Ellipse) shapes[1]).setA(7);
            ((Triangle) shapes[2]).setSide3(6);

            // Print shapes before scaling
            System.out.println("Shapes before scaling:");
            for (Shape shape : shapes) {
                if (shape != null) {
                    System.out.println(shape);
                }
            }

            // Scale shapes
            scaleShapes(shapes, 1.5);

            // Print shapes after scaling
            System.out.println("\nShapes after scaling:");
            for (Shape shape : shapes) {
                if (shape != null) {
                    System.out.println(shape);
                }
            }

            // Create and scale EquilateralTriangle
            EquilateralTriangle equilateralTriangle = new EquilateralTriangle(6);
            System.out.println("\nEquilateralTriangle before scaling:");
            System.out.println(equilateralTriangle);
            equilateralTriangle.scale(2);
            System.out.println("EquilateralTriangle after scaling:");
            System.out.println(equilateralTriangle);

        } catch (IllegalArgumentException e) {
            System.err.println("Error creating shape: " + e.getMessage());
        }
    }

    // method to scale an array
    public static void scaleShapes(Shape[] shapes, double factor) {
        for (Shape shape : shapes) {
            if (shape instanceof Scalable) {
                ((Scalable) shape).scale(factor);
            }
        }
    }
}
