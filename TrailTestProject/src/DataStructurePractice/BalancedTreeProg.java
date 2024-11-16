package DataStructurePractice;

public class BalancedTreeProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node();
		root.AddNode(1);
		root.leftNode = root.AddNode(4);
		root.rightNode = root.AddNode(6);
		root.leftNode.leftNode = root.AddNode(3);
		root.printNode(root);

	}

}

class Node {
	int data;
	Node leftNode;
	Node rightNode;

	public Node AddNode(int data) {
		Node element = new Node();
		element.data = data;
		element.leftNode = null;
		element.rightNode = null;

		return element;
	}

	void printNode(Node n) {
		while (n != null) {
			System.out.println(n.data + " ");
			n = n.leftNode;
			System.out.println();
		}
	}

}
