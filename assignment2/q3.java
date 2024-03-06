package assignment2;

import java.util.Objects;

class car{
	private String Model;
	private String color;
	private double speed;
	car(String Model,String color,double speed){
		this.Model=Model;
		this.color=color;
		this.speed=speed;
		
	}
	@Override
	public String toString() {
		return "car [Model=" +Model + ", color=" + color + ", speed(in m/s)=" + speed + " ]";
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String Model) {
		this.Model=Model;
	}
	public String getcolor() {
		return color;
	}
	public void setcolor(String color) {
		this.color=color;
	}
	public double getspeed() {
		return speed;
		
	}
	public void setspeed(double speed) {
		this.speed=speed;
	}
	public int hashcode() {
		return Objects.hash(Model,color,speed);
		
		
	}
		
		@Override
		public boolean equals(Object o) {
			
			if(o instanceof car) {
				if(o==null)
					return false;
				if(o==this) {
					return true;
				}
				car o1=(car)o;
				if(o1.speed==this.speed) {
					return true;
				}
				else {
					return false;
				}
				
			}return false;
		}
		public void compareTo(car o) {
			if(this.equals(0))
				System.out.println("Equal speed");
				else if(this.speed<o.speed)
					System.out.println("It has less speeed than "+this.Model);
				else 
					System.out.println("It has more speed than "+this.Model);
		}
	}
public class q3 {

	public static void main(String[] args) {
		car b1=new car("Honda","red",60);
		car b2=new car("Toyota","white",45);
		System.out.println(b1);
		System.out.println(b2);
		b1.compareTo(b2);
	}

}
