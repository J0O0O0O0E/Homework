
/*�}Ŀ����:

��дһ��Dog�࣬���е�˽�г�Ա������name��color��age����ʹ��get��set��������˽�б�����Dog����޲ι��췽����name=dog1,color=white,age=1���вι��췽��name,color,age�Ӽ��������롣���������У�����dog1�����޲ι��췽����dog2Ϊ�вι��췽����������Ϊ��System.out.println("name=" + d1.getName() + ",color=" +d1.getcolor()+",age="+d1.getAge());
�������˵��:

���룺
peter
red
6
�����
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