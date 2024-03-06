package aq8;

public class q8 {

	public static void main(String[] args) {
car c1=new car();
c1.accelerate(20.5,5.0);
c1.accelerate(50.3,25.4);
c1.brake(12,5);
Bicycle b1= new Bicycle();
b1.accelerate(30.4,25.4);
b1.brake(34.2,12.5);

	}

}
interface Vehicle{
	public void accelerate(double speed,double increment);
	public void accelerate(double speed,double increment,double duration);
	public void brake(double speed,double decrement);
}
class car implements Vehicle{
	double speed;
	public void accelerate(double speed,double increment) {
		this.speed=speed+increment;
		System.out.println("Acceleration is "+speed);
	}
	public void accelerate(double speed,double increment,double duration) {
		speed=speed+increment;
		System.out.println("Acceleration is "+speed+"In Duration "+duration);
	}
	public void brake(double speed, double decrement) {
		speed=speed-decrement;
		System.out.println("The Brake is applied at speed "+speed);
		
	}
}
class Bicycle implements Vehicle{
	double speed;
	public void accelerate(double speed,double increment) {
		this.speed=speed+increment;
		System.out.println("Acceleration is "+speed);
	}
	public void accelerate(double speed,double increment,double duration) {
		speed=speed+increment;
		System.out.println("Acceleration is "+speed+"In Duration "+duration);
	}
	public void brake(double speed, double decrement) {
		speed=speed-decrement;
		System.out.println("The Brake is applied at speed "+speed);
		
	}
}