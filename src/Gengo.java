
public class Gengo {

	public static void main(String[] args) {
		
		System.out.println("1:昭和 2:平成 3:令和");
		int gengonum = new java.util.Scanner(System.in).nextInt();
		System.out.print(getGengouName(gengonum));
		
		int nen = new java.util.Scanner(System.in).nextInt();	
		
		if (nen!=1) {
			System.out.print(getGengouName(gengonum) + nen + "年は西暦" + getSeireki(gengonum,nen) + "年です。");
		}else {
			System.out.print(getGengouName(gengonum) + "元年は西暦" + getSeireki(gengonum,nen) + "年です。");
		}
	}
		
	public static int getSeireki(int gengou,int nen) {
		
		if (gengou == 1) {
			return 1926 + nen - 1;
		}
		if (gengou == 2) {
			return 1989 + nen - 1;
		}
		if (gengou == 3) {
			return 2019 + nen - 1;
		}
			return 0;
		
	}
		
	public static String getGengouName(int gengou) {
		
		if (gengou == 1) {
			return "昭和";
		}
		if (gengou == 2) {
			return "平成";
		}
		if (gengou == 3) {
			return "令和";
		}
			return "エラー";
	}

}
