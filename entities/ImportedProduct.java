package entities;

public class ImportedProduct extends Product2 {

	private Double customsFee;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	@Override
	public String priceTag() {
		return super.getName() + " $" + String.format("%.2f", totalPrice()) + " (Customs fee: $"
				+ String.format("%.2f", customsFee) + ")";
	}

	public double totalPrice() {
		return super.getPrice() + customsFee;
	}
}
