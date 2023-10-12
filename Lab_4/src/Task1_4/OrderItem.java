package Task1_4;

public class OrderItem {
	private Product p;
	private int quantity;

	
	public OrderItem(Product p, int quantity) {
		super();
		this.p = p;
		this.quantity = quantity;
	}

	public Product getP() {
		return p;
	}

	@Override
	public String toString() {
		return p + " quantity: " + quantity + "\n";
	}

}
