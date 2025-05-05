public class Circle {
    private double radius;

    public Circle (double radius){
        this.radius = radius;
    }

    public double getradius(){
        return this.radius;
    }

    public double area(){
        return this.radius*this.radius*3.14;
    }

    public double perimeter(){
        return this.radius*3.14*2;
    }
    
}
