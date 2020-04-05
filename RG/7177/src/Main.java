import java.util.Scanner;

/*�}Ŀ����:

����Animal(����)�ࣺMouse,dog�ȵ�һ���̳зּ��ṹ.�ڸ������ṩ����������Animal�ķ���,���������и�������,�Ӷ����ݲ�ͬ���͵�Animal��ȡ��ͬ���ж�

Anima�������·���:

public void speak();

�������˵��:

���룺
Tom Jerry
�����
Tom�Ľ���Ϊ����
Jerry�Ľ���Ϊ֨֨

*/
abstract class Animal{
	String name;
	
	public Animal(String name) {
		super();
		this.name = name;
	}

	abstract void speak();
}
class Mouse extends Animal{
	public Mouse(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void speak() {
		// TODO Auto-generated method stub
		System.out.println(super.name+"�Ľ���Ϊ֨֨");
	}
}
class Cat extends Animal{
	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void speak() {
		// TODO Auto-generated method stub
		System.out.println(super.name+"�Ľ���Ϊ����");
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		(new Cat(in.next())).speak();
		(new Mouse(in.next())).speak();
	}
}