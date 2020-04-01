
/*�}Ŀ����:

���һ������������ģ��������ϣ��ģ��������ģ����ද��Ľ�����Ҫ�����£�

1 ��д������Animal

Animal��������2�����󷽷�cry()��getAnimaName()����Ҫ����־���Ķ�������Լ��Ľ������������ơ�

2��дģ������Simulator

������һ��playSound(Animal animal)�������÷����Ĳ�����Animal���͡�������animal���Ե���Animal��������д��cry()�������ž��嶯�������������������д��getAnimalName()������ʾ������������ơ�

3��дAnimal������ࣺDog��Cat��

4��д����Main���û�����

������Main��main���������ٰ������´��룺

Simulator simulator = new Simulator();




�������˵��:

���룺dog
��������ڲ��Ź��������:����...����
���룺cat
��������ڲ���è�������:����...����

*/
//start
import java.util.*;

abstract class Animal {
	public abstract String cry();

	public abstract String getAnimalName();
}

class Simulator {

	public void playSound(Animal animal) {
		System.out.println("���ڲ���" + animal.getAnimalName() + "������:" + animal.cry());
	}
}

class Dog extends Animal {
	@Override
	public String getAnimalName() {
		return "����";
	}

	@Override
	public String cry() {
		// TODO Auto-generated method stub
		return "����...����";
	}
}

class Cat extends Animal {
	@Override
	public String getAnimalName() {
		return "è��";
	}

	@Override
	public String cry() {
		// TODO Auto-generated method stub
		return "����...����";
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
