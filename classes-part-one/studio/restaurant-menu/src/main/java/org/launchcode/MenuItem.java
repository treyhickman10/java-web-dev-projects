package org.launchcode;

public class MenuItem {
	private Float price;
	private String description;
	private String category;

	public MenuItem(Float price, String description, String category) {
		this.price = price;
		this.description = description;
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}
}
