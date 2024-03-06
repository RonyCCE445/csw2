package assignments1;

import java.awt.Point;

class point{
	int x;
	int y;
	point(int x,int y){
		this.x=x;
		this.y=y;
		
	}
	public int getx() {
		return x;
	}
	public void setx(int x) {
	this.x=x;
}
	public int gety() {
		return y;
		
	}
	public void sety(int y) {
		this.y=y;
	}
	public String toString() {
		return(x+" "+y+"");
	}
	public point(Point obj) {
		System.out.println("Copy Constructor called");
x=obj.x;
y=obj.y;
	}
}
public class q3 {

	public static void main(String[] args) {
		point p1=new point(12,23);
		p1.setx(50);
		p1.sety(30);
		System.out.println(p1);
		point p2=new point(25,56);
		point p3=p2;
		System.out.println(p3);
		

	}

}
