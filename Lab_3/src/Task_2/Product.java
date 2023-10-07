package Task_2;

public class Product{
	private String id;
	private String name;
	private double price;
	private String type;
	public Product(String id, String name, double price, String type) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
	}
	public String getId() {
		return id;
	}
	
	
	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "id: " + id + " name: " + name + " price:" + price + " type:" + type ;
	}
	public double getPrice() {
		return price;
	}
	
}
