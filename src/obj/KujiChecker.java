package obj;

public class KujiChecker {

	int money;

	public void check(Kuji k) {

		if (k.num == 123456) {
			k.result = "1等";
			money += 100000;
		}else if(k.num % 100 == 12){
			k.result = "2等";
			money += 1000;
		}else {
			k.result = "はずれ";
		}

		System.out.println("合計金額は" + money);

	}

}
