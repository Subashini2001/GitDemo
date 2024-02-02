package pkg_sample;

public class ExceptionHandling {

	public static void main(String[] args) {
	
				
		String userInput = "subashini";
		 
		try {
		    String processedInput = processInput(userInput);
		    System.out.println("Processed Input: " + processedInput);
		} catch (Exception e) {
		    System.out.println("Error: " + e.getMessage());
		}
		}
		 
		static String processInput(String userInput) throws Exception {
		try {
		    validateInput(userInput);
		   
		    return "Processed: " + userInput;
		} catch (Exception e) {
		    throw e;
		}
		}
		 
		static void validateInput(String input) throws Exception {
		if (input.length() < 5) {
		    throw new Exception("Input length must be at least 5 characters");
		}
		}
	
		

	}


