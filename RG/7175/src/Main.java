
/*�}Ŀ����:

ʹ�ýӿڻ��߳������д����ʵ����ʾԱ��������Ϣ������Ҫ�����£�
��1��ʹ�ýӿڻ��߳�����ʵ�ֻ���Employer�����ӿںͳ�����Ĳ�ͬ�����������������ź͹����������ԣ���ʾ���ʵķ���showSalary��������ʾ����ĳ��󷽷�showBonus��������ʾ����ÿλְ������ͬ��showBonus������������Ϊ���󷽷���ֻ�����壬������ʵ�֣�

��2������BasicEmployee��GoodEmployee�࣬��дEmployer���еķ�������ͬԱ���в�ͬ�Ĺ��ʺͽ���

��3������������в��ԣ�Ҫ������������ͬ��Ա����Ϣ��������������Ϣ��

�������˵��:

���룺
���� ǰ̨ 5000
���� ���� 6000 4000
�����
�ҽ�����,��ǰ̨���ţ��ҵĹ�����5000.0
������ͨԱ����û�н��𣬼���������
�ҽ�����,�ڿ������ţ��ҵĹ�����6000.0
��������Ա�����ҵĽ�����4000.0

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
		return "\n������ͨԱ����û�н��𣬼���������";
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
		return "\n��������Ա�����ҵĽ�����" + showBonus();
	}

}

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BasicEmployee a = new BasicEmployee(in.next(), in.next(), in.nextDouble());
		GoodEmployee b = new GoodEmployee(in.next(), in.next(), in.nextDouble(), in.nextDouble());
		System.out.println(
				"�ҽ�" + a.getName() + ",��" + a.getDepartment() + "����" + "���ҵĹ�����" + a.showSalary() + a.announce());
		System.out.println(
				"�ҽ�" + b.getName() + ",��" + b.getDepartment() + "����" + "���ҵĹ�����" + b.showSalary() + b.announce());
	}
}
