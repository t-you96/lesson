
public class main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int month=4;
		int day=22;
		System.out.println("今日ハ" + month + "月" + day + "日デス");

		double p=3.14;
		System.out.println("円周率ハ" + p + "デス");
		
		int a=20;
		int b=a + 5;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("C:\\に\"フォルダ\"を作成");
		
		int num=10;
		int amari=10 % 3;
		System.out.println(amari);
		
		num+= 5;
		System.out.println(num);
		
		num++;
		System.out.println(num);
		
		double d=3;
		int n= (int)d;
		String s="ベスト" + 3;
		System.out.println(n + s);
		
		int kokugo=70;
		int sansu=75;
		double heikin=(kokugo+sansu)/2.0;
		System.out.println(heikin);
		
		int num1=3;
		int num2=5;
		System.out.println("足し算の結果は" + (num1 + num2));
		
		System.out.print("Northlondon ");
		System.out.print("is ");
		System.out.println("white");
		
		int m= Math.max(10, 20);
		System.out.println(m);
		
		String age= "16";
		int nAge = Integer.parseInt(age);
		System.out.println("永遠の" + (nAge+1) + "歳");
		
		int r = new java.util.Random().nextInt(90);
		System.out.println(r);
		
		int saikoro = new java.util.Random().nextInt(6) + 1;
		System.out.println(saikoro);
	}

}
