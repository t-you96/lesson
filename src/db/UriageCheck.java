package db;

import java.util.ArrayList;

public class UriageCheck {
	static final String URL =  "jdbc:mysql://localhost/hanbai?useSSL=false";
	static final String USER = "java";
	static final String PASS = "pass";

	public static void main(String[] args) {
		
		ShouhinDAO dao = new ShouhinDAO();
		UriageDAO dao2 = new UriageDAO();
		
		ArrayList<Shouhin> list = dao.findAll();
		for( Shouhin s : list) {
			System.out.println(s.getSid() + " " + s.getSname());
		}
		
		System.out.println("どの売り上げを見たいですか？");
		int num=new java.util.Scanner(System.in).nextInt();
		
		ArrayList<Uriage> list2 = dao2.findBySid(num);
		for( Uriage u2 : list2) {
			System.out.println(u2.getHi() + " " + u2.getKosu() + "個");
		}

	}

}
