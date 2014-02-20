package ac.id.itb.ppl;

import java.util.ArrayList;

public class Q {

	private ArrayList<P> gudang;
	
	public Q() {
		System.out.println("Konstruktor di kelas Q");
		gudang = new ArrayList<P>();
	}

	public void addBarang(P barang) {
		gudang.add(barang);
	}
	
	public int getSizeGudang() {
		return gudang.size();
	}
}
