package model;

public class AntiquePlate extends Plates{
	
	private String manufacturer;

	// BUAT CONSTRUCTOR --> ambil dari punya parent
	public AntiquePlate(Integer price, String color, String manufacturer) {
		super(price, color);
		this.manufacturer = manufacturer;
	}
	
	// ketik pla udh auto complet platinfo
	@Override
	public void plateInfo() {
		System.out.println("Price: " + getPrice() + " Manufacturer: " + getManufacturer());
	}

	// GETTER SETTER
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	

}
