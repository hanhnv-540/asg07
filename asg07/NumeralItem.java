
public class NumeralItem implements Item{

	private int value;
	
	public NumeralItem(int value){
		this.value = value;
	}
	
	public Item clone(){
		return this;
	}
	
	public String toString(){
		return "" + this.value;
	}
	
	public boolean equals(Item otherItem){
		if (otherItem instanceof Item){
			NumeralItem Nitem = (NumeralItem)otherItem;
			if(Nitem.value == this.value){
				return true;
			}
		else return false;
		}
	else return false;
	}
}