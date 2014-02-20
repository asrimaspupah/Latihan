package ac.id.itb.ppl;

import ac.id.itb.ppl.a.*;

public class Main implements X {

	static final double PI = 3.14;
	
	public static void main(String[] args) {
		System.out.println("PI : "+ PI);
		
		/*System.out.println("=== Bikin AB ===");
		AB ab = new AB();
		System.out.println(ab);*/
		
		System.out.println("=== Bikin ABB ===");
		ABB abb = new ABB();
		abb.f();
		abb.g();
		abb.v();
		System.out.println(abb.getX());
		System.out.println(abb);
		
		//P p = new P();
		Q q = new Q();
		q.addBarang(new P());
		q.addBarang(new P());
		System.out.println("Ukuran gudang: " + q.getSizeGudang());
		
	}

}
