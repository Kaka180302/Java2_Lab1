package product;

public class Product {
	private String id;
	private String name;
	private double basePrice;
	
	public Product () {}
	
	public Product(String id, String name, double basePrice) {
	    setId(id);
	    setName(name);
	    setBasePrice(basePrice);
	}
	public String getId() {
		return this.id;
	}

	public boolean setId(String id) {
		if (id != null && !id.trim().isEmpty()) {
			this.id = id;
			return true;
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public boolean setBasePrice(double basePrice) {
		if (basePrice >= 0) {
			this.basePrice = basePrice;
			return true;
		}
		return false;
	}
	
	public double finalPrice() {
		return this.basePrice;
	}
	
	@Override
    public String toString() {
        return "ID: " + id +
               ", \nName: " + name +
               ", \nBase Price: " + basePrice +
               ", \nFinal Price: " + finalPrice();
    }
}