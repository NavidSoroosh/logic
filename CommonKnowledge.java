package tp;

import java.util.Set;

public class CommonKnowledge implements Formula {

	Set<String> agents;
	Formula f;
	
	public CommonKnowledge (Set<String> newAgents, Formula newF) {
		this.agents = newAgents;
		this.f = newF;
	}
	
	@Override
	public String ToString() {
		return "CommonKnowledge" + f.ToString();
	}

	@Override
	public Boolean verite(Model model, World world) {
		// TODO Auto-generated method stub
		return null;
	}

}
