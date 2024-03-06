package assignment2;

import java.util.Objects;

class book{
	private String bookid;
	private String bookname;
	private double price;
	book(String bookid,String bookname,double price){
		this.bookid=bookid;
		this.bookname=bookname;
		this.price=price;
		
	}
	@Override
	public String toString() {
		return "book [bookid=" + bookid + ", bookname=" + bookname + ", price=" + price + " ]";
	}
	public String getbookid() {
		return bookid;
		
		
	}
	public void setbookid(String bookid) {
		this.bookid=bookid;
	}
	public String getbookname() {
		return bookname;
	}
	public void setbookname(String bookname) {
		this.bookname=bookname;
	}
	public double getprice() {
		return price;
	}
	public void setprice(double price) {
		this.price=price;
	}
public int hashcode() {
	return Objects.hash(bookid,bookname,price);
	
	
}
	
	@Override
	public boolean equals(Object o) {
		
		if(o instanceof book) {
			if(o==null)
				return false;
			if(o==this) {
				return true;
			}
			book o1=(book)o;
			if(o1.price==this.price) {
				return true;
			}
			else {
				return false;
			}
			
		}return false;
	}
	public void compareTo(book o) {
		if(this.equals(0))
			System.out.println("Equal price");
			else if(this.price<o.price)
				System.out.println("It has less price");
			else 
				System.out.println("It has more price");
	}
	
	
}
public class q2 {

	public static void main(String[] args) {
		book b1=new book("RN0EXTN345I09","Existentialism",30.44);
		book b2=new book("EN0WRNL352I87","War",1580.25);
		System.out.println(b1);
		System.out.println(b2);
		b1.compareTo(b2);

	}

}
