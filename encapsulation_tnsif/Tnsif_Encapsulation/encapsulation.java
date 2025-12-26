package encapsulation_tnsif.Tnsif_Encapsulation;

public class encapsulation {

	private String name;
	private int age;
	private double cgpa;
	private long reg;
	private String sex;
	
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public double  getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public long getReg(long i) {
		return reg;
	}

	public void setReg(long reg) {
		this.reg = reg;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

@Override
	public String toString() {
		return "Verify your Details once again [name = " + name + ", age = " + age + ", cgpa = " + cgpa + ", reg no. = "+ reg + ", gender = " + sex + "]";
	}	
}
