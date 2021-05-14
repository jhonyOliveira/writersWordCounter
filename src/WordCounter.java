import java.util.Arrays;
import java.util.Scanner;

public class WordCounter {

	public static void main(String[] args) {
		
		Scanner text = new Scanner (System.in);
		String a = text.nextLine();

		System.out.println("Number of written words: " + a.split(" ").length);
		text.close();
		
		//Only for conference, the array showed:
		System.out.println(Arrays.toString(a.split(" ")));		
	}
}
