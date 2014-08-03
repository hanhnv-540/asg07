
public class StringItem implements Item{

	private String value;
	
	public StringItem(String str){
		this.value = str;
	}
	
	public Item clone(){
		return this;
	}
	
	public String toString(){
	 return "" + value;
	}

	public boolean equals(Item otherItem){
		if (otherItem instanceof Item){
		StringItem sitem = (StringItem)otherItem;
		if(sitem.value == this.value){
			return true;
		}
		else return false;
	}
	else return false;
	}
}