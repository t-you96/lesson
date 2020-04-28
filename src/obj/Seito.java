package obj;

public class Seito {

	String name;
	int kokugo;
	int math;
	int society;

	public Seito(String name,int kokugo,int math,int society) {
		this.name = name;
		this.kokugo = kokugo;
		this.math = math;
		this.society = society;
	}

	public void show() {
		System.out.print(name + " 国語" + kokugo + "点 数学" + math + "点 社会" + society + "点" );
	}

	public int goukei() {
		int g = kokugo + math + society;
		return g;
	}

	public double heikin() {
		double h = (kokugo + math + society) / 3.0;
		return h;
	}

}
