package tp;

public class Bot extends Cst {

	public String ToString () {
		return "bot";
	}

	@Override
	public Boolean verite(Model model, World world) {
		return false;
	}
}
