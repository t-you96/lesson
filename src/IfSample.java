
public class IfSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	int age=20;
	if (age>=20) {
		System.out.println("お酒を飲めます");
	}else {
		System.out.println("ジュースを飲みます");
	}
	
	System.out.println("数字を入力してくだしゃい");
	int num = new java.util.Scanner(System.in).nextInt();
	if (num==10) {
		System.out.println("bingo!");
	}else {
		System.out.println("fail");
	}
		
	}

}
