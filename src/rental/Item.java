package rental;

public abstract class Item {

	String name;
	int days;

	public Item(String name,int days) {
		this.name = name;
		this.days = days;
	}

	abstract int getPrice();

	@Override
	public String toString() {
		return name + " " + days + "日 " + getPrice() + "円";
	}


}
