package pkg_collection;

import java.util.LinkedList;

public class ListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			LinkedList<String> list = new LinkedList<String>();
			System.out.println("initialize the collection of the size" + list.size());
			list.add("Tirunelveli ");
			list.add("Sankarankovil");
			list.add("Rajapalayam");
			list.add("Madurai");
			System.out.println("initialize the collection of the size after adding:" + list.size());
			list.add("Paris");
			list.add("London");

			list.remove("Rajapalayam");
			System.out.println("the locations are:" + list.toString());
			// "RAJAPALAYAM IS REMOVED SUCCESFULLY

			System.out.println("NEW LOCATION");
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
	}

}
