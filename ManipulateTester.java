import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ManipulateTester {
   
    @Test
    public void testNewArraySize () {
    // Test that expected size of the array, which is passed as a variable when the array is created.
    // is equal to the size of the actual array
    	Random r = new Random();
    	int expectedSize = r.nextInt (100)+1;
        ArrayList<Integer> arr = Manipulate.newArray(expectedSize);
        assertEquals(expectedSize, arr.size());
    }
    
    @Test
    public void testNewArrayElementsBounds () {
    // Test that all of the random integers within the array fall between 1 and 10
    	ArrayList<Integer> arr = Manipulate.newArray(100);
    	for (int i : arr) {
    		assertEquals(true, i > 0 && i <= 10);
    	}
    }
    
    @Test
    public void testAddElements () {
    // Test that the number of elements in the array is equal to
    // the number of elements before we add elements plus the number of elements we intended to add
        ArrayList<Integer> arr = Manipulate.newArray(10);
        Random r = new Random();
    	int numToAdd = r.nextInt (10)+1;
    	arr = Manipulate.addElements(arr, numToAdd);
    	assertEquals(10+numToAdd, arr.size());
    }
    
    @Test
    public void testSort () {
    // Test that, after being sorted, each item in the array is smaller than or equal to items that
    // succeed it
    	ArrayList<Integer> arr = Manipulate.newArray(10);
		arr = Manipulate.sort(arr);
    	for (int i = 1; i < arr.size(); i++) {
    		assertEquals(true, arr.get(i-1) <= arr.get(i));
    	}
    }
    
    @Test
    public void testSortReverse () {
    // Test that, after being sorted in reverse, each item in the array is greater than or equal to
    // items that succeed it
    	ArrayList<Integer> arr = Manipulate.newArray(10);
		arr = Manipulate.sortReverse(arr);
    	for (int i = 1; i < arr.size(); i++) {
    		assertEquals(true, arr.get(i-1) >= arr.get(i));
    	}
    }
    
    @Test
    public void testRemoveEvens () {
        ArrayList<Integer> arr = Manipulate.newArray(10);
    	arr = Manipulate.removeEvens(arr);
    	for (int i : arr) {
    		assertEquals(1, i % 2);
    	}    
    }
    
    @Test
    public void testRemoveOdds () {
    	ArrayList<Integer> arr = Manipulate.newArray(10);
		arr = Manipulate.removeOdds(arr);
		for (int i : arr) {
			assertEquals(0, i % 2);
		}    
    }
}

