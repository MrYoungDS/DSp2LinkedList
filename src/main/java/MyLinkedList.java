/**
 * The MyLinkedList class is the implementation of a singly-linked list of integers.
 * <p>
 * The data in the list will be stored in <code>Node</code> objects, with each node
 * storing one integer and a link to the next node in the list. To make things
 * simple, we will implement <code>Node</code> as a private inner class with public fields.
 * Our <code>MyLinkedList</code> will implement some of the same methods as the
 * <code>MyArrayList</code> class, but with three versions of add: addFirst, addLast, and
 * add with an index for the position of the new node after the operation.
 * <p>
 * Students should not, obviously, use the <code>java.util.LinkedList</code> Java library class.
 * Due to the nature of the garbage collector, attention must be paid to the order used
 * for certain operations - you need to "hold on" to anything you do not want to lose
 * with an object reference, and only overwrite a reference if you no longer need the
 * object that it is referencing.
 * <p>
 * You may, of course, wish to add additional instance fields and private methods, but
 * please do not modify the inner <code>Node</code> class (you can change variable names).
 * Be sure to manage the <code>IndexOutOfBoundsException</code>.
 */

public class MyLinkedList
{
    /**
     * The Node class is a private inner class of the <code>MyLinkedList</code> class.
     * Since none of the methods of <code>MyLinkedList</code> will return a node,
     * it is safe to make the instance fields here public. Please do not modify
     * this class.
     */
    private static class Node
    {
        // These fields both default to null, but you can modify them directly.
        public Integer value;
        public Node next;
    }

    private Node first;

    /**
     * Constructs an empty list.
     */
    public MyLinkedList() {
        // TODO your code here
    }

    /**
     * Appends the specified Integer to the beginning of the list.
     * @param item Integer to be appended to this list
     * @throws NullPointerException if item is null
     */
    public void addFirst(Integer item) {
        // TODO your code here
    }

    /**
     * Appends the specified Integer to the end of the list.
     * @param item Integer to be appended to this list
     * @throws NullPointerException if item is null
     */
    public void addLast(Integer item) {
        // TODO your code here
    }

    /**
     * Inserts the specified Integer at the specified position in this list.
     * Shifts the element currently in that position (if any) and any subsequent
     * elements to the right (adding one to their indices).
     * @param index index at which the specified Integer is to be inserted
     * @param item Integer to be inserted
     * @throws IndexOutOfBoundsException if index is out of bounds
     * @throws NullPointerException if item is null
     */
    public void add(int index, Integer item) {
        // TODO your code here
    }

    /**
     * Removes the Integer at the specified position in this list. Shifts any
     * subsequent Integers to the left (subtracts one from their indices).
     * @param index the index of the Integer to remove
     * @return the Integer that was removed from the list
     * @throws IndexOutOfBoundsException if index is out of bounds
     */
    public int remove(int index) {
        // TODO replace the code here
        return 0;
    }

    /**
     * Returns the Integer at the specified position in this list.
     * @param index index of the element to return
     * @return the Integer at the specified position in this list
     * @throws IndexOutOfBoundsException if index is out of bounds
     */
    public Integer get(int index) {
        // TODO replace the code here
        return 0;
    }

    /**
     * Replaces the Integer at the specified position in this list with the
     * specified Integer.
     * @param index index of the integer to replace
     * @param item Integer to be stored at the specified position
     * @throws IndexOutOfBoundsException if index is out of bounds
     * @throws NullPointerException if item is null
     */
    public void set(int index, Integer item) {
        // TODO your code here
    }

    /**
     * Returns the number of Integers in this list.
     * @return the number of Integers in this list
     */
    public int size() {
        // TODO replace the code here
        return 0;
    }

    /**
     * Returns the index of the first occurrence of the specified Integer in this list,
     * or -1 if this list does not contain the Integer.
     * @param item Integer to search for
     * @return the index of the first occurrence of the specified Integer in this list,
     * or -1 if this list does not contain the Integer
     * @throws NullPointerException if item is null
     */
    public int indexOf(Integer item) {
        // TODO replace the code here
        return 0;
    }

    /**
     * Returns <code>true</code> if this list contains the specified Integer.
     * @param item Integer whose presence in this list is to be tested
     * @return true if this list contains the specified Integer
     * @throws NullPointerException if item is null
     */
    public boolean contains(Integer item) {
        // TODO replace the code here
        return false;
    }

    /**
     * Removes all the elements from this list. The list will be empty after this
     * call returns.
     */
    public void clear() {
        // TODO your code here
    }

    /**
     * Returns <code>true</code> if this list has no elements.
     * @return true if this list is empty
     */
    public boolean isEmpty() {
        // TODO replace the code here
        return false;
    }
}
