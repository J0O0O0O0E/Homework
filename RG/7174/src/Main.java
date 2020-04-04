import java.util.Scanner;

/*�}Ŀ����:

��дһ��������ֳ����ĳ��򡣰��������࣬����Ҫ�����£�
��1������Vehicle����������������������������������,һ���������Ĺ��췽����һ����ʾ������Ϣ�ķ�����
��2��С�γ���Car�������ؿ������ԣ���д���췽������ʾ������Ϣ�ĳ�Ա������
��3��������Truck�������ؿ������ػ������ԣ���д���췽������ʾ������Ϣ�ĳ�Ա������
��4���������࣬Ҫ��������ֳ�������Ϣ�����ڿ���̨������ֳ�����Ϣ��

�������˵��:

���룺
16 5.4 4 1.5 5 6 4 4 10
�����
����:
������:16��
��������:5.4��
С�γ�:
������:4��
��������:1.5��
��˿���:5��
����:
������:6��
��������:4.0��
��˿���4��
������10.0��

*/
class Vehicle {
	protected int wheel;
	protected double weight;

	public Vehicle(int wheel, double weight) {
		super();
		this.wheel = wheel;
		this.weight = weight;
	}

	public void info() {
		System.out.println("����:\n������:" + wheel + "��\n" + "��������:" + weight + "��");
	}
}

class Car extends Vehicle {
	private int passenger;

	public Car(int wheel, double weight, int passenger) {
		super(wheel, weight);
		// TODO Auto-generated constructor stub
		this.passenger = passenger;
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("С�γ�:\n������:" + wheel + "��\n" + "��������:" + weight + "��\n" + "��˿���:" + passenger + "��");
	}

}

class Truck extends Vehicle {
	private int passenger;
	private double cap;

	public Truck(int wheel, double weight, int passenger, double cap) {
		super(wheel, weight);
		// TODO Auto-generated constructor stub
		this.passenger = passenger;
		this.cap = cap;
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("����:\n������:" + wheel + "��\n" + "��������:" + weight + "��\n" + "��˿���" + passenger + "��\n" + "������"
				+ cap + "��");
	}

}

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		(new Vehicle(in.nextInt(), in.nextDouble())).info();
		(new Car(in.nextInt(), in.nextDouble(), in.nextInt())).info();
		(new Truck(in.nextInt(), in.nextDouble(), in.nextInt(), in.nextDouble())).info();
	}
}
