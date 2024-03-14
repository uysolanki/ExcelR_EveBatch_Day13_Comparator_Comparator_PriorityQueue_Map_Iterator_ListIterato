package day12.collection;

public class Employee implements Comparable<Employee>{
		private int eno;
		private String ename;
		private double sal;
		private int age;
		
		public Employee() {}
		
		public Employee(int eno, String ename, double sal, int age) {
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
			return "Employee [eno=" + eno + ", ename=" + ename + ", sal=" + sal + ", age=" + age + "]";
		}

		@Override
		public int compareTo(Employee o) {
			if(this.eno==o.eno)
				return 0;
			else if(this.eno>o.eno)
				return 1;
			else
				return -1;
		}
		
		
		
		
		
}
