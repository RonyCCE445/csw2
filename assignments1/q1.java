package assignments1;
class Car{
	private String make;
	private String model;
	Car(String make,String model){
		this.make=make;
		this.model=model;
	}
	public String getmake() {
		return make;
	}
	public void setmake(String make) {
		this.make=make;
	}
	public String getmodel() {
		return model;
		
	}
	public void setmodel(String model) {
		this.model=model;
	}
	public String toString() {
		return(make+" "+model+" ");
	}
}
public class q1 {

	public static void main(String[] args) {
		Car mycar1=new Car("Mahindra","Scorpio-n");
		Car mycar2=new Car("","");
		System.out.println(mycar1);
		System.out.println(mycar2);
		mycar2.setmake("Ford");
		mycar2.setmodel("Ecosport");
		System.out.println(mycar1);
		System.out.println(mycar2);
		
		
	}

}
