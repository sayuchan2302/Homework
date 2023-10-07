package Task_2;

public class OrderItem implements Comparable<OrderItem> {
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

	@Override
	public String toString() {
		return "OrderItem [p=" + p + ", quality=" + quality + "]";
	}

	@Override
	public int compareTo(OrderItem o) {
		// TODO Auto-generated method stub
		return p.getId().compareTo(o.getP().getId());
	}

}
