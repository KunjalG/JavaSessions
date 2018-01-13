package interfaceT;

public class TestInterface {

	public static void main(String[] args) {
		ICICI ic = new ICICI();
		ic.atmcard();
		ic.credit();
		ic.debit();
		ic.trading();
		ic.homeloan();

		USBank UB = new ICICI();
		UB.credit();
		UB.debit();

		System.out.println("Min bal is : " + USBank.minbal);
		System.out.println("Mix bal is : " + ICICI.minbal);
	}

}
