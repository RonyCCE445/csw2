package assignment2;

public class q6 {

	public static void main(String[] args) {
		Anml anm1= new Anml("Cat","grey","pet");
		Anml anm2= new Anml("Lion","White","Wild");
		Anml anm3= new Anml("Dog","golden","pet");
		Anml anm4= new Anml("Lynx","Brown","Wild");
		
		System.out.println(anm1+" bearing hash code= "+anm1.hashcode());
		System.out.println(anm2+" bearing hash code= "+anm2.hashcode());
		System.out.println(anm3+" bearing hash code= "+anm3.hashcode());
		System.out.println(anm4+" bearing hash code= "+anm4.hashcode());

	}

}

class Anml{
	private String nme;
	private String clr;
	private String type;
	 
	public Anml(String nme, String clr,String type) {
		this.nme=nme;
		this.clr=clr;
		this.type=type;
		
	}
	public String getnme() {
		return nme;
	}
	public void setnme(String nme) {
		this.nme=nme;
	}
	public String getclr() {
		return clr;
	}
	public void setclr(String clr) {
		this.clr=clr;
	}
	public String gettype() {
		return type;
	}
	public void settype(String type) {
		this.type=type;
	}
	public String toString() {
		return "Animal [name of the animal= "+nme+",Color of the animal= "+clr+"Type of the animal="+type+"]";
	}
	public int hashcode() {
		int rst=0;
	
			rst=rst+((clr==null)?0: clr.hashCode());
			rst=rst+((nme==null)?0: nme.hashCode());
			rst=rst+((type==null)?0: type.hashCode());
			return rst;
	}
}
