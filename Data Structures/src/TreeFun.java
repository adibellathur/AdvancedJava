
public class TreeFun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.add(5);
		tree.add(10);
		tree.add(2);
		tree.add(4);
		tree.add(7);
		tree.add(9);
		
		tree.print();
		
		System.out.println("Tree contains 4?" + tree.contains(4));
	}

}
