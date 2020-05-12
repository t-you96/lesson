package sales;

import java.util.ArrayList;

public class SalesMain {

	public static void main(String[] args) {

		ArrayList<Sales> list = new ArrayList<>();

		list.add(new Sales("田中",1500));
		list.add(new Sales("山田",3000));
		list.add(new MemberSales("鈴木",1000));
		
		int sum = 0;
		for (Sales s : list) {
			System.out.println(s);
			sum += s.getTotal();
		}
		System.out.println("合計 " + sum + "円");

	}

}
