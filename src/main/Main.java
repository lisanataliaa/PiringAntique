package main;

import java.util.ArrayList;
import java.util.Scanner;

import model.AntiquePlate;
import model.NormalPlate;
import model.Plates;

// INHERITANCE
//Superclass : plates
//Subclass : normal & antique

public class Main {
	Scanner sc = new Scanner(System.in);
	// plates diauto complete
	ArrayList<Plates> plateList = new ArrayList<>();
	
	
	
	// CODING BIAR RAPI PAKE METHOD
//	1234 --> DIJADIIN METHOD
	
	public void printMenu() {
		System.out.println("pIRing"); // ini gawajib ditulis
		System.out.println("________"); // ini gawajib ditulis
		System.out.println("1. Insert Plate");
		System.out.println("2. Sell Plates");
		System.out.println("3. View Plates");
		System.out.println("4. EXIT");
		System.out.println(">>");
	}
	
	
	// method ini sebelum public main
	public void insertPlate() {
		Integer price = 0;
		String color = "";
		String type = "";
		String materialType = "";
		String manufacturer = "";
		
		do {
			System.out.print("Input price [2000 - 5000000]: ");
			try {
				price = sc.nextInt(); sc.nextLine();
			} catch (Exception e) {
				System.out.println("Price must be integer");
			}
		} while (price < 2000 || price > 5000000);
		// atau (!(price >= 2000 && price <= 5000000))
		
	
	
	do {
		System.out.print("Input color : ");
		try {
			color = sc.nextLine();
		} catch (Exception e) {
			System.out.println("Color must be string");
		}
	} while (color.isEmpty());
	
	
	do {
		System.out.print("Input type ['Normal' | 'Antique'] : ");
		try {
			type = sc.nextLine();
		} catch (Exception e) {
			System.out.println("Type must be string");
		}
	} while (!(type.equals("Normal") || type.equals("Antique")));


	if(type.equals("Normal")) {
		do {
			System.out.print("Input material type : ");
			try {
				materialType = sc.nextLine();
			} catch (Exception e) {
				System.out.println("Material type must be string");
			}
		} while (materialType.isEmpty());
		
		NormalPlate plate = new NormalPlate(price, color, materialType);
		plateList.add(plate);
		
	} else {
		do {
			System.out.print("Input manufacturer : ");
			try {
				manufacturer = sc.nextLine();
			} catch (Exception e) {
				System.out.println("Manufacturer type must be string");
			}
		} while (manufacturer.isEmpty());
		
		AntiquePlate plate = new AntiquePlate(price, color, manufacturer);
		plateList.add(plate);
	}
}
	
	
	private void viewPlates() {
		System.out.println();
		// foreach buat ngeliat piring itu satu"
		// ngambil platelist buat ditambpung ke plate
		
		if (plateList.isEmpty()) {
			System.out.println("You have no plates");
			System.out.println("Press ENTER to continue");
			sc.nextLine();
			return;
		}
		for (Plates plates : plateList) {
			plates.plateInfo();
		}
		System.out.println();
	}
	

	private void sellPlates() {
		System.out.println();
		// foreach buat ngeliat piring itu satu"
		// ngambil platelist buat ditambpung ke plate
		
		if (plateList.isEmpty()) {
			System.out.println("You have no plates");
			System.out.println("Press ENTER to continue");
			sc.nextLine();
			return;
		}
		
		Integer plateIndex = 1; // artinya mulai dari 1
		
		for (Plates plates : plateList) {
			System.out.println(plateIndex + ". ");
			plates.plateInfo();
			plateIndex++;
		}
		System.out.println();
		
		do {
			System.out.println("Select index to be sold: ");
			plateIndex = sc.nextInt();
		} while (!(plateIndex >= 1 && plateIndex <= plateList.size()));
		
		Integer quantity = 0;
		System.out.println("Quantity: ");
		quantity = sc.nextInt(); sc.nextLine();
		
		
		// TAMPUNG PIRING YG DIPILIH
		// import platesnya
		Plates selectedPlate = plateList.get(plateIndex - 1); // karena mulai dari 1
		if (selectedPlate instanceof NormalPlate) {
			NormalPlate plate = (NormalPlate)selectedPlate; // dicasting
			plate.plateInfo(quantity);
		} else if (selectedPlate instanceof AntiquePlate){
			
		}
	
	}
	
	
	
	
	public Main() {
		// menuselection = CHOOSE
		// KALO ATRIBUT GAUSA = 0
		
		int menuSelection = 0;
		// MENU LOGIC
		do {
			try {
				printMenu();
				menuSelection = sc.nextInt(); 
			} catch (Exception e) { // ini BUAT KALO EROR
				System.out.println("Input must be integer");
			}
			sc.nextLine(); // ini diluar try catch
			
			switch (menuSelection) {
			case 1:
				insertPlate();
				break;
			case 2:
				viewPlates();
				break;
			case 3:
				sellPlates();
				break;
			case 4:
				
				break;
			default:
				break;
			}
			
		} while (menuSelection !=5 );
		
	}

	public static void main(String[] args) {
		new Main();

	}
	
	


}
