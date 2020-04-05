import java.util.Scanner;

/*題目內容:

创建Animal(动物)类：Mouse,dog等的一个继承分级结构.在父类中提供适用于所有Animal的方法,并在子类中覆盖他们,从而根据不同类型的Animal采取不同的行动

Anima类有如下方法:

public void speak();

输入输出说明:

输入：
Tom Jerry
输出：
Tom的叫声为喵喵
Jerry的叫声为吱吱

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
		System.out.println(super.name+"的叫声为吱吱");
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
		System.out.println(super.name+"的叫声为喵喵");
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		(new Cat(in.next())).speak();
		(new Mouse(in.next())).speak();
	}
}