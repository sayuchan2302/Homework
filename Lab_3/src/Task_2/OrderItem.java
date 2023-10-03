package Task_2;

public class OrderItem {
	private Product p;
	private int quality;

	public OrderItem(Product p, int quality) {
		super();
		this.p = p;
		this.quality = quality;
	}

	public double priceItem() {
		return p.getPrice();
	}

	public String typeItem() {
		return p.getType();
	}

	public Product getP() {
		return p;
	}
	
}
