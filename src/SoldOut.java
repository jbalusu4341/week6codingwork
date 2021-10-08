
public class SoldOut implements State {

	Hammer hammer;
	
	public SoldOut(Hammer hammer) {
		this.hammer = hammer;
	}

	@Override
	public void hammerstate() {

		System.out.println("Hammer has not sold");	

	}

}
