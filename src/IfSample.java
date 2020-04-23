
public class IfSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	
	System.out.print("番号を入力してください");
	int bango= new java.util.Scanner(System.in).nextInt();
	
	switch(bango) {
	
	  case 1:
		System.out.println("コーラ");
		break;
		
	  case 2:
		System.out.println("コーヒー");
		break;
		
	  case 3:
		System.out.println("水");
		break;
		
	  default:
		System.out.println("ERROR");
		break;
	}
	
	}

}
