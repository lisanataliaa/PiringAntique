package model;

public abstract class Plates {
	// Tentuin atribut parent class
	private Integer price;
	private String color;
	
	// CONSTRUCTOR = SHIFT ALT S + O
	public Plates(Integer price, String color) {
		super();
		this.price = price;
		this.color = color;
		// TYPE gausah karena TYPE dikelompokkin lagi dan dibagi jd normal dan antique
	}
	
	
	// BUAT METHOD ini akhir" buat view plate
	public abstract void plateInfo();
	
	
	// GETTER SETTER = SHIFT ALT S + R
	// biar bisa diakses class lain
	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	

}
