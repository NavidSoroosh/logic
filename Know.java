package tp;

public class Know implements Formula {

	String agent;
	Formula f;
	
	public Know (String newAgent, Formula newF) {
		this.agent = newAgent;
		this.f = newF;
	}
	
	@Override
	public String ToString() {
		return "Know" + f.ToString();
	}

	@Override
	public Boolean verite(Model model, World world) {
		for (World currentWorld : model.getAccess(world)) {
			if (f.verite(model, currentWorld) == false) {
				return false;
			}
		}
		return null;
	}

}
