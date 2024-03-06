package assignments1;
abstract class LibraryResource{
	private String title;
	private String author;
	LibraryResource(String title,String author){
		this.title=title;
		this.author=author;
		
	}public String gettitle() {
		return title;
	}
	public void settitle(String title) {
		this.title=title;
	}
	public String getauthor() {
		return author;
	}
	public void setauthor(String author) {
		this.author=author;
	}
	
	abstract void displaydetails();
		
	
	public String toString() {
		return(title+" "+author+" ");
	}
	
}
class book extends LibraryResource{
	int pagecount;
	book(int pagecount,String title,String author){
		super(title,author);
		this.pagecount=pagecount;
	}
	public int getpagecount() {
		return pagecount;
	}
	public void settitle(int pagecount) {
		this.pagecount=pagecount;
	}
	void displaydetails() {
		System.out.println("Type:Book");
		System.out.println("Title of the book is : "+gettitle());
		System.out.println("Author of the book is : "+getauthor());
		System.out.println("PAgecount of the book is : "+pagecount);
	}
	}
class magazine extends LibraryResource{
	 String issuedate;
	magazine(String issuedate,String title,String author){
		super(title,author);
		this.issuedate=issuedate;
	}
	public String getissuedate() {
		return issuedate;
	}
	public void setissuedate(String issuedate) {
		this.issuedate=issuedate;
	}
	void displaydetails() {
		System.out.println("Type:Magazine");
		System.out.println("Title of the book is : "+gettitle());
		System.out.println("Author of the book is : "+getauthor());
		System.out.println("issuedate of the book is : "+issuedate);
	}
	
}
class DVD extends LibraryResource{
	private double duration;
	DVD(double duration,String title,String author){
		super(title,author);
		this.duration=duration;
	}
	public double getduration() {
		return duration;
	}
	public void setissuedate(double duration) {
		this.duration=duration;
	}
	void displaydetails() {
		System.out.println("Type:DVD");
	
		System.out.println("Title of the DVD is : "+gettitle());
		System.out.println("Author of the DVD is : "+getauthor());
		System.out.println("duration of the DVD is : "+duration);
	}
public class q6 {

	public static void main(String[] args) {
		
book b1=new book(185,"Strange case of Dr.Jekyll & MR.Hyde","R.L.Stevenson");
b1.displaydetails();
System.out.println();
magazine m1=new magazine("22.01.2024","Art of War","Shing Chen");
m1.displaydetails();
System.out.println();
book b2=new book(185,"White Nights","Fyodore Dostoevesky");
b2.displaydetails();
System.out.println();
magazine m2=new magazine("22.01.2024","breaking of covid","James Fobert");
m2.displaydetails();
System.out.println();
DVD d1=new DVD(2.33,"KIllers of the flower moon","M.Scorcesse");
d1.displaydetails();
System.out.println();
DVD d2=new DVD(2.33,"Into thew wild","Sean Penn,Eddie Vedder");
d2.displaydetails();
System.out.println();


	}}}


