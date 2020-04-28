package obj;

public class KukuMondai {

	int num1;
	int num2;

	public KukuMondai() {
		this.num1 = new java.util.Random().nextInt(9) + 1;
		this.num2 = new java.util.Random().nextInt(9) + 1;
	}

	public void show() {
		System.out.println(num1 + "x" + num2 + "=");
	}

	public void check(int kotae) {
		if (kotae == num1 * num2) {
			System.out.println("〇");
		}else {
			System.out.println("はずれ");
		}
	}

}
