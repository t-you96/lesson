package event;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Event {

	private String name;
	Date d = new Date();
	ArrayList<Sankasha> sankasha = new ArrayList<>();

	public Event(String name) {
		this.name = name;
	}

	public void add(Sankasha s) {
		sankasha.add(s);
	}

	public void show() {
		System.out.println(this.name);

		SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println(f.format(d));

		for (Sankasha s : sankasha) {
			System.out.println(s.getName() + " " + s.getAge() + "歳");
		}
		System.out.println();
	}

}
