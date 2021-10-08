
public class Bought implements State {

	Hammer hammer;
	
	public Bought(Hammer hammer) {
		this.hammer = hammer;
	}

	@Override
	public void hammerstate() {

		System.out.println("Hammer has bought");	

	}

}
