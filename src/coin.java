
public class coin {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] coins = {500,100,50,10,5,1};
		int sum = 0;
		
		for(int coin : coins) {
			System.out.println(coin + "円玉は何枚？");
			int maisu=new java.util.Scanner(System.in).nextInt();
			sum += coin * maisu;
		}
		System.out.println(sum + "円");
		
	}

}
