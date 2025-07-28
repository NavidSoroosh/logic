package tp;

public class Top extends Cst {

	public String ToString () {
		return "top";
	}
	
	@Override
	public Boolean verite(Model model, World world) {
		return true;
	}
}
