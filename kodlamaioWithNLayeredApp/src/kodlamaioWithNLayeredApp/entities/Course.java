package kodlamaioWithNLayeredApp.entities;

public class Course {
	private int id;
	private String name;
	private String instructor;
	private String description;
	private double unitPrice;
	
	
	public Course() {
		
	}


	public Course(int id, String name, String instructor, String description, double unitPrice) {
		this.id = id;
		this.name = name;
		this.instructor = instructor;
		this.description = description;
		this.unitPrice = unitPrice;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getInstructor() {
		return instructor;
	}


	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
	
	
}
