package ac.id.itb.ppl.a;

public class ABB extends AB {
	private int x;
	
	public ABB() {
		System.out.println("Konstruktor di kelas ABB");
	}
	
	@Override
	public void f() {
		super.f();
		System.out.println("Method f di kelas ABB");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	@Override
	public String toString() {
		return "toString di kelas ABB, x = "+ x;
	}
}
