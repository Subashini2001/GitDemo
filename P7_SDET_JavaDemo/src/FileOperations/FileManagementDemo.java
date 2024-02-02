package FileOperations;

import java.io.File;

public class FileManagementDemo {

	public static void main(String[] args) {
		// provide the path of yoiur eclipse Project
		File file = new File("C:\\Users\\Subashis\\Documents");
		String[] paths = file.list();
		for (String string : paths) {
			System.out.println(string);
		}
	}

}
