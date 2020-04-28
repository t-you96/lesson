package obj;

import java.util.ArrayList;

public class SeitoMain {

	public static void main(String[] args) {

		ArrayList<Chugakusei> students = new ArrayList<Chugakusei>();

		students.add(new Chugakusei("a",89,88,95,97));
		students.add(new Chugakusei("b",96,98,99,90));
		students.add(new Chugakusei("c",100,98,99,92));

		int sum = 0;

		for(Chugakusei c : students) {
			sum += c.goukei();
		}

		System.out.println("合計点数は" + sum);

	}

}
