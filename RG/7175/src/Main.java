
/*題目內容:

使用接口或者抽象类编写程序实现显示员工基本信息。具体要求如下：
（1）使用接口或者抽象类实现基类Employer（体会接口和抽象类的不同），包含姓名、部门和工资三个属性，显示工资的方法showSalary（）和显示奖金的抽象方法showBonus（）；提示：因每位职工奖金不同，showBonus（）方法定义为抽象方法，只抽象定义，不具体实现；

（2）定义BasicEmployee和GoodEmployee类，重写Employer类中的方法，不同员工有不同的工资和奖金；

（3）定义主类进行测试，要求输入两个不同的员工信息，并输出其个人信息。

输入输出说明:

输入：
张三 前台 5000
李四 开发 6000 4000
输出：
我叫张三,在前台部门，我的工资是5000.0
我是普通员工，没有奖金，加油升级！
我叫李四,在开发部门，我的工资是6000.0
我是优秀员工，我的奖金是4000.0

*/
import java.util.Scanner;

abstract class Employer {
	String name, department;
	double salary, bonus;

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public Employer() {
		super();
	}

	public Employer(String name, String department, double salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public Employer(String name, String department, double salary, double bonus) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.bonus = bonus;
	}

	public double showSalary() {
		return salary;
	}

	public abstract double showBonus();

	public abstract String announce();
}

class BasicEmployee extends Employer {

	public BasicEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BasicEmployee(String name, String department, double salary) {
		super(name, department, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double showSalary() {
		// TODO Auto-generated method stub
		return super.showSalary();
	}

	@Override
	public double showBonus() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public String getDepartment() {
		// TODO Auto-generated method stub
		return super.getDepartment();
	}

	public String announce() {
		return "\n我是普通员工，没有奖金，加油升级！";
	}
}

class GoodEmployee extends Employer {

	public GoodEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoodEmployee(String name, String department, double salary, double bonus) {
		super(name, department, salary, bonus);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double showSalary() {
		// TODO Auto-generated method stub
		return super.showSalary();
	}

	@Override
	public double showBonus() {
		// TODO Auto-generated method stub
		return super.bonus;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public String getDepartment() {
		// TODO Auto-generated method stub
		return super.getDepartment();
	}

	@Override
	public String announce() {
		// TODO Auto-generated method stub
		return "\n我是优秀员工，我的奖金是" + showBonus();
	}

}

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BasicEmployee a = new BasicEmployee(in.next(), in.next(), in.nextDouble());
		GoodEmployee b = new GoodEmployee(in.next(), in.next(), in.nextDouble(), in.nextDouble());
		System.out.println(
				"我叫" + a.getName() + ",在" + a.getDepartment() + "部门" + "，我的工资是" + a.showSalary() + a.announce());
		System.out.println(
				"我叫" + b.getName() + ",在" + b.getDepartment() + "部门" + "，我的工资是" + b.showSalary() + b.announce());
	}
}
