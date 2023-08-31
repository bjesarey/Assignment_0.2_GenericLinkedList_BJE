/**
 * Creates a linked list and prints the contents.
 */
package linkedList;

/**
 * @author Brandon Esarey
 * @version 1.0 
 * Assignment 0.2 
 * CS215 Semester year Fall 2023
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList myList = new LinkedList();

		Node aNode = new Node();
		aNode.setData(1);
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData(2.34);
		myList.addNode(aNode);

		Node tempnode = myList.getList();
		do {
			System.out.println(tempnode.data);
			tempnode = tempnode.nextNode;
		} while (tempnode != null);

	}//end main()

}//end Application
