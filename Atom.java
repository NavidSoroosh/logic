package tp;

public class Atom implements Formula {

	String p;
	Cst cst;
	
	public Atom(String newP, Cst newCst) {
		this.p = newP;
		this.cst = newCst;
	}

	public String ToString () {
		return p;
	}

	@Override
	public Boolean verite(Model model, World world) {
		return true;
	}
}
