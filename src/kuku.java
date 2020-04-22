
public class kuku {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	int num1 = new java.util.Random().nextInt(9) + 1;	
	int num2 = new java.util.Random().nextInt(9) + 1;
	
	int seikai = num1*num2;
	
	System.out.println(num1 + "x" + num2 + "=");
	
	int ans=new java.util.Scanner(System.in).nextInt();
	
	if (ans == seikai) {
		System.out.println("正解");
	}else {
		System.out.println("間違い。正解は" + seikai);
	}
		
	}

}
