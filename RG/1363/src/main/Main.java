/*題目內容:

1.设计一个汽车类Vehicle，包含的数据成员有车轮个数wheels和车重weight。

2.小车类Car是它的公有派生类其中包含载人passenger。

3.卡车类Truck是Vehicle的公有派生类其中包含载人数passenger和载重量pay。

4.每个类都有相关数据的输出函数,用以测试构造函数调用顺序，以及成员变量初始化及数据输出等。
输入输出说明:

输入：
8 5
4 1 5
6 8 2 10
输出：
car:
Manned number:8 Bit
Capacity:5.0 Tons
a car:
Manned number:4 Bit
Capacity:1.0 Tons
Manned number:5 Bit
truck:
Manned number:6 Bit
Capacity:8.0 Tons
Manned number:2 Bit
Capacity:10.0 Tons

*/
package main;

import java.util.Scanner;

class Vehicle { // 汽车类
	// write your own codes
	int wh;
	float we;

	public Vehicle(int a, float b) {
		this.wh = a;
		this.we = b;
	}

	public void show() {
		System.out.println("car:");
	}

	public void print() {
		System.out.println("Manned number:" + wh + " Bit");
		System.out.println("Capacity:" + we + " Tons");
	}
}

class Car extends Vehicle {// 小车类
	// write your own codes
	int pa;

	public Car(int wh, float we, int pa) {
		super(wh, we);
		this.pa = pa;
		// TODO Auto-generated constructor stub
	}

	public void print() {
		System.out.println("a car:");
		super.print();
		System.out.println("Manned number:" + pa + " Bit");
	}

}

class Truck extends Vehicle {// 卡车类
	// write your own codes

	float pay;
	int pa;

	public Truck(int wh, float we, int pa, float pay) {
		super(wh, we);
		this.pa = pa;
		this.pay = pay;
		// TODO Auto-generated constructor stub
	}

	public void print() {
		System.out.println("truck:");
		super.print();
		System.out.println("Manned number:" + pa + " Bit");
		System.out.println("Capacity:" + pay + " Tons");
	}

}

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int v1 = scan.nextInt();
		int v2 = scan.nextInt();

		int c1 = scan.nextInt();
		int c2 = scan.nextInt();
		int c3 = scan.nextInt();

		int t1 = scan.nextInt();
		int t2 = scan.nextInt();
		int t3 = scan.nextInt();
		int t4 = scan.nextInt();

		Vehicle ve1 = new Vehicle(v1, v2);
		ve1.show();
		ve1.print();
		Car car1 = new Car(c1, c2, c3);
		car1.print();
		Truck tr1 = new Truck(t1, t2, t3, t4);
		tr1.print();
	}

}
