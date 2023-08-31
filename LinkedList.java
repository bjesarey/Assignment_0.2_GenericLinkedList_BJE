package linkedList;

/**
 * @author njohnson3 and Brandon Esarey
 * @version 1.0 
 * Assignment 0.2 
 * CS215 Semester year Fall 2023
 */
public class LinkedList<T> {

	Node<T> head;
	int length;
	Node<T> tail;

	public LinkedList() {
		head = null;
		length = 0;
		tail = head;
	}//end constructors

	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else
			return false;
	}//end isEmpty()

	public Node<T> getList() {
		return head;
	}//end getList()

	public void addNode(Node<T> aNode) {
		if (isEmpty()) {
			head = aNode;
			tail = head;
			return;
		}//end if
		tail.nextNode = aNode;
		tail = tail.nextNode;
		tail.nextNode = null;
		length++;

	}//end addNode

}//end LinkedList