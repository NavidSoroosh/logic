package tp;

public class And implements Formula {

	Formula leftF;
	Formula rightF;
	
	public And (Formula left, Formula right) {
		this.leftF = left;
		this.rightF = right;
	}

	public String ToString () {
		return "(" + leftF.ToString() + " And " + rightF.ToString() + ")";
	}

	@Override
	public Boolean verite(Model model, World world) {
		return leftF.verite(model, world) && rightF.verite(model, world) ? true : false;
	}
}
