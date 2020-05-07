package rental;

import java.util.ArrayList;

public class RentalMain {

	public static void main(String[] args) {

		ArrayList<Item> list = new ArrayList<Item>();

		list.add(new Book("ワンピース",7));
		list.add(new CD("パプリカ",3));
		list.add(new CD("Lemon",1));

		int sum = 0;

		for (Item i : list) {
			System.out.println(i);
			sum += i.getPrice();
		}

		System.out.println("合計 " + sum + "円");

	}

}
