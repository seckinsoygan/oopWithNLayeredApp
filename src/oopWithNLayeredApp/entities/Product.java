package oopWithNLayeredApp.entities;

public class Product {
	private int Id;
	private String Name;
	private double UnitPrice;
	
	public Product() {
		
	}
	
	public Product(int id, String name, double unitPrice) {
		Id = id;
		Name = name;
		UnitPrice = unitPrice;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getUnitPrice() {
		return UnitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		UnitPrice = unitPrice;
	}

	
	

}
