
public class BinaryTree {

	TreeNode root;
	
	public BinaryTree (){
		
	}
	
	public void add(int value) {
		if (root == null) {
			root = new TreeNode(value);
		}
		else {
			TreeNode current = root;
			boolean done = false;
			
			while(! done) {
				if(value < current.value) {
					//send it to the left
					if(current.left != null) {
						//there is a left child
						current = current.left;
					}
					else {
						//there is no left child
						current.left = new TreeNode(value);		
						done = true;
					}
				}
				else {
					//send it to the right
					if(current.right != null) {
						current = current.right;
					}
					else {
						current.right = new TreeNode(value);
						done = true;
					}
				}
			}
		}
	}
	
	public boolean contains(int value) {
		TreeNode current = root;
		boolean done = false;
		
		while(! done) {
			if (current == null) {
				return false;
			}
			else if (value == current.value) {
				return true;
			}
			else if(value < current.value) {
				current = current.left;
			}
			else {
				current = current.right;
			}
		}
		
		return false;
	}
	
	public void print() {
		print(root, 0, "root");
	}
		
	
	public void print(TreeNode node , int indent , String note) {
		if(node == null) return;
		
		for(int i = 0 ; i < indent ; i++) {
			System.out.print(" ");
		}
		
		System.out.println(note + ": " + node.value);
		print(node.left, indent + 2, "left of: " + node.value);
		print(node.right, indent + 2, "right of: " + node.value);
	}
}
