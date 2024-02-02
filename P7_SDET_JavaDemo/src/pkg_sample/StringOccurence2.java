package pkg_sample;

public class StringOccurence2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "A skunk sat on a stump and thunk the stump stunk but the stump thunk the skunk stunk";
		String word = "stunk";
		String a[] = string.split(" ");
		int count = 0;
		for (int i = 0; i < a.length; i++) {
		if (word.equals(a[i]))
		count++;
		}
		System.out.println("The string is: " + string);
		System.out.println("The word " + word + " occurs " + count + " times in the above string");
	}
}
	

	
 
		