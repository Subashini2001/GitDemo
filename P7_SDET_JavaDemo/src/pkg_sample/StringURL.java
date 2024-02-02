package pkg_sample;
 
public class StringURL {
 
	public static void main(String[] args) {
		 String url ="http://demowebshop.tricentis.com/login";


		    String s1 = " ";
		    String[] s2 = url.split("cent");
 
		    for ( int i = 0; i < s2.length; i++)
		    {
		        s1 = s1+ s2[i];
		    }
		    System.out.println(s1);
	}
 
}
 
