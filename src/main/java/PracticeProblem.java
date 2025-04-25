public class Rectangle{
	private double length;
	private double width;


	public Ractangle(double length, double width){
		this.length = length;
		this.width = width;

	}

	public double getLength(){
		return this.length;
	}

	public double getWidth(){
		return this.width;
	}

	public double area(){
		return this.width*this.length;
	}

	public double perimeter(){
		return (this.width *2) + (this.length *2);
	}
}
