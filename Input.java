import java.io.IOException;
import java.util.*;

public class Input {
	private static String writeFile;
	private static String readFile;
	private static int markovOrder;
	private static int numCharacters;
	
	public static void main (String [] args) throws IOException {
		//get inputs
		Scanner scan = new Scanner (System.in);
		System.out.println ("file name to write to:");
		writeFile = scan.next();
		System.out.println ("file name to read from:");
		readFile = scan.next();
		System.out.println("What order Markov Chain?");
		markovOrder = scan.nextInt();
		System.out.println ("How many characters?");
		numCharacters = scan.nextInt();
		
		//run code to write new chapter of book
		ChapterWriter chw = new ChapterWriter (readFile, writeFile, markovOrder, numCharacters);
	}
	
	public static int getMarkovOrder () { return markovOrder; }
	public static String getWriteFile () { return writeFile; }
	public static String getReadFile () { return readFile; }
	public static int getNumCharacters () { return numCharacters; }
	
}
