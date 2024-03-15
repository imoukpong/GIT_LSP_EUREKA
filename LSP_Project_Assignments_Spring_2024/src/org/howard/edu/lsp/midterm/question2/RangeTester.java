package org.howard.edu.lsp.midterm.question2;

/**
 * A simple class to test the IntegerRange class.
 */
public class RangeTester {
    public static void main(String[] args) {
        // Create two integer ranges
        IntegerRange range1 = new IntegerRange(5, 10);
        IntegerRange range2 = new IntegerRange(8, 15);

        // Test containment
        System.out.println("Range 1 contains 7: " + range1.contains(7)); // true
        System.out.println("Range 2 contains 3: " + range2.contains(3)); // false

        // Test overlap
        System.out.println("Range 1 overlaps with Range 2: " + range1.overlaps(range2)); // true

        // Test size
        System.out.println("Size of Range 1: " + range1.size()); // 6
        System.out.println("Size of Range 2: " + range2.size()); // 8

        // Test equality
        IntegerRange range3 = new IntegerRange(5, 10);
        System.out.println("Range 1 equals Range 3: " + range1.equals(range3)); // true
    }
}

