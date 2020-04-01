
/*題目內容:

编写一个Dog类，其中的私有成员包括，name，color，age。请使用get，set方法访问私有变量。Dog类的无参构造方法，name=dog1,color=white,age=1。有参构造方法name,color,age从键盘上输入。请在主类中，创建dog1，用无参构造方法，dog2为有参构造方法。输出语句为：System.out.println("name=" + d1.getName() + ",color=" +d1.getcolor()+",age="+d1.getAge());
输入输出说明:

输入：
peter
red
6
输出：
name=dog1,color=white,age=1
name=peter,color=red,age=6

*/
import java.util.Scanner;

class Dog {
	private String name = "dog1", color = "white";
	private int age = 1;

	public Dog() {
		super();
	}

	public Dog(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class Main {
	public static void main(String[] args) {
		// write code here
		Scanner in = new Scanner(System.in);
		Dog d1 = new Dog();
		Dog d2 = new Dog(in.next(), in.next(), in.nextInt());
		System.out.println("name=" + d1.getName() + ",color=" + d1.getColor() + ",age=" + d1.getAge());
		System.out.println("name=" + d2.getName() + ",color=" + d2.getColor() + ",age=" + d2.getAge());

	}

}