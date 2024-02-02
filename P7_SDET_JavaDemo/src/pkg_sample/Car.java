package pkg_sample;

public class Car {
	String make;
	String model;
	int year;

	public Car(String make,String model,int year) {
		this.make=make;
		this.model=model;
		this.year=year;
}	
public static void main(String[] args) {
	Car mycar =new Car("suzuki","benz",2016);
	System.out.println("Make:" + mycar.make);
	System.out.println("model:" + mycar.model);
	System.out.println("year:" + mycar.year);
}
}

