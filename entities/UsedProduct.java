package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product2 {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date manufactureDate;

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		return super.getName() + " (used) $" + String.format("%.2f", super.getPrice()) + " (Manufactured date: "
				+ sdf.format(manufactureDate) + ")";
	}

}