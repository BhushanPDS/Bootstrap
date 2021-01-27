package day2;

public class Constructorchainig {
	public static void main(String[] args) {
		Constructorchainig obj = new Constructorchainig(1, "amit", 233);
		obj.printdata();

	}

	int x = 20;
	int empid;
	String ename;
	int salary;

	public Constructorchainig() {

	}

	public Constructorchainig(int empid, String ename) {
		this.empid = empid;
		this.ename = ename;
	}

	public Constructorchainig(int empid, String ename, int salary) {
		this(2, "sunil");
		this.salary = salary;

	}

	public void printdata() {
		int x = 10;

		System.out.println("ID:" + empid);
		System.out.println("name :" + ename);
		System.out.println("salary:" + salary);
	}
}
