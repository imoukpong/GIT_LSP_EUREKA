// Imo Ukpong

package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.List;

public class IntegerSet  {
	// Store the set elements in an ArrayList
	private List<Integer> set = new ArrayList<Integer>();

	 /**
     * Default Constructor
     */	public IntegerSet() {
	}

	// Constructor if you want to pass in already initialized
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}

	/**
     *  Clears the internal representation of the set
     */
public void clear() {
	set.clear();
};

/**
 *  Returns the length of the set
 * @return integer
 */
public int length() {
	return set.size();
}
	 // returns the length

/**
 * Returns true if the 2 sets are equal, false otherwise;
 * Two sets are equal if they contain all of the same values in ANY order.
 * @param set An IntegerSet Type
 * @return Boolean
 */
public boolean equals(Object o) {
	if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    IntegerSet that = (IntegerSet) o;
    // You need to compare the sets here, ignoring the order
    return set.containsAll(that.set) && that.set.containsAll(set);
	} 

/**
 *  Returns true if the set contains the value, otherwise false
 * @param value Integer
 * @return Boolean
 */
public boolean contains(int value) {
	 return set.contains(value);
}

/**
 *  Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
 * @return Integer
 * @throws Exception
 */ 
public int largest() throws IntegerSetException {
    if (isEmpty()) {
        throw new IntegerSetException(null);
    }
    return set.stream().max(Integer::compareTo).get();
}

/**
 *  Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
 * @return Integer
 * @throws Exception
 */
public int smallest() throws IntegerSetException {
    if (isEmpty()) {
        throw new IntegerSetException(null);
    }
    return set.stream().min(Integer::compareTo).get();
}

/**
 *  Adds an item to the set or does nothing it already there	
 * @param item An integer
 */
public void add(int item) {
    if (!contains(item)) {
        set.add(item);
    }
}
 


/**
 * Removes an item from the set or does nothing if not there
 * @param item An integer
 */
public void remove(int item) {
    set.remove(Integer.valueOf(item));
}


/**
 *  Set union
 * @param setb
 */
public void union(IntegerSet intSetb) {
    for (int item : intSetb.set) {
        add(item);
    }
}



/**
 *  Set intersection
 * @param setb An IntegerSet Type
 */
public void intersect(IntegerSet intSetb) {
    set.retainAll(intSetb.set);
}


/**
 *  Set difference, i.e., s1 – s2
 * @param set2 An IntegerSet Type
 */
public void diff(IntegerSet intSetb) {
    set.removeAll(intSetb.set);
} 


/**
 *  Set Complement
 * @param setb An IntegerSet Type
 */
public void complement(IntegerSet intSetb) {
	ArrayList<Integer> complementSet = new ArrayList<>(this.set);
    complementSet.removeAll(intSetb.set);
    this.set = complementSet;
}

/**
 * Returns true if the set is empty, false otherwise
 * @return Boolean
 */
public boolean isEmpty() {
    return set.isEmpty();
}

/**
 *  Return String representation of your set
 */
public String toString() {
    return set.toString();
}
}