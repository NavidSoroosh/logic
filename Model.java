package tp;

import java.util.HashMap;
import java.util.Set;

public class Model {

	HashMap<World, Set<World>> accessWorlds;
	HashMap<String, HashMap<World, Set<World>>> ind;

	public Model(HashMap<World, Set<World>> newAccessWorlds) {
		this.accessWorlds = newAccessWorlds;
	}

	public Set<World> getAccess(World world) {
		return this.accessWorlds.get(world);
	}
	
	public void update(Formula f) {
		for (World currentWorld : accessWorlds.keySet()) {
			if (f.verite(this, currentWorld) == false) {
				accessWorlds.remove(currentWorld);
			}
		}
	}
}
