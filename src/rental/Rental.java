package rental;

import java.util.ArrayList;

public class Rental {

	ArrayList<Item> list = new ArrayList<Item>();

	public void add(Item item) {
		this.list.add(item);
	}

	public void show() {
		for (Item i : list) {
			System.out.println(i);
		}
	}

	int getGoukei() {
		int sum = 0;
		for (Item i : list) {
			sum += i.getPrice();
		}
		return sum;
	}

}
