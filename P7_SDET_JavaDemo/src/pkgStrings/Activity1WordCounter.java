
package pkgStrings;

public class Activity1WordCounter {
	public static void main(String[] args) {
		String twisters = "A skunk sat on a stump and thunk the stump stunk, but the stump thunk the skunk stunk";

		int stumpCount = countWordOccurrences(twisters, "stump");
		int skunkCount = countWordOccurrences(twisters, "skunk");

		System.out.println("Occurrences of 'stump': " + stumpCount);
		System.out.println("Occurrences of 'skunk': " + skunkCount);
	}

	public static int countWordOccurrences(String input, String word) {
		int count = 0;
		String[] words = input.split("\\s+"); // Split the input string by spaces

		for (String w : words) {
			// Remove punctuation to ensure accurate counting
			String cleanWord = w.replaceAll("[^a-zA-Z]", "");

			if (cleanWord.equalsIgnoreCase(word)) {
				count++;
			}
		}

		return count;
	}

}
