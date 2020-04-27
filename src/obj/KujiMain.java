package obj;

public class KujiMain {

	public static void main(String[] args) {

		Kuji k1 = new Kuji();
		k1.num =123456;

		Kuji k2 = new Kuji();
		k2.num =101012;

		Kuji k3 = new Kuji();
		k3.num =654321;

		KujiChecker kc = new KujiChecker();
		kc.check(k1);
		kc.check(k2);
		kc.check(k3);

		k1.show();
		k2.show();
		k3.show();

	}

}
