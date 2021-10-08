
public class Sold implements State {

	Hammer hammer;
	
	public Sold(Hammer hammer) {
		this.hammer = hammer;
	}

	@Override
	public void hammerstate() {

		System.out.println("Hammer has sold");	

	}

}
