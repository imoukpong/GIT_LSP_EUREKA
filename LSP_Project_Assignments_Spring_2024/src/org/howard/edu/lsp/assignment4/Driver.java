package org.howard.edu.lsp.assignment4;

public class Driver {
	
	// main function
	public static void main(String[] args) {
		
		// Initializing sets with values
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		IntegerSet set2 = new IntegerSet();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		
		IntegerSet set3 = new IntegerSet();
		
		// Printing out the values of both sets
		System.out.println("Value of set1 is: " + set1.toString());
		System.out.println("Value of set2 is: " + set2.toString());
		
		// printing length of set1 and checking if set1 equals set2
		System.out.println("Length of set1: " + set1.length());
		System.out.println("Does set1 equal set2? "+ set1.equals(set2));
		
		// Removing value from set2 and finding difference between set2 and set1
		set2.remove(3);
		System.out.println("Value of set2 after removing 3 is: " + set2.toString());
		set2.diff(set1);
		System.out.println("The value of set2 after finding the difference from set1: " + set2.toString());
		
		// Checking if set1 contains a specific value
		System.out.println("Does set1 contain 3? "+ set1.contains(3));
		
		// Union of set1 and set2
		set2.union(set1);
		System.out.println("The value of set2 after union with set1: " + set2.toString());
		
		// Finding the smallest and largest value of set1 and intersecting set1 with set2
		try {
			System.out.println("Smallest value in set1 is: " + set1.smallest());
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			System.out.println("Largest value in set1 is: " + set1.largest());
		} catch (Exception e) {
			e.printStackTrace();
		}
		set1.intersect(set2);
		System.out.println("The value of set1 after intersecting with set2: " + set1.toString());
		
		
		// Clearing set1 and checking if it is empty
		set1.clear();
		System.out.println("Is set1 empty after calling the function clear? "+ set1.isEmpty());	
		
		// Testing complement
        set1.clear();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.complement(set2);
        System.out.println("Complement of set1 relative to set2: " + set1);
        
        // Testing largest and smallest on empty set should throw exceptions
        try {
            System.out.println("Attempting to get largest on empty set3: " + set3.largest());
        } catch (IntegerSetException e) {
            System.out.println("Correctly caught exception when getting largest on empty set: " + e.getMessage());
        }
        
        try {
            System.out.println("Attempting to get smallest on empty set3: " + set3.smallest());
        } catch (IntegerSetException e) {
            System.out.println("Correctly caught exception when getting smallest on empty set: " + e.getMessage());
        }
        
        // Testing equals method with a non-IntegerSet object
        System.out.println("set1 equals a String object: " + set1.equals("1,2,3"));
	}
}