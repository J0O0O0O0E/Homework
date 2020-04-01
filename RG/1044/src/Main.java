/*題目內容:

写一个学生类输入和输出学生的姓名，年龄和学号,并测试。

输出语句为：System.out.println("Name:"+stu.name + " Age:" + stu.getAge() + " No:" + stu.no);

根据Main类中的代码定义方法

输入输出说明:

输入：
tian 23 123
输出：Name:tian Age:23 No:123

*/
import java.util.Scanner;

class Student {
	// write your own codes
	private String name, no;
	private int age;

	public Student(String name, int age, String no) {
		super();
		this.name = name;
		this.no = no;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getNo() {
		return no;
	}

	public int getAge() {
		return age;
	}

}

public class Main {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		Student stu = new Student(sca.next(), sca.nextInt(), sca.next());
		System.out.println("Name:" + stu.getName() + " Age:" + stu.getAge() + " No:" + stu.getNo());
	}
}
