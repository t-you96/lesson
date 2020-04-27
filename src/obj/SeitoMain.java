package obj;

public class SeitoMain {

	public static void main(String[] args) {
		
		Seito st = new Seito();
		
		st.name = "北川";
		st.kokugo = 92;
		st.math = 61;
		st.society = 70;
		st.show();
		
		System.out.println();
		
		System.out.println("合計は" + st.goukei() + "点");
		
		System.out.println("平均は" + st.heikin() + "点");

	}

}
