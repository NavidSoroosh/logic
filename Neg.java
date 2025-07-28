package tp;

public class Neg implements Formula {

	Formula f;

	public Neg (Formula f) {
		this.f = f;
	}

	public String ToString () {
		return "Neg" + f.ToString();
	}

	@Override
	public Boolean verite(Model model, World world) {
		return !f.verite(model, world);
	}
}
