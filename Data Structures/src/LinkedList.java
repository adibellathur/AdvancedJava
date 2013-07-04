
public class LinkedList 
{

	ListNode first = null;
	
	public LinkedList()
	{
		
	}
	
	public void add(int number)
	{		
		if (first == null)
		{
			first = new ListNode(number);
			first.setValue(number);			
		}
		else
		{
			//find the last node
			ListNode temp = first;
			while(temp.getNext() != null)
			{
				temp = temp.getNext();
			}
			temp.setNext(new ListNode(number));
		}
	}
	
	public void remove(int number)
	{
		if(first.getValue() == number)
		{
			first = first.getNext();
		}
		else
		{
			ListNode a = first;
			ListNode b = first.getNext();
			while (b != null)
			{
				if (b.getValue() == number)
				{
					a.setNext(b.getNext());
					b = b.getNext();
				}
				
				a = a.getNext();
				if (b != null) {b = b.getNext();}
			}
		}
	}
	
	public void removeFirst()
	{
		first = first.getNext();
		
	}
	
	public void removeLast()
	{
		
	}
	
	public void removeNth(int n)
	{
		int position = 0;
		ListNode temp = first;
		
		if(n == 0)
		{
			first = first.getNext();
			return;
		}
		if (n >= size)
		while(position < n - 1)
		{
			temp = temp.getNext();
		}
		
		
	}
	
	public void print()
	{
		
		ListNode temp = first;
		
		System.out.print("[");
		while(temp != null)
		{
			System.out.print(temp.getValue() + ", ");
			temp = temp.getNext();
		}
		System.out.print("]");
					
		// 1. print out a node
		//2. ask for the next node
		// repeat 1
	}
	
	public int size()
	{
		int size = 0;
		ListNode temp = first;
		while(temp != null)
		{
			size ++;
			temp = temp.getNext();
		}
		//do something that increments size each node
		
		return (size);
	}
}
