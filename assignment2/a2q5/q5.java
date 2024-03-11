package a2q5;



public class q5 {
public static void BSort(Student[]stdnt) {
	for(int j=stdnt.length-1;j>0;j--) {
		for(int n=0;n<j;n++) {
			if( stdnt[n].compareTo(stdnt[n+1])>0) {
				Student temp=stdnt[n];
				stdnt[n]=stdnt[n+1];
				stdnt[n+1]=temp;
		}
		
			
		}
		
	}
}
public static void main(String[] args) {
    Student[] stdnt = new Student[5];
    stdnt[0] = new Student("Bush", 1, 90);
    stdnt[1] = new Student("Robert", 2, 80);
    stdnt[2] = new Student("Rony", 3, 85);
    stdnt[3] = new Student("John", 4, 95);
    stdnt[4] = new Student("Holmes", 5, 75);

    System.out.println("BEfore performing the sorting operation: ");
    for(int k=0;k<stdnt.length;k++) {
    	System.out.println(stdnt[k]+" ");
    	
    }BSort(stdnt);
    	
    System.out.println("After performing the sorting algorithm: ");
    for(int k=0;k<stdnt.length;k++) {
    	System.out.println(stdnt[k]+" ");
    }
}


}
class Student implements Comparable<Student>{
	private String nme;
	private int rn;
	private int totMrks;
	public Student(String nme,int rn,int totMrks) {
		this.nme=nme;
		this.rn=rn;
		this.totMrks=totMrks;
	}public String getnme() {
		return nme;
	}
	public void setnme(String nme) {
		this.nme=nme;
	}
	public int getrn() {
		return rn;
	}
	public void setrn(int rn) {
		this.rn=rn;
	}
	public int gettotMrks() {
		return totMrks;
	}
	public void settype(int totMrks) {
		this.totMrks=totMrks;
	}
	public String toString() {
		return "Animal [name of the Student= "+nme+",Color of the animal= "+rn+"Type of the animal="+totMrks+"]";
	}
	public int compareTo(Student o) {
		if(this.rn>o.rn) {
			return 1;
		}
		else if(this.rn<o.rn) {
			return -1;
		}
		else {
		return 0;
	}
}}

