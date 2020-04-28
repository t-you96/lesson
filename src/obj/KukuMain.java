package obj;

import java.util.ArrayList;

public class KukuMain {

	public static void main(String[] args) {

		ArrayList<KukuMondai> kukus = new ArrayList<KukuMondai>();

		kukus.add(new KukuMondai());
		kukus.add(new KukuMondai());
		kukus.add(new KukuMondai());
		kukus.add(new KukuMondai());
		kukus.add(new KukuMondai());

		for (KukuMondai k : kukus) {
			k.show();
			k.check(new java.util.Scanner(System.in).nextInt());
		}


	}

}
