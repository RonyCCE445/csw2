package a2q4;

public class q4 {

	public static Student linSearch(Student[] stnds, Student trgt) {
        for (int i = 0; i < stnds.length; i++) {
            if (stnds[i].compareTo(trgt) == 0) {
                return stnds[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Student[] stnds = new Student[5];
        stnds[0] = new Student("Bush", 1, 90);
        stnds[1] = new Student("Robert", 2, 80);
        stnds[2] = new Student("Rony", 3, 85);
        stnds[3] = new Student("John", 4, 95);
        stnds[4] = new Student("Holmes", 5, 75);

        Student trgt = new Student("Rony", 3, 85);

        Student result = linSearch(stnds, trgt);

        if (result != null) {
            System.out.println("Student found: " + result);
        } else {
            System.out.println("Student not found");
        }
    }

}

class Student implements Comparable<Student> {
    private String name;
    private int rn;
    private int totalMark;


    public Student(String name, int rn, int totalMark) {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRn() {
        return rn;
    }

    public void setRn(int rn) {
        this.rn = rn;
    }

    public int getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(int totalMark) {
        this.totalMark = totalMark;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rn=" + rn + ", totalMark=" + totalMark + "]";
    }

    @Override
    public int compareTo(Student other) {
        if (this.totalMark > other.totalMark) {
            return 1;
        }else if (this.totalMark < other.totalMark) {
            return -1;
        } else {
            return 0;
        }
    }
}