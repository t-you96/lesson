package rental;

public class Book extends Item{

	public Book(String name,int days) {
		super(name,days);
	}

	@Override
	int getPrice() {
		return days * 50;
	}

}
