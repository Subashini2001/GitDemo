package pkg_sample;

public class Person {

	private String name;
	private String gender;
	private int age;
public Person (String name,String gender,int age) {
	this.name=name;
	this.gender=gender;
	this.age=age;
}
public String setinfoName() {
	return name;
}
public String setinfoGender() {
	return gender;
}
public int setinfoage() {
	return age;
}
public void getinfo()
{
	System.out.println("name:"+name);
	System.out.println("gender:"+gender);
	System.out.println("age:"+age);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj = new Person("shini","female",22);
		obj.getinfo();
 
	}
 
}