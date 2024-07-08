

public class EquilateralTriangle extends Triangle implements Scalable {

    
    public EquilateralTriangle(double side) {
        super(side, side, side); 
    }

    // Overridden name
    @Override
    public String getName() {
        return "EquilateralTriangle";
    }

    // Perimeter and area overidden from triangle class
    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * Math.pow(getSide1(), 2);
    }

    @Override
    public double getPerimeter() {
        return 3 * getSide1();
    }

    // to implement scale from scalable
    @Override
    public void scale(double factor) {
        setSide1(getSide1() * factor);
        setSide2(getSide2() * factor);
        setSide3(getSide3() * factor);
    }

}
