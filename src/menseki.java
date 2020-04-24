
public class menseki {

	public static void main(String[] args) {
		
		enMenseki(10);//1、半径10の円の面積
		
		for(int n = 1 ; n <= 5 ; n++) {
			enMenseki(n);//2、半径1から5の円の面積(for)
		}
		
		int[] m = {3,8,20};
		for (int i : m) {
			enMenseki(i);//3、半径3 8 20の円の面積(配列)
		}

	}
	
	public static void enMenseki(int hankei) {
		
		System.out.println(hankei * hankei * 3.14);
		
	}

}
