
/*題目內容:

建立Person类，成员变量为姓名和年龄，具有构造方法、get/set方法。创建NoAgesException类，当年龄为负数或大于200岁抛出异常IllegalArgumentException，正常输出“姓名年...龄从”，键盘输入姓名和年龄建立Person对象，测试该对象。
输入输出说明:

张三 300
年龄数值非法
李四 77
李四...77

*/
import java.util.Scanner;

class NoAgesException {
	NoAgesException() {
	}

	static void triangle(Person p) throws IllegalArgumentException {
		// start
		if (p.getAge() < 0 || p.getAge() > 200) {
			throw new IllegalArgumentException();
		} else {
			System.out.println(p.getName() + "..." + p.getAge());
		}
		// end
	}
}

class Person {
	// start
	int age;
	String name;

	public Person(String name, int age) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// end
}

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Person p = new Person(s.next(), s.nextInt());
		;
		try {
			// start
			NoAgesException.triangle(p);
			// end
		} catch (IllegalArgumentException e) {
			System.out.println("年龄数值非法");
		}
	}
}