public class Triangle extends Shape implements Scalable {
    private double side1, side2, side3;

    // Constructor to create the sides and check if its a trianglke
    public Triangle(double side1, double side2, double side3) {
        super("Triangle");
        if (!isValidTriangle(side1, side2, side3)) {
            throw new IllegalArgumentException("Invalid triangle sides");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

   // side 1 getters and setters
    public double getSide1() {
        return side1;
    }

   
    public void setSide1(double side1) {
        if (isValidTriangle(side1, this.side2, this.side3)) {
            this.side1 = side1;
        } else {
            System.err.println("Invalid Triangle sides");
        }
    }

   //side 2 getters and setters
    public double getSide2() {
        return side2;
    }

    
    public void setSide2(double side2) {
        if (isValidTriangle(this.side1, side2, this.side3)) {
            this.side2 = side2;
        } else {
            System.err.println("Invalid Triangle sides");
        }
    }

    //side 3 getters and setters
    public double getSide3() {
        return side3;
    }

   
    public void setSide3(double side3) {
        if (isValidTriangle(this.side1, this.side2, side3)) {
            this.side3 = side3;
        } else {
            System.err.println("Invalid Triangle sides");
        }
    }

    // Method tused above to check for valid triangle
    private boolean isValidTriangle(double side1, double side2, double side3) {
        return side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2;
    }

    // overidden Perimeter and area from shape class
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    
    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // to implement scale from Scalable
    @Override
    public void scale(double factor) {
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }
}
