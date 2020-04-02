
/*題目內容:

现定义一个类体系，基类为Dog，派生类为斑点狗SpottedDog类和非斑点狗UnspottedDog类，具体要求如下：

（1）在基类中记录狗的品种breed，体重weight以及颜色color等属性，定义一个方法show()显示Dog信息；

（2）在UnspottedDog类中，调用Dog类的构造方法，重写show()方法，只显示狗的品种；

（3）在SpottedDog类中，新增表示斑点颜色的spotColor属性，定义包含四个属性的构造方法，重写show（）方法；

（4）定义测试类，构造斑点狗对象，分别显示斑点狗的品种、体重、颜色和品种、颜色、斑点颜色；构造非斑点狗对象，显示狗的品种、体重、颜色信息。

（说明：构造斑点狗对象和非斑点狗对象时要分别输入，各属性值之间用空格分割，输入完后按回车键确认，输入内容参照测试数据。）

输入输出说明:

输入：
金毛 10 red white
泰迪 5 black
输出：
这是一只金毛体重为10,颜色为red
这是一只金毛,颜色为red,斑点颜色为white
这是一只泰迪犬

*/
import java.util.*;

class Dog {
	protected String breed;
	protected String color;
	protected int weight;

	public Dog(String breed, int weight, String color) {
		super();
		this.breed = breed;
		this.color = color;
		this.weight = weight;
	}

	public void show() {

	}
}

class UnspottedDog extends Dog {

	public UnspottedDog(String breed, int weight, String color) {
		super(breed, weight, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("这是一只" + super.breed + "犬");
	}
}

class SpottedDog extends Dog {
	private String spotColor;

	public SpottedDog(String breed, int weight, String color, String spotColor) {
		super(breed, weight, color);
		this.spotColor = spotColor;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("这是一只" + super.breed + "体重为" + super.weight + ",颜色为" + super.color);
		System.out.println("这是一只" + super.breed + ",颜色为" + super.color + ",斑点颜色为" + spotColor);
	}

}

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		SpottedDog b = new SpottedDog(in.next(), in.nextInt(), in.next(), in.next());
		UnspottedDog a = new UnspottedDog(in.next(), in.nextInt(), in.next());
		b.show();
		a.show();
	}
}
