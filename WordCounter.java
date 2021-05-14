import java.util.Arrays;
import java.util.Scanner;

//Word Counter first class

public class WordCounter {

	public static void main(String[] args) {
		
		Scanner texto = new Scanner (System.in);
		String a = texto.nextLine();

		System.out.println("Número de palavras: " + a.split(" ").length);
		texto.close();
		
		//Only for conference, the array presented:
		System.out.println(Arrays.toString(a.split(" ")));		
	}
}
