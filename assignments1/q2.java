package assignments1;
class Rectangle{
	private double width;
	private double length;
	Rectangle(double width,double length){
		this.width=width;
		this.length=length;
		
	}
	public double getwidth() {
		return width;
		
	}
	public void setwidth(double width) {
		this.width=width;
	}
	public double getlength() {
		return length;
	}
	public void setlength(double length) {
		this.length=length;
	}
	public void area() {
		System.out.println("The Area is "+0.5*(length*width));
	}
	public void perimeter() {
		System.out.println("The perimeter is "+2*(length+width));
	}
	public String toString() {
		return(width+" "+length+" ");
	}
}
public class q2 {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle(110,140);
		Rectangle r2=new Rectangle(130,150);
		System.out.println("For Rectangle 1:- ");
		r1.area();
		r1.perimeter();
		r2.area();
		r2.perimeter();
		

	}

}
