package tp;

public class Or implements Formula {

	Formula leftF;
	Formula rightF;
	
	public Or (Formula left, Formula right) {
		this.leftF = left;
		this.rightF = right;
	}

	public String ToString () {
		return "(" + leftF.ToString() + " Or " + rightF.ToString() + ")";
	}

	@Override
	public Boolean verite(Model model, World world) {
		return leftF.verite(model, world) || rightF.verite(model, world) ? true : false;
	}
}
