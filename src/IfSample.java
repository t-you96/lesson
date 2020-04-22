
public class IfSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	int age=20;
	if (age>=20) {
		System.out.println("お酒を飲めます");
	}else {
		System.out.println("ジュースを飲みます");
	}
	
	System.out.println("成績を入力してくだしゃい");
	int num= new java.util.Scanner(System.in).nextInt();
	if (num >= 80 && num <= 100) {
		System.out.println("rank A");
	}else if (num >= 60 && num < 80){
		System.out.println("rank B");
	}else if (num >= 0 && num < 60){
		System.out.println("rank C");
	}else {
		System.out.println("エラー");
	}
	
	}

}
