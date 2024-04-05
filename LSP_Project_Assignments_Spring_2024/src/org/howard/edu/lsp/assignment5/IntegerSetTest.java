package org.howard.edu.lsp.assignment5;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

public class IntegerSetTest {

    private IntegerSet emptySet;
    private IntegerSet set1;
    private IntegerSet set2;

    @BeforeEach
    void setUp() {
        emptySet = new IntegerSet();
        set1 = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
        set2 = new IntegerSet(new ArrayList<>(Arrays.asList(3, 4, 5)));
    }

    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        set1.clear();
        assertTrue(set1.isEmpty());
    }

    @Test
    @DisplayName("Test case for length")
    public void testLength() {
        assertEquals(0, emptySet.length());
        assertEquals(3, set1.length());
    }

    @Test
    @DisplayName("Test case for equals")
    public void testEquals() {
        IntegerSet equalSet1 = new IntegerSet(new ArrayList<>(Arrays.asList(1, 3, 2)));
        IntegerSet equalSet2 = new IntegerSet(new ArrayList<>(Arrays.asList(2, 1, 3)));
        IntegerSet differentSet = new IntegerSet(new ArrayList<>(Collections.singletonList(4)));

        assertTrue(set1.equals(equalSet1));
        assertTrue(set1.equals(equalSet2));
        assertFalse(set1.equals(set2));
        assertFalse(set1.equals(differentSet));
    }

    @Test
    @DisplayName("Test case for contains")
    public void testContains() {
        assertTrue(set1.contains(2));
        assertFalse(emptySet.contains(1));
    }

    // Test for largest element in a non-empty set
    @Test
    @DisplayName("Test case for largest in a non-empty set")
    public void testLargestInNonEmptySet() throws IntegerSetException {
        assertEquals(3, set1.largest());
    }

    // Test for largest element in an empty set (Exception test)
    @Test
    @DisplayName("Test case for largest in an empty set (Exception)")
    public void testLargestInEmptySet() {
        assertThrows(IntegerSetException.class, () -> emptySet.largest());
    }

    // Test for smallest element in a non-empty set
    @Test
    @DisplayName("Test case for smallest in a non-empty set")
    public void testSmallestInNonEmptySet() throws IntegerSetException {
        assertEquals(1, set1.smallest());
    }

    // Test for smallest element in an empty set (Exception test)
    @Test
    @DisplayName("Test case for smallest in an empty set (Exception)")
    public void testSmallestInEmptySet() {
        assertThrows(IntegerSetException.class, () -> emptySet.smallest());
    }

    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
        assertFalse(emptySet.contains(4));
        emptySet.add(4);
        assertTrue(emptySet.contains(4));
    }

    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
        set1.remove(2);
        assertFalse(set1.contains(2));
    }

    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
        set1.union(set2);
        assertTrue(set1.contains(1));
        assertTrue(set1.contains(2));
        assertTrue(set1.contains(3));
        assertTrue(set1.contains(4));
        assertTrue(set1.contains(5));
    }

    @Test
    @DisplayName("Test case for intersect")
    public void testIntersect() {
        set1.intersect(set2);
        assertTrue(set1.contains(3));
        assertFalse(set1.contains(1));
        assertFalse(set1.contains(2));
        assertFalse(set1.contains(4));
        assertFalse(set1.contains(5));
    }

    @Test
    @DisplayName("Test case for diff")
    public void testDiff() {
        set1.diff(set2);
        assertTrue(set1.contains(1));
        assertTrue(set1.contains(2));
        assertFalse(set1.contains(3));
        assertFalse(set1.contains(4));
        assertFalse(set1.contains(5));
    }

    @Test
    @DisplayName("Test case for complement")
    public void testComplement() {
        set1.complement(set2);
        assertTrue(set1.contains(1));
        assertTrue(set1.contains(2));
        assertFalse(set1.contains(3));
        assertFalse(set1.contains(4));
        assertFalse(set1.contains(5));
    }

    @Test
    @DisplayName("Test case for isEmpty")
    public void testIsEmpty() {
        assertTrue(emptySet.isEmpty());
        assertFalse(set1.isEmpty());
    }

    @Test
    @DisplayName("Test case for toString")
    public void testToString() {
        assertEquals("[1, 2, 3]", set1.toString());
        assertEquals("[]", emptySet.toString());
    }
}