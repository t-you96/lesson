package sales;

public class MemberSales extends Sales{

	public MemberSales(String name, int kingaku) {
		super(name, kingaku);
	}

	@Override
	public int getSouryou() {
		return 0;
	}

}
