package interfaceT;

public class ICICI implements UkBank, USBank {

	int mabbal = 5000;

	public void atmcard() {
		System.out.println("UKBank- Atmcard");
	}

	public void trading() {
		System.out.println("UKBank- trading");
	}

	public void credit() {
		System.out.println("USBank- Credit");
	}

	public void debit() {
		System.out.println("USBank- Debit");
	}

	public void homeloan() {
		System.out.println("ICICI bank home loan...");
	}
}
