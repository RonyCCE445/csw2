package assignments1;
  class college{
	private String colgname;
	 private String colgloc;
	college(String colgname,String colgloc){
		this.colgname=colgname;
		this.colgloc=colgloc;
	}
	public String getcolgname() {
		return colgname;
	}
	public void setcolgname(String colgname) {
		this.colgname=colgname;
	}
	public String getcolgloc() {
		return colgloc;
	}
	public void setcolgloc(String colgloc) {
		this.colgloc=colgloc;
	}
	public void displaycolgeinfo() {
		System.out.println("College name = "+colgname);
		System.out.println("College Location = "+colgloc);
	}
	public String toString() {
		return(colgname);
	}
	}

class studnt{
	private int studid;
	private String studnme;
	private college colg_adm;
	studnt(int studid,String studnme,college colg_adm){
		
		this.studid=studid;
		this.studnme=studnme;
		this.colg_adm=colg_adm;
		
	}
	public void displaystudinfo() {
		System.out.println("Student Name = "+studnme);
		System.out.println("Student id = "+studid);
		System.out.println("College Name = "+colg_adm);
	}
	
	}
	


public class q5 {

	public static void main(String[] args) {
		college c1=new college("ITER","BBS");
		college c2= new college ("KIIT","Patia");
		c1.displaycolgeinfo();
		c2.displaycolgeinfo();
		studnt s1=new studnt(345,"Freddy",c1);
		studnt s2=new studnt(348,"Bush",c2);
		s1.displaystudinfo();
		s2.displaystudinfo();

	}

}
