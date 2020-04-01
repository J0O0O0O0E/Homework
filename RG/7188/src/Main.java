
/*題目內容:

定义一个学生类(Student),具有属性:名字name和年龄age，方法有构造方法、setName()方法、getName()方法、setAge()方法和getAge()方法；定义主类和main()方法，在main()方法中创建学生对象，过键盘输入其成员变量，并通过对象调用它的方法，输出学生的名字name和年龄age。

输入输出说明:

输入：林林 18
输出：该生姓名：林林,年龄：18

*/
import java.util.*;

class Student {
	String name;
	int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student a = new Student(input.next(), input.nextInt());
		System.out.println("该生姓名：" + a.getName() + ",年龄：" + a.getAge());
	}
}
