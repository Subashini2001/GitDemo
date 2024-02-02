package pkg_sample;

//public class Package {
	 
class shape {
		String color;
		
	    public shape(String color) {
	        this.color = color;
	    }
	 
	    public void displayColor() {
	        System.out.println("Color: " + color);
	    }
	}
	 
	class Circle extends shape {
	    double radius;
	 
	    public Circle(String color, double radius) {
	        super(color);
	        this.radius = radius;
	    }
	}
	 
	class Rectangle extends shape  {
	    double length;
	    double width;
	 
	    public Rectangle(String color, double length, double width) {
	        super(color);
	        this.length = length;
	        this.width = width;
	    }
	}
	 
	public class Package {
	    public static void main(String[] args) {
	        Circle circle = new Circle("Blue", 5.0);
	        circle.displayColor();
	        
	        Rectangle rectangle = new Rectangle("Blue", 3.0, 4.0);
	        rectangle.displayColor();
	    }
	}
	 

	


