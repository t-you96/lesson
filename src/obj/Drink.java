package obj;

public class Drink {

	String name;
	int amount;

	public Drink(String name,int amount) {
		this.name = name;
		this.amount = amount;
	}

	public void show() {
		System.out.println(name + " " + amount + "ml");
	}

}
