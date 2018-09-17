import java.io.*;
import java.util.*;

public class GreatGatsby2 {
	//COMMENTS: -- 
	//run through Gatsby
	//store 'order' letter words in hashtable as keys for Whatever values
	//write file with numChars characters using hashtable and chooseNext() method
	
	private Hashtable <String, Whatever> hashtable = new Hashtable <String, Whatever> ();

	//run through gatsby, add 'order' letter combos to hashtable, then write
	public GreatGatsby2 (String readFileName, String writeFileName, int order, int numChars) throws IOException {
		FileReader fr = new FileReader (readFileName);
		BufferedReader br = new BufferedReader (fr);

		while (br.ready()) {
			String combo = "";
			
			for (int i = 0; i <= order; i++) {
				if (i==1) {
					br.mark(order+2);
				}
				combo += (char) br.read();
			}
			if (hashtable.containsKey(combo)) {
				hashtable.get(combo).incrementCountValue();
			} else {
				hashtable.put(combo, new Whatever());
			}
			hashtable.get(combo).getList().add((char) br.read());
			br.reset();
		}
		fr.close();
		br.close();
		
		File writeFile = new File (writeFileName);
		PrintWriter pw = new PrintWriter(writeFile);
		
		//print out first combo (random key from hashtable), then choose next until you reach numChars
		String combo = hashtable.keys().nextElement();  //not sure if this is super inefficient, but it only gets called once
		pw.print(combo); 
		
		int counter = order;
		while (counter < numChars - 1) {
			char c = hashtable.get(combo).chooseNext();
			pw.print(c);
			combo = combo.substring(1, combo.length());
			combo += c;
			counter++;
		}
		
		pw.close();
	}
}
