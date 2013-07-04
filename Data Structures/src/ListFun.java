
public class ListFun {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		LinkedList list = new LinkedList();
		list.add(5);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(25);
		list.add(12);
		list.add(1);
		list.print();
		
		System.out.println("The List size is " + list.size());
		
		list.remove(4);
		list.print();
		
		list.remove(1);
		list.print();
	}

}
