class Node 
{ 
	int data; 
	Node left, right; 
	
	Node(int item) 
	{ 
		data = item; 
		left = right; 
	} 
} 

class ReverseBinaryTree 
{ 
	Node root; 
	void reverseLevelOrder(Node node) 
	{ 
		int h = height(node); 
		int i; 
		for (i = h; i >= 1; i--) 
		{ 
			printGivenLevel(node, i); 
		} 
	} 
	void printGivenLevel(Node node, int level) 
	{ 
		if (node == null) 
			return; 
		if (level == 1) 
			System.out.print(node.data + " "); 
		else if (level > 1) 
		{ 
			printGivenLevel(node.left, level - 1); 
			printGivenLevel(node.right, level - 1); 
		} 
	} 
	int height(Node node) 
	{ 
		if (node == null) 
			return 0; 
		else
		{ 
			int lh = height(node.left); 
			int rh = height(node.right); 

			/* use the larger one */
			if (lh > rh) 
				return(lh + 1); 
			else
				return(rh + 1); 
		} 
	} 
	public static void main(String args[]) 
	{ 
		BinaryTree tree = new BinaryTree(); 

		tree.root = new Node(50); 
		tree.root.left = new Node(30); 
		tree.root.right = new Node(80); 
		tree.root.left.left = new Node(10); 
		tree.root.left.right = new Node(40);
                tree.root.right.left = new Node(70);
                tree.root.right.right = new Node(150); 
		
		System.out.println("Reverse Level Order traversal of binary tree : "); 
		
                tree.reverseLevelOrder(tree.root); 
	} 
} 
