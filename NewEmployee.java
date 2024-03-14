package day12.collection;

public class NewEmployee {
	private int eno;
	private String ename;
	private double sal;
	private int age;
	public NewEmployee() {}
	public NewEmployee(int eno, String ename, double sal, int age) {
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		this.age = age;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "NewEmployee [eno=" + eno + ", ename=" + ename + ", sal=" + sal + ", age=" + age + "]";
	}
	
}
