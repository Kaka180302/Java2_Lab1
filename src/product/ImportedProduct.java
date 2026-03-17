package product;

public class ImportedProduct extends Product {

	private double importTaxRate;
	private double shippingFee;
	
	public ImportedProduct () {}
	
	public ImportedProduct(String id, String name, double basePrice, double importTaxRate, double shippingFee) {
	    super(id, name, basePrice);
	    setImportTaxRate(importTaxRate);
	    setShippingFee(shippingFee);
	}

	public double getImportTaxRate() {
	    return importTaxRate;
	}
	
	public boolean setImportTaxRate(double importTaxRate) {
        if (importTaxRate >= 0 && importTaxRate <= 1) {
            this.importTaxRate = importTaxRate;
            return true;
        }
        return false;
    }
	
	public double getShippingFee() {
        return shippingFee;
    }
	
	public boolean setShippingFee(double shippingFee) {
		if(shippingFee >= 0) {
			this.shippingFee = shippingFee;
			return true;
		}
		return false;
	}
	
	@Override
    public double finalPrice() {
        return getBasePrice() + getBasePrice()*importTaxRate + shippingFee;
    }

	@Override
	public String toString() {
	    return "ID: " + getId()
	        + ", \nName: " + getName()
	        + ", \nBase Price: " + getBasePrice()
	        + ", \nImport Tax: " + importTaxRate
	        + ", \nShipping Fee: " + shippingFee
	        + ", \nFinal Price: " + finalPrice();
	}
}