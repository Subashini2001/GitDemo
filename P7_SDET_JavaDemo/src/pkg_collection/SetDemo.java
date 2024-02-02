package pkg_collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

			public static void main(String[] args) {

				Set<String> set=new LinkedHashSet<String>();
				System.out.println("initialize size of collection:" + set.size());
				set.add("8,9,10");
				set.add("1,2,3");
				System.out.println(set);
				// REMOVE AN ELEMENT
				set.remove("8,9,10");
				System.out.println((set));
				boolean status = set.add("4");
				System.out.println("status of an element addition to collection:" + set.size());

				// ITERATOR
				System.out.println("____________VALUES___________");
				for (int i = 0; i < set.size(); i++) {
					System.out.println((set));
				}

			}

		

}


