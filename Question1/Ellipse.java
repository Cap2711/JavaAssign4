
public class Ellipse extends Shape {

    private double a , b;

    // constructor and to make sure A>B

    public Ellipse(double a, double b) {
        super("Ellipse");
        if (a > b) {
            this.a = a;
            this.b = b;
        } else {
            this.a = b;
            this.b = a;
        }
    }

    // getters and setters (setters checking for A>B)
    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a > this.b) {
            this.a = a;
        } else {
            this.b = a;
        }
    }

    public double getB() {
        return b;
    }
 
    public void setB(double b) {
        if (b < this.a) {
            this.b = b;
        } else {
            this.a = b;
        }
    }

    // overridden Perimeter and area from Shape class for elliopse
    @Override
    public double getPerimeter() {
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }
    
}
