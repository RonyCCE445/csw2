package assignments1;
class Laptop{
	private String model;
	private double price;
	Laptop(String model,double price){
		this.model=model;
		this.price=price;
	}
	public String getmodel() {
		return model;
	}
	public void setmodel(String model) {
		this.model=model;
	}
	public double getprice() {
		return price;
	}
	public void setprice(double price) {
		this.price=price;
	}
	public String toString() {
		return(model+" "+price+" ");
	}
}
public class q4 {

	public static void main(String[] args) {
		Laptop l1=new Laptop("Lenovo",50000);
		System.out.println("Laptop 1 = "+l1);
		l1.setmodel("Dell");
		l1.setprice(65000);
		System.out.println("Updated laptop l1 = "+l1);

	}

}
