import java.util.*;

public class Whatever {
	//the amount of times letter combo appears
	private int countValue;
	private ArrayList <Character> list;
	
	public Whatever() {
		countValue = 0;
		list = new ArrayList <Character> ();
	}
	
	public void incrementCountValue() {
		countValue++;
	}
	
	public int getCountValue() {
		return countValue;
	}
	
	public ArrayList <Character> getList() {
		return list;
	}
	
	//get next letter by randomly searching through list
	public Character chooseNext() {
		return list.get((int) (Math.random() * list.size()));
	}
}
