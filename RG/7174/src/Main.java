import java.util.Scanner;

/*題目內容:

编写一个制造各种车辆的程序。包含三个类，具体要求如下：
（1）基类Vehicle，包含轮子数和汽车自身重量两个属性,一个两参数的构造方法，一个显示汽车信息的方法；
（2）小轿车类Car，增加载客数属性，重写构造方法和显示车辆信息的成员方法；
（3）卡车类Truck，增加载客数和载货量属性，重写构造方法和显示车辆信息的成员方法；
（4）主程序类，要求输入各种车辆的信息，并在控制台输出各种车辆信息。

输入输出说明:

输入：
16 5.4 4 1.5 5 6 4 4 10
输出：
汽车:
轮子数:16个
自身重量:5.4吨
小轿车:
轮子数:4个
自身重量:1.5吨
额定乘客数:5人
卡车:
轮子数:6个
自身重量:4.0吨
额定乘客数4人
载重量10.0吨

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
		System.out.println("汽车:\n轮子数:" + wheel + "个\n" + "自身重量:" + weight + "吨");
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
		System.out.println("小轿车:\n轮子数:" + wheel + "个\n" + "自身重量:" + weight + "吨\n" + "额定乘客数:" + passenger + "人");
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
		System.out.println("卡车:\n轮子数:" + wheel + "个\n" + "自身重量:" + weight + "吨\n" + "额定乘客数" + passenger + "人\n" + "载重量"
				+ cap + "吨");
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
