package tp;

public class Box implements Formula {
	
	Formula f;

	public Box (Formula f) {
		this.f = f;
	}

	public String ToString () {
		return "Box" + f.ToString();
	}

	@Override
	public Boolean verite(Model model, World world) {
		for (World currentWorld : model.getAccess(world)) {
			if (f.verite(model, currentWorld) == false) {
				return false;
			}
		}
		return true;
	}
}
