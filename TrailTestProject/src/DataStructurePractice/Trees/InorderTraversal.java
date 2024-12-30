package DataStructurePractice.Trees;

public class InorderTraversal {

	public static void main(String[] args) {

		Node root=new Node(1);
		root.left=new Node(2);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right=new Node(3);
		root.right.left=null;
		root.right.right=new Node(6);
		
		InorderTraverseUsingRecursion();
		
	}

	private static void InorderTraverseUsingRecursion() {
		// TODO Auto-generated method stub
		
	}

}

class Node {
	int data;
	Node left, right;

	Node(int data) {
		data = data;
		left = right = null;
	}
}
