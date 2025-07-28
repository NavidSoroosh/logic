package tp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Atom a = new Atom("phi", null);
		HashSet<Atom> set = new HashSet<>();
		set.add(a);
		
		World world = new World(set);
		HashMap<World, Set<World>> worlds = new HashMap<World, Set<World>>();
		
		Set<World> accessWorlds = new HashSet<World>();
		accessWorlds.add(world);
		
		worlds.put(world, accessWorlds);
		Model m = new Model(worlds);
		Formula f = new And(new Atom("A", null), new Atom("B", null));
		Formula fa = new Neg(a);
		System.out.println(f.ToString());
		System.out.println(fa.verite(m, world));
	}
}
