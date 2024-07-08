public class Circle extends Shape {
    private double radius;

    //constructor

    public Circle(double radius){
        super("Circle");
        this.radius = radius;
    }

    //getters and setters
    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    // overridden Perimeter and area from shape class

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }


}