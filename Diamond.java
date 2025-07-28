package tp;

public class Diamond implements Formula {

	Formula f;

	public Diamond (Formula f) {
		this.f = f;
	}

	public String ToString () {
		return "Diamond" + f.ToString();
	}

	@Override
	public Boolean verite(Model model, World world) {
		for (World currentWorld : model.getAccess(world)) {
			if (f.verite(model, currentWorld) == true) {
				return true;
			}
		}
		return false;
	}
}
