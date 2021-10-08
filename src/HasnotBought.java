
public class HasnotBought implements State {

	Hammer hammer;
	
	public HasnotBought(Hammer hammer) {
		this.hammer = hammer;
	}

	@Override
	public void hammerstate() {

		System.out.println("Hammer has not bought");	

	}

}
