/**
 * Creates a node that will store a generic value.
 */
package linkedList;

/**
 * @author njohnson3 and Brandon Esarey
 * @version 1.0 
 * Assignment 0.2 
 * CS215 Semester year Fall 2023
 *
 */
class Node<T> {
	T data;
	Node<T> nextNode;

	public Node() {
		nextNode = null;
		data = null;
	}// end constructors

	public void setData(T data) {
		this.data = data;
	}// end setData()

	public Node<T> getNode() {
		return this;
	}// end getNode()

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}// end setNextNode()

}// end Node