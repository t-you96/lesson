package obj;

public class Chugakusei extends Seito{

	int english;

	public Chugakusei(String name,int kokugo,int math,int society,int english) {
		super(name,kokugo,math,society);
		this.english = english;
	}

	public int goukei() {
		return super.goukei() + this.english;
	}


}
