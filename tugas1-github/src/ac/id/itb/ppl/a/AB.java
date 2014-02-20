package ac.id.itb.ppl.a;

public class AB extends A implements B, C {

	public AB() {
		System.out.println("Konstruktor di kelas AB");
	}
	
	@Override
	public void v() {
		System.out.println("Method v di kelas AB");
	}

	@Override
	public void g() {
		System.out.println("Method g di kelas AB");
	}

	@Override
	public void f() {
		System.out.println("Method f di kelas AB");
	}

}
