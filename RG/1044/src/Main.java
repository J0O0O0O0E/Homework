/*�}Ŀ����:

дһ��ѧ������������ѧ���������������ѧ��,�����ԡ�

������Ϊ��System.out.println("Name:"+stu.name + " Age:" + stu.getAge() + " No:" + stu.no);

����Main���еĴ��붨�巽��

�������˵��:

���룺
tian 23 123
�����Name:tian Age:23 No:123

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
