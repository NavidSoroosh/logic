package tp;

public class Implies implements Formula {

	Formula leftF;
	Formula rightF;
	
	public Implies (Formula left, Formula right) {
		this.leftF = left;
		this.rightF = right;
	}

	public String ToString () {
		return "(" + leftF.ToString() + " Implies " + rightF.ToString() + ")";
	}

	@Override
	public Boolean verite(Model model, World world) {
		if (leftF.verite(model, world) == true) {
			return rightF.verite(model, world) ? true : false;
		}
		
		return true;
	}
}
