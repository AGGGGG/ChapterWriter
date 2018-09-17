import java.util.*;

public class CharCombo {
	//the amount of times letter combo appears
	private int countValue;
	
	//list of characters that come after this particular character combo
	private ArrayList <Character> list;
	
	public CharCombo() {
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
	//list will contain duplicates of letters each time they show up,
	//so that we need only choose a letter randomly and 
	//their frequency will automatically be weighted.
	public Character chooseNext() {
		return list.get((int) (Math.random() * list.size()));
	}
}
