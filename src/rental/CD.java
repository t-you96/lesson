package rental;

public class CD extends Item{

	public CD(String name,int days) {
		super(name,days);
	}

	@Override
	int getPrice() {
		return 300 + (days - 1) * 100;
	}

}
