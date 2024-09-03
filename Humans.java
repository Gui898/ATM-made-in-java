
public class Humans extends MeuATM {
	
	protected String name;
	
	public Humans(double initialBalance, String name) {
		balance = initialBalance;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return this.getName();
	}
	
}
