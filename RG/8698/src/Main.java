
/*題目內容:

设计一个动物声音“模拟器”，希望模拟器可以模拟许多动物的叫声。要求如下：

1 编写抽象类Animal

Animal抽象类有2个抽象方法cry()和getAnimaName()，即要求各种具体的动物给出自己的叫声和种类名称。

2编写模拟器类Simulator

该类有一个playSound(Animal animal)方法，该方法的参数是Animal类型。即参数animal可以调用Animal的子类重写的cry()方法播放具体动物的声音、调用子类重写的getAnimalName()方法显示动物种类的名称。

3编写Animal类的子类：Dog，Cat类

4编写主类Main（用户程序）

在主类Main的main方法中至少包含如下代码：

Simulator simulator = new Simulator();




输入输出说明:

输入：dog
输出：现在播放狗类的声音:汪汪...汪汪
输入：cat
输出：现在播放猫类的声音:喵喵...喵喵

*/
//start
import java.util.*;

abstract class Animal {
	public abstract String cry();

	public abstract String getAnimalName();
}

class Simulator {

	public void playSound(Animal animal) {
		System.out.println("现在播放" + animal.getAnimalName() + "的声音:" + animal.cry());
	}
}

class Dog extends Animal {
	@Override
	public String getAnimalName() {
		return "狗类";
	}

	@Override
	public String cry() {
		// TODO Auto-generated method stub
		return "汪汪...汪汪";
	}
}

class Cat extends Animal {
	@Override
	public String getAnimalName() {
		return "猫类";
	}

	@Override
	public String cry() {
		// TODO Auto-generated method stub
		return "喵喵...喵喵";
	}
}

public class Main {
//end

	public static void main(String args[]) {
		Simulator simulator = new Simulator();
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		if (a.equals("dog"))
			simulator.playSound(new Dog());
		if (a.equals("cat"))
			simulator.playSound(new Cat());
	}
}
