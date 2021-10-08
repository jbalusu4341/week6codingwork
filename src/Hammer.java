
public class Hammer {
	State bought;
	State hasnotbought;
	State sold;
	State soldout;

	State state;

	
	public Hammer() {
		bought = new Bought(this);
		hasnotbought = new HasnotBought(this);
		sold = new Sold(this);
		soldout = new SoldOut(this);
		
		state = hasnotbought;
	}

	public void hammerstate()
	{
		state.hammerstate();
	}
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getBought() {
		return bought;
	}

	public State getHasnotbought() {
		return hasnotbought;
	}

	public State getSold() {
		return sold;
	}

	public State getSoldout() {
		return soldout;
	}
	
	
	


}
