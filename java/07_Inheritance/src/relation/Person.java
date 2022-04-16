package relation;

public class Person {
	protected int num;
	protected String name;
	protected String dept; // 부서, department
	protected String addr;
	
	public Person() {
		System.out.println("This is Person Instance");
	}
	
	public void printInfo() {
		System.out.println("num : "+ num);
		System.out.println("name : "+ name);
		System.out.println("dept : "+ dept);
		System.out.println("addr : "+ addr);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
