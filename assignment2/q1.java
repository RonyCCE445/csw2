package assignment2;
class Student<T1>{
	String Name;
	T1 RollNo;
	int Age;
	Student(String Name,T1 RollNo,int Age){
		this.Name=Name;
		this.RollNo=RollNo;
		this.Age=Age;
		
	}
	void display()
{
		System.out.println("Name is: "+this.Name);
		System.out.println("Roll is: "+this.RollNo);
		System.out.println("Age is: "+this.Age);
		}
}
public class q1 {

	public static void main(String[] args) {
		Student<Integer>s1=new Student<Integer>("Rohit",20,20);
		s1.display();

	}

}
