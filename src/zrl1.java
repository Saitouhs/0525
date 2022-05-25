
interface IDrink {
	void drink();
}

class Mdrink implements IDrink{

	@Override
	public void drink(){
		System.out.println("Water................................");
	}
}
class XDrink implements IDrink{

	@Override
	public void drink() {
		System.out.println("Milk.................................");
	}
}
public class zrl1 {

	public static void main(String[] args) {
		IDrink drink = null;
		drink = new Mdrink();
		drink.drink();
		drink = new XDrink();
		drink.drink();


	}
}
