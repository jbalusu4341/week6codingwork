public class HammerMainTestClass {

	public static void main(String[] args) {
	
	Hammer ham = new Hammer();
	ham.hammerstate();
	
	Bought b = new Bought(ham);
	b.hammerstate();

	
	SoldOut so= new SoldOut(ham);
	so.hammerstate();
	
	Sold s = new Sold(ham);
	s.hammerstate();

	}
}
