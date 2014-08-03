
public class MyList implements Item{

	Node start;
	Node end;
	
	public MyList(){
	
	}
	
	public void append(Item item){
		Node node = new Node( item, null);
		if(this.start == null){
			this.start = node;
		}
		else
		
			this.end.next = node;
			this.end = node;
		
	}
	
	public void appendList(MyList list){
		Node node = list.start;
		while(node != null)
		{
			if(this.start == null)
			{
				this.start = node;
			}
			else
			{
				this.end.next = node;	
			
			this.end = node;
			}
			node = node.next;
		}
	}
	
	public Item clone(){
		return this;
	}
	
	public String toString(){
		String s = "(";
		Node node = this.start;
		while (node != null)
		{
			s += node.data.toString() + ",";
			node = node.next;
		}
		s =	s.substring(0, s.length() - 1)+")";
		return s;
	}
	
	public int length(){
		int count = 0;
		Node node = this.start;
		while(node !=null)
		{
			count++;
			node = node.next;
		}
		return count;
	}
	
	public boolean equals(Item mylist){
		
	}
	
	//public Item find()
}