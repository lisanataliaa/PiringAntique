package model;

public class NormalPlate extends Plates {
	
	private String materialType;

	// BUAT CONSTRUCTOR --> ambil dari punya parent
	public NormalPlate(Integer price, String color, String materialType) {
		super(price, color);
		this.materialType = materialType;
	}
	
	@Override
	public void plateInfo() {
		System.out.println("Price: " + getPrice() + " Material: " + getMaterialType());
	}
	
	public void plateInfo(Integer quantity) {
		System.out.println("Price: " + getPrice() + " Material: " + getMaterialType() + " Total: " + quantity * getPrice() );
	}

	// GETTER SETTER
	public String getMaterialType() {
		return materialType;
	}

	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}
	
	


}
