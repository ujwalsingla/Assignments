import java.util.*; 
class Node 
{ 
int data; 
Node leftChild; 
Node rightChild; 
Node(int data) 
{ 
	this.data = data; 
} 
} 

class BinaryTree { 
Node rootNode; 

void printTraversal() { 
	 
	if (rootNode == null) { 
	return; 
	} 
 
	Stack<Node> s1 = new Stack<>(); 
	Stack<Node> s2 = new Stack<>(); 

	s1.push(rootNode); 
	boolean leftToRight = false;

	while (!s1.isEmpty()) { 
 
	Node node = s1.pop(); 
	
	System.out.print(node.data + " ");
 
	if (leftToRight) { 
		if (node.leftChild != null) { 
		s2.push(node.leftChild); 
		} 
		
		if (node.rightChild != null) { 
		s2.push(node.rightChild); 
		} 
	} 
	else { 
		if (node.rightChild != null) { 
		s2.push(node.rightChild); 
		} 
		
		if (node.leftChild != null) { 
		s2.push(node.leftChild); 
		} 
	} 

	if (s1.isEmpty()) { 
		leftToRight = !leftToRight; 
		Stack<Node> temp = s1; 
		s1 = s2; 
		s2 = temp; 
	} 
	} 
} 
} 

public class SpiralBinaryTree { 

public static void main(String[] args) 
{ 
	BinaryTree tree = new BinaryTree(); 
	tree.rootNode = new Node(50); 
	tree.rootNode.leftChild = new Node(30); 
	tree.rootNode.rightChild = new Node(80); 
	tree.rootNode.leftChild.leftChild = new Node(10); 
	tree.rootNode.leftChild.rightChild = new Node(40); 
	tree.rootNode.rightChild.leftChild = new Node(70); 
	tree.rootNode.rightChild.rightChild = new Node(150);
        tree.rootNode.leftChild.leftChild.leftChild = new Node(1);
        tree.rootNode.leftChild.leftChild.rightChild = new Node(2);

	System.out.println("Spiral Order traversal of binary tree is"); 
	tree.printTraversal(); 
} 
} 

