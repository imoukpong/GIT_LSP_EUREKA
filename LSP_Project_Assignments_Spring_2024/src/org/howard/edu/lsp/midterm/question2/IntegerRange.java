package org.howard.edu.lsp.midterm.question2;

/**
 * Implementation of the Range interface for integer ranges.
 */
public class IntegerRange implements Range {
    private int lowerBound;
    private int upperBound;

    /**
     * Constructs an integer range with the specified bounds.
     *
     * @param lowerBound the lower bound of the range (inclusive)
     * @param upperBound the upper bound of the range (inclusive)
     */
    public IntegerRange(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    /**
     * Checks if the range contains a specific value.
     *
     * @param value the value to check
     * @return true if the range contains the value, false otherwise
     */
    @Override
    public boolean contains(int value) {
        return value >= lowerBound && value <= upperBound;
    }

    /**
     * Checks if the range overlaps with another range.
     *
     * @param other the other range to check for overlap
     * @return true if the ranges overlap, false otherwise
     */
    @Override
    public boolean overlaps(Range other) {
        IntegerRange otherRange = (IntegerRange) other;
        return this.lowerBound <= otherRange.upperBound && this.upperBound >= otherRange.lowerBound;
    }

    /**
     * Calculates the size of the range.
     *
     * @return the number of integers in the range
     */
    @Override
    public int size() {
        return upperBound - lowerBound + 1;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param obj the reference object with which to compare
     * @return true if this object is the same as the obj argument; false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        IntegerRange other = (IntegerRange) obj;
        return lowerBound == other.lowerBound && upperBound == other.upperBound;
    }
}

