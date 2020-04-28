package obj;

import java.util.ArrayList;

public class DrinkMain {

	public static void main(String[] args) {

		int sum = 0;

		ArrayList<Drink> dlist = new ArrayList<Drink>();

		dlist.add(new Drink("コーラ",500));
		dlist.add(new Drink("コーヒー",300));
		dlist.add(new Drink("ウーロン茶",700));
		dlist.add(new Drink("三ツ矢サイダー",800));

		for(Drink d : dlist) {
			d.show();
			sum += d.amount;
		}

		System.out.println("合計 " + sum + "ml");

	}

}
