import java.util.*;

public class Manipulate {
	
	// Creates and returns a new ArrayList of length "size" 
	// with random numbers between 1 and 10
   	public static ArrayList<Integer> newArray (int size) {
   		Random r = new Random ();
		ArrayList<Integer> ret = new ArrayList<Integer>();
		
		for (int i = 0; i < size; i++) {
			ret.add(r.nextInt(10)+1);
		}
		return ret;	
	}
	
	// Takes given ArrayList and adds "numToAdd" random numbers between 1 and 10
	public static ArrayList<Integer> addElements (ArrayList<Integer> a, int numToAdd) {
		Random r = new Random ();
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i : a) {
			ret.add(a.get(i));
		}
		for (int i = 0; i < numToAdd; i++) {
			ret.add(r.nextInt(10)+1);
		}
		return ret;
	}
	
	public static ArrayList<Integer> sort (ArrayList<Integer> a) {
		Collections.sort(a);
		return a;
	}
	
	public static ArrayList<Integer> sortReverse (ArrayList<Integer> a) {
		Collections.sort(a);
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int b : a) {
			ret.add(0, b);
		}
		return ret;
	}
	
	public static ArrayList<Integer> removeEvens (ArrayList<Integer> a) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i = 0; i < a.size(); i++) {
			if (!isEven(a.get(i))) ret.add(a.get(i));
		}
		return ret;
	}
	
	public static ArrayList<Integer> removeOdds (ArrayList<Integer> a) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i = 0; i < a.size(); i++) {
			if (isEven(a.get(i))) ret.add(a.get(i));
		}
		return ret;
	}

	private static boolean isEven (int n) {
		if (n % 2 == 0) return true;
		return false;
	}
}