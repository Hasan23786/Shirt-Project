package shirt_project;
public class Shirt {
	String name;
	int size;
	double price;
	String color;
	public Shirt() {
		// TODO Auto-generated constructor stub
	}
	Shirt(String name, int size, double price, String color)
	{
		this.name=name;
		this.size=size;
		this.price=price;
		this.color=color;
	}
	public String toString()
	{
		return "Name: "+name+" Size: "+size+" Price: "+price+" Color: "+color;
	}
	

}
